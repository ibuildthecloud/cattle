package io.cattle.platform.app.components;

import io.cattle.platform.agent.server.ping.dao.PingDao;
import io.cattle.platform.agent.server.ping.dao.impl.PingDaoImpl;
import io.cattle.platform.allocator.dao.AllocatorDao;
import io.cattle.platform.allocator.dao.impl.AllocatorDaoImpl;
import io.cattle.platform.core.cache.DBCacheManager;
import io.cattle.platform.core.dao.AccountDao;
import io.cattle.platform.core.dao.AgentDao;
import io.cattle.platform.core.dao.AuditLogDao;
import io.cattle.platform.core.dao.DataDao;
import io.cattle.platform.core.dao.DynamicSchemaDao;
import io.cattle.platform.core.dao.GenericResourceDao;
import io.cattle.platform.core.dao.HostDao;
import io.cattle.platform.core.dao.InstanceDao;
import io.cattle.platform.core.dao.LoadBalancerInfoDao;
import io.cattle.platform.core.dao.NetworkDao;
import io.cattle.platform.core.dao.ProcessSummaryDao;
import io.cattle.platform.core.dao.RegisterDao;
import io.cattle.platform.core.dao.RegistrationTokenAuthDao;
import io.cattle.platform.core.dao.SecretDao;
import io.cattle.platform.core.dao.ServiceDao;
import io.cattle.platform.core.dao.StackDao;
import io.cattle.platform.core.dao.StorageDriverDao;
import io.cattle.platform.core.dao.StoragePoolDao;
import io.cattle.platform.core.dao.UserPreferenceDao;
import io.cattle.platform.core.dao.VolumeDao;
import io.cattle.platform.core.dao.impl.AccountDaoImpl;
import io.cattle.platform.core.dao.impl.AgentDaoImpl;
import io.cattle.platform.core.dao.impl.AuditLogDaoImpl;
import io.cattle.platform.core.dao.impl.DataDaoImpl;
import io.cattle.platform.core.dao.impl.DynamicSchemaDaoImpl;
import io.cattle.platform.core.dao.impl.GenericResourceDaoImpl;
import io.cattle.platform.core.dao.impl.HostDaoImpl;
import io.cattle.platform.core.dao.impl.InstanceDaoImpl;
import io.cattle.platform.core.dao.impl.LoadBalancerInfoDaoImpl;
import io.cattle.platform.core.dao.impl.NetworkDaoImpl;
import io.cattle.platform.core.dao.impl.ProcessSummaryDaoImpl;
import io.cattle.platform.core.dao.impl.RegisterDaoImpl;
import io.cattle.platform.core.dao.impl.RegistrationTokenAuthDaoImpl;
import io.cattle.platform.core.dao.impl.SecretDaoImpl;
import io.cattle.platform.core.dao.impl.ServiceDaoImpl;
import io.cattle.platform.core.dao.impl.StackDaoImpl;
import io.cattle.platform.core.dao.impl.StorageDriverDaoImpl;
import io.cattle.platform.core.dao.impl.StoragePoolDaoImpl;
import io.cattle.platform.core.dao.impl.UserPreferenceDaoImpl;
import io.cattle.platform.core.dao.impl.VolumeDaoImpl;
import io.cattle.platform.framework.encryption.handler.impl.TransformationServiceImpl;
import io.cattle.platform.iaas.api.auth.dao.AuthDao;
import io.cattle.platform.iaas.api.auth.dao.AuthTokenDao;
import io.cattle.platform.iaas.api.auth.dao.PasswordDao;
import io.cattle.platform.iaas.api.auth.dao.impl.AuthDaoImpl;
import io.cattle.platform.iaas.api.auth.dao.impl.AuthTokenDaoImpl;
import io.cattle.platform.iaas.api.auth.dao.impl.PasswordDaoImpl;
import io.cattle.platform.sample.data.AbstractSampleData;
import io.cattle.platform.sample.data.SampleDataStartupV10;
import io.cattle.platform.sample.data.SampleDataStartupV3;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {

    AccountDao accountDao;
    AgentDao agentDao;
    AllocatorDao allocatorDao;
    AuditLogDao auditLogDao;
    AuthDao authDao;
    AuthTokenDao authTokenDao;
    DataDao dataDao;
    DBCacheManager dbCacheManager;
    DynamicSchemaDao dynamicSchemaDao;
    GenericResourceDao resourceDao;
    HostDao hostDao;
    InstanceDao instanceDao;
    LoadBalancerInfoDao loadBalancerInfoDao;
    NetworkDao networkDao;
    PasswordDao passwordDao;
    PingDao pingDao;
    ProcessSummaryDao processSummaryDao;
    RegistrationTokenAuthDao registrationTokenAuthDao;
    RegisterDao registerDao;
    SecretDao secretsDao;
    ServiceDao serviceDao;
    StackDao stackDao;
    StoragePoolDao storagePoolDao;
    StorageDriverDao storageDriverDao;
    TransformationServiceImpl transformationService;
    UserPreferenceDao userPreferenceDao;
    VolumeDao volumeDao;

    List<AbstractSampleData> sampleDatas = new ArrayList<>();

    public DataAccess(Framework f) {
        this.resourceDao = new GenericResourceDaoImpl(f.objectManager, f.processManager, f.transaction);

        this.accountDao = new AccountDaoImpl(f.jooqConfig, f.objectManager);
        this.agentDao = new AgentDaoImpl(f.jooqConfig);
        this.allocatorDao = new AllocatorDaoImpl(f.jooqConfig, f.objectManager, f.transaction);
        this.auditLogDao = new AuditLogDaoImpl(f.jooqConfig, f.objectManager);
        this.authDao = new AuthDaoImpl(f.jooqConfig, resourceDao, f.objectManager, f.processManager, f.lockManager, accountDao);
        this.authTokenDao = new AuthTokenDaoImpl(f.jooqConfig, resourceDao, f.objectManager, f.processManager);
        this.dataDao = new DataDaoImpl(f.jooqConfig, f.lockManager, f.objectManager, f.newConnJooqConfig);
        this.dbCacheManager = new DBCacheManager();
        this.dynamicSchemaDao = new DynamicSchemaDaoImpl(f.jooqConfig, dbCacheManager);
        this.hostDao = new HostDaoImpl(f.jooqConfig);
        this.instanceDao = new InstanceDaoImpl(f.jooqConfig, f.objectManager, f.jsonMapper);
        this.loadBalancerInfoDao = new LoadBalancerInfoDaoImpl(f.jooqConfig);
        this.networkDao = new NetworkDaoImpl(f.jooqConfig, f.objectManager, resourceDao, f.lockManager);
        this.passwordDao = new PasswordDaoImpl(f.jooqConfig, f.objectManager, transformationService, accountDao);
        this.pingDao = new PingDaoImpl(f.jooqConfig);
        this.processSummaryDao = new ProcessSummaryDaoImpl(f.jooqConfig);
        this.registerDao = new RegisterDaoImpl(f.jooqConfig, f.objectManager, f.transaction);
        this.registrationTokenAuthDao = new RegistrationTokenAuthDaoImpl(f.jooqConfig);
        this.secretsDao = new SecretDaoImpl(f.jooqConfig);
        this.serviceDao = new ServiceDaoImpl(f.jooqConfig, f.objectManager, f.lockManager, resourceDao, f.transaction);
        this.stackDao = new StackDaoImpl(f.jooqConfig);
        this.storagePoolDao = new StoragePoolDaoImpl(f.jooqConfig, resourceDao, f.objectManager, f.transaction);
        this.storageDriverDao = new StorageDriverDaoImpl(f.jooqConfig, f.objectManager, f.jsonMapper);
        this.transformationService = new TransformationServiceImpl();
        this.userPreferenceDao = new UserPreferenceDaoImpl(f.jooqConfig);
        this.volumeDao = new VolumeDaoImpl(f.jooqConfig, resourceDao, f.objectManager, f.transaction);

        sampleDatas.add(new SampleDataStartupV3(f.objectManager, f.processManager, accountDao, f.jsonMapper, f.lockManager));
        sampleDatas.add(new SampleDataStartupV10(f.objectManager, f.processManager, accountDao, f.jsonMapper, f.lockManager, f.jooqConfig));
    }

}
