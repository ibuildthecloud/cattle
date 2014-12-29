package io.cattle.platform.extension.api.config;

import java.util.List;

import io.cattle.platform.engine.process.ProcessDefinition;
import io.cattle.platform.extension.ExtensionManager;
import io.cattle.platform.extension.api.dot.DotMaker;
import io.cattle.platform.extension.api.manager.ExtensionManagerApi;
import io.cattle.platform.extension.api.manager.ProcessDefinitionApiManager;
import io.cattle.platform.extension.api.manager.ResourceDefinitionManager;
import io.cattle.platform.object.meta.TypeSet;

import javax.inject.Inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExtensionManagerJavaConfig {

    @Inject
    ExtensionManager extensionManager;

    @Bean
    public TypeSet ExtensionTypeSet() {
        TypeSet set = new TypeSet();
        set.setTypeClasses(io.cattle.platform.extension.ExtensionImplementation.class,
                io.cattle.platform.extension.ExtensionPoint.class,
                io.cattle.platform.extension.api.model.ProcessDefinitionApi.class,
                io.cattle.platform.extension.api.model.ResourceDefinition.class,
                io.cattle.platform.engine.process.StateTransition.class);
        return set;
    }

    @Bean
    public ExtensionManagerApi ExtensionManagerApi() {
        return new ExtensionManagerApi();
    }

    @SuppressWarnings("unchecked")
    @Bean
    public ProcessDefinitionApiManager ProcessDefinitionApiManager() {
        ProcessDefinitionApiManager manager = new ProcessDefinitionApiManager();
        manager.setProcessDefinitions((List<ProcessDefinition>) extensionManager.list("process.definition"));
        return manager;
    }

    @SuppressWarnings("unchecked")
    @Bean
    public ResourceDefinitionManager ResourceDefinitionManager() {
        io.cattle.platform.extension.api.manager.ResourceDefinitionManager manager = new ResourceDefinitionManager();
        manager.setProcessDefinitions((List<ProcessDefinition>) extensionManager.list("process.definition"));
        return manager;
    }

    @SuppressWarnings("unchecked")
    @Bean
    public DotMaker ExtensionManagerDotMaker() {
        DotMaker dot = new DotMaker();
        dot.setProcessDefinitions((List<ProcessDefinition>) extensionManager.list("process.definition"));
        return dot;
    }
}
