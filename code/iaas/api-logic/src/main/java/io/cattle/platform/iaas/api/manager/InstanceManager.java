package io.cattle.platform.iaas.api.manager;

import io.cattle.platform.api.resource.jooq.AbstractJooqResourceManager;
import io.cattle.platform.core.constants.InstanceConstants;
import io.cattle.platform.core.model.Instance;
import io.cattle.platform.iaas.api.dot.DotWriter;
import io.cattle.platform.iaas.api.instance.dot.LinkDot;
import io.cattle.platform.util.type.CollectionUtils;
import io.github.ibuildthecloud.gdapi.factory.SchemaFactory;
import io.github.ibuildthecloud.gdapi.model.ListOptions;
import io.github.ibuildthecloud.gdapi.model.Resource;
import io.github.ibuildthecloud.gdapi.request.ApiRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

public class InstanceManager extends AbstractJooqResourceManager {

    LinkDot linkDot;
    DotWriter dotWriter;

    @Override
    public String[] getTypes() {
        return new String[] { "instance", "container", "virtualMachine" };
    }

    @Override
    public Class<?>[] getTypeClasses() {
        return new Class<?>[] { Instance.class };
    }

    @Override
    protected Object deleteInternal(String type, String id, Object obj, ApiRequest request) {
        if ( ! ( obj instanceof Instance ) ) {
            return super.deleteInternal(type, id, obj, request);
        }

        Instance instance = (Instance)obj;

        if ( InstanceConstants.STATE_RUNNING.equals(instance.getState()) ) {
            scheduleProcess(InstanceConstants.PROCESS_STOP, obj, CollectionUtils.asMap(InstanceConstants.REMOVE_OPTION, true));
            return getObjectManager().reload(obj);
        } else {
            return super.deleteInternal(type, id, obj, request);
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    protected <T> T createAndScheduleObject(Class<T> clz, Map<String, Object> properties) {
        Object count = properties.get(InstanceConstants.FIELD_COUNT);

        if ( count instanceof Number && ((Number)count).intValue() > 1 ) {
            int max = ((Number)count).intValue();

            List<Object> result = new ArrayList<Object>(max);
            for ( int i = 0 ; i < max ; i++ ) {
                Object instance = super.createAndScheduleObject(clz, properties);
                result.add(instance);
            }

            return (T)result;
        } else {
            return super.createAndScheduleObject(clz, properties);
        }
    }

    @Override
    protected Object getLinkInternal(String type, String id, String link, ApiRequest request) {
        Object instance = getById(type, id, new ListOptions());
        if ( request != null && link.equalsIgnoreCase(InstanceConstants.LINK_LINK_DOT) && instance instanceof Instance ) {
            String dot = linkDot.makeDotGraph((Instance)instance);

            boolean written = false;
            try {
                written = dotWriter.writeResponse(dot, request);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }

            return written ? Collections.emptyList() : null;
        }

        return super.getLinkInternal(type, id, link, request);
    }

    @Override
    protected Map<String, String> getLinks(SchemaFactory schemaFactory, Resource resource) {
        Map<String, String> links = super.getLinks(schemaFactory, resource);
        if ( links != null ) {
            links.put(InstanceConstants.LINK_LINK_DOT, null);
        }

        return links;
    }

    public LinkDot getLinkDot() {
        return linkDot;
    }

    @Inject
    public void setLinkDot(LinkDot linkDot) {
        this.linkDot = linkDot;
    }

    public DotWriter getDotWriter() {
        return dotWriter;
    }

    @Inject
    public void setDotWriter(DotWriter dotWriter) {
        this.dotWriter = dotWriter;
    }

}