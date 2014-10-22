package io.cattle.platform.docker.api.util;

import io.cattle.platform.util.type.CollectionUtils;
import io.github.ibuildthecloud.gdapi.model.Schema.Method;
import io.github.ibuildthecloud.gdapi.request.ApiRequest;

import java.util.Map;

public class DockerApiUtils {

    public static ApiRequest createNewRequest(ApiRequest existing) {
        ApiRequest request = new ApiRequest(existing).reset();
        request.setApiVersion("v1");
        request.setRequestVersion("v1");

        return request;
    }

    public static ApiRequest create(ApiRequest existing, String type, Map<String,Object> params) {
        ApiRequest request = createNewRequest(existing);
        request.setMethod(Method.POST.toString());
        request.setType(type);
        request.setRequestObject(params);

        return request;
    }

    public static ApiRequest create(ApiRequest existing, String type, String key, Object... values) {
        return create(existing, type, CollectionUtils.asMap(key, values));
    }
}
