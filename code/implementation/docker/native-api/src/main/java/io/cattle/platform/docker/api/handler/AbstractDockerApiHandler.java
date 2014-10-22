package io.cattle.platform.docker.api.handler;

import io.cattle.platform.json.JsonMapper;
import io.github.ibuildthecloud.gdapi.request.ApiRequest;
import io.github.ibuildthecloud.gdapi.request.handler.AbstractResponseGenerator;
import io.github.ibuildthecloud.gdapi.request.handler.ApiRequestHandler;
import io.github.ibuildthecloud.gdapi.request.resource.ResourceManagerLocator;
import io.github.ibuildthecloud.gdapi.validation.ValidationHandler;

import java.io.IOException;

import javax.inject.Inject;

public abstract class AbstractDockerApiHandler extends AbstractResponseGenerator {

    protected JsonMapper jsonMapper;
    protected ApiRequestHandler resourceHandler;
    protected ValidationHandler validationHandler;
    protected ResourceManagerLocator locator;

    protected abstract String getType();

    protected abstract void handleInternal(ApiRequest request) throws IOException;

    @Override
    protected void generate(ApiRequest request) throws IOException {
        if ( getType().equals(request.getType()) ) {
            handleInternal(request);
        }
    }

    protected void executeRequest(ApiRequest request) throws IOException {
        validationHandler.handle(request);
        resourceHandler.handle(request);
    }

    public ValidationHandler getValidationHandler() {
        return validationHandler;
    }

    @Inject
    public void setValidationHandler(ValidationHandler validationHandler) {
        this.validationHandler = validationHandler;
    }

    public ApiRequestHandler getResourceHandler() {
        return resourceHandler;
    }

    @Inject
    public void setResourceHandler(ApiRequestHandler resourceHandler) {
        this.resourceHandler = resourceHandler;
    }

    public JsonMapper getJsonMapper() {
        return jsonMapper;
    }

    @Inject
    public void setJsonMapper(JsonMapper jsonMapper) {
        this.jsonMapper = jsonMapper;
    }

    public ResourceManagerLocator getLocator() {
        return locator;
    }

    @Inject
    public void setLocator(ResourceManagerLocator locator) {
        this.locator = locator;
    }

}