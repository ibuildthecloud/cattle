package io.cattle.platform.iaas.api.auth.impl;

import io.cattle.platform.api.action.ActionHandler;
import io.cattle.platform.api.auth.Policy;
import io.cattle.platform.core.constants.CommonStatesConstants;
import io.cattle.platform.core.constants.ProjectConstants;
import io.cattle.platform.core.model.Account;
import io.cattle.platform.iaas.api.auth.dao.AuthDao;
import io.cattle.platform.object.process.ObjectProcessManager;
import io.cattle.platform.object.process.StandardProcess;
import io.github.ibuildthecloud.gdapi.context.ApiContext;
import io.github.ibuildthecloud.gdapi.exception.ClientVisibleException;
import io.github.ibuildthecloud.gdapi.request.ApiRequest;
import io.github.ibuildthecloud.gdapi.util.ResponseCodes;

import javax.inject.Inject;

public class ProjectDeactivate implements ActionHandler{

    @Inject
    AuthDao authDao;
    @Inject
    ObjectProcessManager objectProcessManager;

    @Override
    public Object perform(String name, Object obj, ApiRequest request) {
        Policy policy = (Policy) ApiContext.getContext().getPolicy();
        Account project = (Account) obj;
        if (!project.getKind().equalsIgnoreCase(ProjectConstants.TYPE)){
            return null;
        }
        project = authDao.getAccountById(project.getId());
        if (project == null) {
            throw new ClientVisibleException(ResponseCodes.NOT_FOUND);
        }
        if (authDao.getAccountById(policy.getAccountId()).getProjectId().equals(Long.valueOf(project.getId()))){
            throw new ClientVisibleException(ResponseCodes.NOT_ACCEPTABLE);
        }
        if (!authDao.isProjectOwner(project.getId(), policy.getAccountId(),
                policy.isOption(Policy.AUTHORIZED_FOR_ALL_ACCOUNTS), policy.getExternalIds())){
            throw new ClientVisibleException(ResponseCodes.FORBIDDEN, "Forbidden", "You must be a project owner to deactivate a project", null);
        }
        objectProcessManager.scheduleStandardProcess(StandardProcess.DEACTIVATE, project, null);
        return project;
    }

    @Override
    public String getName() {
        return "account.deactivate";
    }
}

