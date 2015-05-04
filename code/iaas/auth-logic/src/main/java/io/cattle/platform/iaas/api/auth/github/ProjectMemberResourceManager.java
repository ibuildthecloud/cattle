package io.cattle.platform.iaas.api.auth.github;

import io.cattle.platform.api.auth.ExternalId;
import io.cattle.platform.api.auth.Policy;
import io.cattle.platform.api.resource.AbstractObjectResourceManager;
import io.cattle.platform.core.constants.ProjectConstants;
import io.cattle.platform.core.dao.GenericResourceDao;
import io.cattle.platform.core.model.Account;
import io.cattle.platform.core.model.ProjectMember;
import io.cattle.platform.iaas.api.auth.ExternalIdHandler;
import io.cattle.platform.iaas.api.auth.dao.AuthDao;
import io.cattle.platform.iaas.api.auth.github.resource.Member;
import io.cattle.platform.json.JsonMapper;
import io.cattle.platform.object.ObjectManager;
import io.cattle.platform.object.process.ObjectProcessManager;
import io.github.ibuildthecloud.gdapi.context.ApiContext;
import io.github.ibuildthecloud.gdapi.exception.ClientVisibleException;
import io.github.ibuildthecloud.gdapi.factory.SchemaFactory;
import io.github.ibuildthecloud.gdapi.model.ListOptions;
import io.github.ibuildthecloud.gdapi.request.ApiRequest;
import io.github.ibuildthecloud.gdapi.util.ResponseCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;

public class ProjectMemberResourceManager extends AbstractObjectResourceManager {

    @Inject
    JsonMapper jsonMapper;
    @Inject
    AuthDao authDao;
    @Inject
    GenericResourceDao resourceDao;
    @Inject
    ObjectManager objectManager;
    @Inject
    ObjectProcessManager objectProcessManager;

    private List<ExternalIdHandler> externalIdHandlers;

    @Override
    protected Object removeFromStore(String type, String id, Object obj, ApiRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected Object listInternal(SchemaFactory schemaFactory, String type, Map<Object, Object> criteria, ListOptions options) {
        Policy policy = (Policy) ApiContext.getContext().getPolicy();
        String id = (String) criteria.get("id");
        if (StringUtils.isNotEmpty(id)) {
            ProjectMember projectMember = authDao.getProjectMember(Long.valueOf(id));
            if (!authDao.hasAccessToProject(projectMember.getProjectId(), policy.getAccountId(),
                    policy.isOption(Policy.AUTHORIZED_FOR_ALL_ACCOUNTS), policy.getExternalIds())) {
                throw new ClientVisibleException(ResponseCodes.NOT_FOUND);
            }
            projectMember = untransform(projectMember);
            policy.grantObjectAccess(projectMember);
            return Arrays.asList(projectMember);
        }
        String projectId = (String) criteria.get("projectId");
        if (StringUtils.isNotEmpty(projectId)) {
            List<? extends ProjectMember> members = authDao.getActiveProjectMembers(Long.valueOf(projectId));
            for (ProjectMember member: members){
                member = untransform(member);
                policy.grantObjectAccess(member);
            }
            return members;
        }
        List<? extends ProjectMember> members = authDao.getActiveProjectMembers(policy.getAccountId());
        for (ProjectMember member: members){
            member = untransform(member);
            policy.grantObjectAccess(member);
        }
        return members;
    }

    @Override
    public String[] getTypes() {
        return new String[] { "projectMember" };
    }

    @Override
    public Class<?>[] getTypeClasses() {
        return new Class<?>[0];
    }

    public List<ProjectMember> setMembers(Account project, List<Map<String, String>> members) {
        List<ProjectMember> membersCreated = new ArrayList<>();
        if (members != null) {
            for (Map<String, String> newMember : members) {
                if (newMember.get("externalId") == null || newMember.get("externalIdType") == null || newMember.get("role") == null) {
                    throw new ClientVisibleException(ResponseCodes.BAD_REQUEST, "InvalidFormat", "Project Member format invalid", null);
                }
            }
            HashSet<Member> membersTransformed = new HashSet<>();
            for (Map<String, String> newMember : members) {
                ExternalId givenExternalId = new ExternalId(newMember.get("externalId"), newMember.get("externalIdType"));
                ExternalId newExternalId = null;
                for (ExternalIdHandler externalIdHandler: externalIdHandlers){
                    newExternalId = externalIdHandler.transform(givenExternalId);
                    if(newExternalId != null){
                        break;
                    }
                }
                if (newExternalId != null){
                    membersTransformed.add(new Member(newExternalId, newMember.get("role")));
                } else {
                    throw new ClientVisibleException(ResponseCodes.BAD_REQUEST, "InvalidExternalIdType", "External Id Type Not supported.", null);
                }
            }
            membersCreated.addAll(authDao.setProjectMembers(project, membersTransformed));
        }
        for (ProjectMember member: membersCreated) {
            untransform(member);
        }
        return membersCreated;
    }

    public List<ExternalIdHandler> getExternalIdHandlers() {
        return externalIdHandlers;
    }

    @Inject
    public void setExternalIdHandlers(List<ExternalIdHandler> externalIdHandlers) {
        this.externalIdHandlers = externalIdHandlers;
    }

    public ProjectMember transform(ProjectMember member){
        ExternalId externalId = new ExternalId(member.getExternalId(), member.getExternalIdType(), member.getName());
        ExternalId newExternalId;
        for (ExternalIdHandler externalIdHandler: externalIdHandlers){
            newExternalId = externalIdHandler.transform(externalId);
            if(newExternalId != null){
                break;
            }
        }
        member.setName(externalId.getName());
        member.setExternalId(externalId.getId());
        member.setExternalIdType(externalId.getType());
        return member;
    }

    public ProjectMember untransform(ProjectMember member){
        ExternalId externalId = new ExternalId(member.getExternalId(), member.getExternalIdType(), member.getName());
        ExternalId newExternalId = null;
        for (ExternalIdHandler externalIdHandler: externalIdHandlers){
            newExternalId = externalIdHandler.untransform(externalId);
            if(newExternalId != null){
                break;
            }
        }
        if (newExternalId == null){
            throw new ClientVisibleException(ResponseCodes.BAD_REQUEST, "InvalidFormat", "Project Member format invalid", null);
        }
        member.setName(newExternalId.getName());
        member.setExternalId(newExternalId.getId());
        member.setExternalIdType(newExternalId.getType());
        return member;
    }
}
