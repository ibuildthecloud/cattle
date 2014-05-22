package io.cattle.platform.configitem.context.dao;

import io.cattle.platform.core.model.Instance;

import java.util.List;

public interface MetadataDao {

    public List<?> getMetaData(Instance agentInstance);

}
