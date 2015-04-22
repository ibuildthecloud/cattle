package io.cattle.platform.schema.processor;

import io.cattle.platform.util.type.Priority;
import io.github.ibuildthecloud.gdapi.factory.SchemaFactory;
import io.github.ibuildthecloud.gdapi.factory.impl.AbstractSchemaPostProcessor;
import io.github.ibuildthecloud.gdapi.model.FieldType;
import io.github.ibuildthecloud.gdapi.model.impl.FieldImpl;
import io.github.ibuildthecloud.gdapi.model.impl.SchemaImpl;
import io.github.ibuildthecloud.gdapi.util.TypeUtils;

public class StandardFieldsPostProcessor extends AbstractSchemaPostProcessor implements Priority {

    @Override
    public SchemaImpl postProcess(SchemaImpl schema, SchemaFactory factory) {
        FieldImpl field = new FieldImpl();
        field.setTypeEnum(FieldType.STRING);

        schema.getResourceFields().put(TypeUtils.ID_FIELD, field);

        return super.postProcess(schema, factory);
    }

    @Override
    public int getPriority() {
        return Priority.DEFAULT;
    }

}
