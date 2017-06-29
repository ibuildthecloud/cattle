package io.cattle.platform.core.cleanup;

import io.cattle.platform.archaius.util.ArchaiusUtil;
import io.cattle.platform.core.constants.VolumeConstants;
import io.cattle.platform.core.dao.AccountDao;
import io.cattle.platform.core.dao.InstanceDao;
import io.cattle.platform.core.dao.NetworkDao;
import io.cattle.platform.core.dao.ServiceDao;
import io.cattle.platform.core.dao.StoragePoolDao;
import io.cattle.platform.core.dao.VolumeDao;
import io.cattle.platform.core.model.Instance;
import io.cattle.platform.core.model.Volume;
import io.cattle.platform.db.jooq.dao.impl.AbstractJooqDao;
import io.cattle.platform.engine.manager.ProcessNotFoundException;
import io.cattle.platform.engine.process.impl.ProcessCancelException;
import io.cattle.platform.object.ObjectManager;
import io.cattle.platform.object.process.ObjectProcessManager;
import io.cattle.platform.object.process.StandardProcess;
import io.cattle.platform.object.util.DataAccessor;
import io.cattle.platform.object.util.ObjectUtils;
import io.cattle.platform.task.Task;

import java.util.Collection;
import java.util.concurrent.ExecutorService;

import org.apache.cloudstack.managed.context.NoExceptionRunnable;
import org.jooq.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.config.DynamicIntProperty;

public class BadDataCleanup extends AbstractJooqDao implements Task {

    private static final DynamicIntProperty LIMIT = ArchaiusUtil.getInt("bad.data.batch.size");
    private static final Logger log = LoggerFactory.getLogger(BadDataCleanup.class);

    ObjectManager objectManager;
    ObjectProcessManager processManager;
    InstanceDao instanceDao;
    NetworkDao networkDao;
    StoragePoolDao storagePoolDao;
    AccountDao accountDao;
    VolumeDao volumeDao;
    ServiceDao serviceDao;
    ExecutorService executorService;

    public BadDataCleanup(Configuration configuration, ObjectManager objectManager, ObjectProcessManager processManager, InstanceDao instanceDao,
            NetworkDao networkDao, StoragePoolDao storagePoolDao, AccountDao accountDao, VolumeDao volumeDao, ServiceDao serviceDao,
            ExecutorService executorService) {
        super(configuration);
        this.objectManager = objectManager;
        this.processManager = processManager;
        this.instanceDao = instanceDao;
        this.networkDao = networkDao;
        this.storagePoolDao = storagePoolDao;
        this.accountDao = accountDao;
        this.volumeDao = volumeDao;
        this.serviceDao = serviceDao;
        this.executorService = executorService;
    }

    @Override
    public void run() {
        for (final Instance instance : instanceDao.findBadInstances(LIMIT.get())) {
            executorService.execute(new NoExceptionRunnable() {
                @Override
                protected void doRun() throws Exception {
                    log.warn("Removing invalid instance [{}]", ObjectUtils.toStringWrapper(instance));
                    processManager.scheduleStandardChainedProcessAsync(StandardProcess.STOP, StandardProcess.REMOVE, instance, null);
                }
            });
        }
        for (final Volume vol : volumeDao.findBadVolumes(LIMIT.get())) {
            executorService.execute(new NoExceptionRunnable() {
                @Override
                protected void doRun() throws Exception {
                    log.warn("Removing invalid volume [{}]", ObjectUtils.toStringWrapper(vol));
                    if (VolumeConstants.STATE_DETACHED.equals(vol.getState())) {
                        processManager.scheduleStandardProcessAsync(StandardProcess.REMOVE, vol, null);
                    } else {
                        processManager.scheduleStandardChainedProcessAsync(StandardProcess.DEACTIVATE, StandardProcess.REMOVE, vol, null);
                    }
                }
            });
        }
        for (final Volume vol : volumeDao.findBadNativeVolumes(LIMIT.get())) {
            executorService.execute(new NoExceptionRunnable() {
                @Override
                protected void doRun() throws Exception {
                    log.warn("Removing invalid volume [{}]", ObjectUtils.toStringWrapper(vol));
                    DataAccessor.setField(vol, VolumeConstants.FIELD_DOCKER_IS_NATIVE, true);
                    processManager.scheduleStandardChainedProcessAsync(StandardProcess.DEACTIVATE, StandardProcess.REMOVE, vol, null);
                }
            });
        }

        removeAll(networkDao.findBadNetworks(LIMIT.get()));
        removeAll(storagePoolDao.findBadPools(LIMIT.get()));
        removeAll(storagePoolDao.findBadDockerPools(LIMIT.get()));
        removeAll(accountDao.findBadGO(LIMIT.get()));
        removeAll(accountDao.findBadUserPreference(LIMIT.get()));
        removeAll(accountDao.findBadProjectMembers(LIMIT.get()));
        removeAll(volumeDao.findBadMounts(LIMIT.get()));
        removeAll(storagePoolDao.findBadPoolMapss(LIMIT.get()));
    }

    protected void removeAll(Collection<?> objects) {
        for (final Object obj : objects) {
            executorService.execute(new NoExceptionRunnable() {
                @Override
                protected void doRun() throws Exception {
                    try {
                        log.warn("Removing invalid resource [{}]", ObjectUtils.toStringWrapper(obj));
                        processManager.scheduleStandardChainedProcessAsync(StandardProcess.DEACTIVATE, StandardProcess.REMOVE, obj, null);
                    } catch (ProcessNotFoundException e) {
                        processManager.scheduleStandardProcessAsync(StandardProcess.REMOVE, obj, null);
                    } catch (ProcessCancelException e) {
                        log.warn("Failed to schedule remove for [{}]: {}", ObjectUtils.toStringWrapper(obj), e.getMessage());
                    }
                }
            });
        }
    }

    @Override
    public String getName() {
        return "bad.data";
    }

}