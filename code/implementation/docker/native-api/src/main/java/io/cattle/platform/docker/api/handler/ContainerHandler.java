package io.cattle.platform.docker.api.handler;

import static io.cattle.platform.core.model.tables.InstanceTable.INSTANCE;
import io.cattle.platform.core.constants.InstanceConstants;
import io.cattle.platform.core.model.Instance;
import io.cattle.platform.docker.api.util.DockerApiUtils;
import io.cattle.platform.object.util.DataAccessor;
import io.cattle.platform.util.type.CollectionUtils;
import io.github.ibuildthecloud.gdapi.model.ListOptions;
import io.github.ibuildthecloud.gdapi.model.Schema.Method;
import io.github.ibuildthecloud.gdapi.request.ApiRequest;
import io.github.ibuildthecloud.gdapi.request.resource.ResourceManager;
import io.github.ibuildthecloud.gdapi.util.ResponseCodes;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.github.dockerjava.api.command.CreateContainerCmd;
import com.github.dockerjava.api.command.CreateContainerResponse;
import com.github.dockerjava.api.command.InspectContainerResponse;
import com.github.dockerjava.core.command.CreateContainerCmdImpl;

public class ContainerHandler extends AbstractDockerApiHandler {

    @Override
    protected void handleInternal(ApiRequest request) throws IOException {
        /* The ApiRequest already parses the URL as follows:
         *      /:version/:type/:id/:link
         *
         * So POST /v1.15/containers/abc/logs
         *
         *      request.getRequestVersion() = "v1.15"
         *      request.getType() = "container"
         *      request.getId() = "abc"
         *      request.getLink() = "logs"
         *      request.getMethod() = "POST"
         */

        if ( Method.POST.isMethod(request.getMethod()) && "create".equals(request.getId()) ) {
            // Do create
            CreateContainerCmd cmd = parseBody(request, CreateContainerCmdImpl.class);
            ApiRequest newRequest = DockerApiUtils.create(request, InstanceConstants.TYPE_CONTAINER,
                    InstanceConstants.FIELD_IMAGE_UUID, "docker:" + cmd.getImage());

            executeRequest(newRequest);

            Instance instance = (Instance)newRequest.getResponseObject();

            CreateContainerResponse response = new CreateContainerResponse();

            response.setId(instance.getUuid());

            request.setResponseObject(response);
            request.setResponseCode(ResponseCodes.CREATED);

            return;
        } else if ( Method.GET.isMethod(request.getMethod()) && "json".equals(request.getId()) ) {
            // Do list
        } else if ( Method.GET.isMethod(request.getMethod()) && ! StringUtils.isBlank(request.getId()) ) {
            String type = request.getSchemaFactory().getSchemaName(Instance.class);
            ResourceManager manager = locator.getResourceManagerByType(type);
            List<?> resp = manager.list(type, CollectionUtils.asMap((Object)INSTANCE.UUID, request.getId()),
                    new ListOptions());

            if ( resp.size() == 1 ) {
                InspectContainerResponse respObject = DataAccessor
                        .fromDataFieldOf(resp.get(0))
                        .withKey(InstanceConstants.DATA_DOCKER_INSPECT)
                        .as(jsonMapper, InspectContainerResponse.class);
                request.setResponseObject(respObject);
                return;
            }
        }
    }

    protected <T> T parseBody(ApiRequest request, Class<T> clz) throws IOException {
        InputStream is = request.getServletContext().getRequest().getInputStream();
        return jsonMapper.readValue(is, clz);

    }

    @Override
    protected String getType() {
        return InstanceConstants.TYPE_CONTAINER;
    }

}
