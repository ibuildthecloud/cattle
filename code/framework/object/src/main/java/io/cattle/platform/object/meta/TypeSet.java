package io.cattle.platform.object.meta;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TypeSet {

    List<Class<?>> typeClasses = Collections.emptyList();
    List<String> typeNames = Collections.emptyList();

    public List<Class<?>> getTypeClasses() {
        return typeClasses;
    }

    public void setTypeClasses(List<Class<?>> typeClasses) {
        this.typeClasses = typeClasses;
    }

    public void setTypeClasses(Class<?>... typeClasses) {
        this.typeClasses = Arrays.asList(typeClasses);
    }

    public List<String> getTypeNames() {
        return typeNames;
    }

    public void setTypeNames(List<String> typeNames) {
        this.typeNames = typeNames;
    }

}