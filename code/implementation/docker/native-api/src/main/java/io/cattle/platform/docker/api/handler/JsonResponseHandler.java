package io.cattle.platform.docker.api.handler;

import io.cattle.platform.json.JsonMapper;
import io.github.ibuildthecloud.gdapi.request.ApiRequest;
import io.github.ibuildthecloud.gdapi.request.handler.AbstractApiRequestHandler;

import java.io.IOException;

import javax.inject.Inject;

public class JsonResponseHandler extends AbstractApiRequestHandler {

    JsonMapper jsonMapper;


    @Override
    public void handle(ApiRequest request) throws IOException {
        if ( request.isCommitted() ) {
            return;
        }

        Object response = request.getResponseObject();

        if ( response != null ) {
            write(request, response);
        }
    }

    protected void write(ApiRequest request, Object object) throws IOException {
        request.setResponseContentType(getContentType());
        jsonMapper.writeValue(request.getOutputStream(), object);
    }

    protected String getContentType() {
        return "application/json; charset=utf-8";
    }

    public JsonMapper getJsonMapper() {
        return jsonMapper;
    }

    @Inject
    public void setJsonMapper(JsonMapper jsonMapper) {
        this.jsonMapper = jsonMapper;
    }

}
