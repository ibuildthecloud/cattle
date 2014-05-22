package io.cattle.platform.configitem.context.dao.impl;

import java.util.List;

import io.cattle.platform.configitem.context.dao.MetadataDao;
import io.cattle.platform.configitem.context.data.MetadataEntry;
import io.cattle.platform.core.model.Instance;
import io.cattle.platform.db.jooq.dao.impl.AbstractJooqDao;
import io.cattle.platform.db.jooq.mapper.MultiRecordMapper;

public class MetadataDaoImpl extends AbstractJooqDao implements MetadataDao {

    @Override
    public List<?> getMetaData(Instance agentInstance) {
        MultiRecordMapper<MetadataEntry> mapper = new MultiRecordMapper<MetadataEntry>() {
            @Override
            protected MetadataEntry map(List<Object> input) {
                // TODO Auto-generated method stub
                return null;
            }
        });

        // TODO Auto-generated method stub
        return null;
    }

}
