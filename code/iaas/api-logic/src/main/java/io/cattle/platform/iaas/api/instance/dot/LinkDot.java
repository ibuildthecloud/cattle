package io.cattle.platform.iaas.api.instance.dot;

import io.cattle.platform.core.constants.InstanceLinkConstants;
import io.cattle.platform.core.model.Instance;
import io.cattle.platform.core.model.InstanceLink;
import io.cattle.platform.object.ObjectManager;
import io.github.ibuildthecloud.gdapi.context.ApiContext;

import java.util.HashSet;
import java.util.Set;

import javax.inject.Inject;

public class LinkDot {

    ObjectManager objectManager;

    public String makeDotGraph(Instance instance) {
        StringBuilder buffer = new StringBuilder();
        traverse(instance, new HashSet<Long>(), buffer);

        StringBuilder dot = new StringBuilder("digraph {\n");

        if ( buffer.length() == 0 ) {
            dot.append("{\n\"").append(getInstanceName(instance));
            dot.append("\";\n}\n");
        } else {
            dot.append(buffer);
        }

        dot.append("}\n");

        return dot.toString();
    }

    protected void traverse(Instance instance, Set<Long> seen, StringBuilder buffer) {
        if ( seen.contains(instance.getId()) ) {
            return;
        }

        seen.add(instance.getId());

        for ( InstanceLink link : objectManager.children(instance, InstanceLink.class, InstanceLinkConstants.FIELD_INSTANCE_ID) ) {
            Instance target = objectManager.loadResource(Instance.class, link.getTargetInstanceId());

            if ( target != null ) {
                buffer.append("\"").append(getInstanceName(instance)).append("\"").append(" -> ").append("\"");
                buffer.append(getInstanceName(target)).append("\";\n");
                traverse(target, seen, buffer);
            }
        }
    }

    protected String getInstanceName(Instance instance) {
        String name = instance.getName();
        Object id =  ApiContext.getContext().getIdFormatter().formatId(objectManager.getType(instance), instance.getId());

        return name == null ? id.toString() : name;
    }
    public ObjectManager getObjectManager() {
        return objectManager;
    }

    @Inject
    public void setObjectManager(ObjectManager objectManager) {
        this.objectManager = objectManager;
    }


}
