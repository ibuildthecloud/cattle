package io.cattle.platform.configitem.context.impl;

import io.cattle.platform.configitem.server.agentinclude.AgentIncludeMap;
import io.cattle.platform.configitem.server.model.ConfigItem;
import io.cattle.platform.configitem.server.model.impl.ArchiveContext;
import io.cattle.platform.core.model.Agent;
import io.cattle.platform.core.model.Instance;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class AgentIncludeMapFactory extends AbstractAgentBaseContextFactory {

    AgentIncludeMap map;

    @Override
    protected void populateContext(Agent agent, Instance instance, ConfigItem item, ArchiveContext context) {
        context.getData().put("map", map);
    }

    public AgentIncludeMap getMap() {
        return map;
    }

    @Inject
    public void setMap(AgentIncludeMap map) {
        this.map = map;
    }

}
