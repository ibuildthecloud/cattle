package io.cattle.platform.configitem.api.config;

import io.cattle.platform.configitem.api.manager.ConfigContentManager;
import io.cattle.platform.configitem.api.model.ConfigContent;
import io.cattle.platform.object.meta.TypeSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigItemJavaConfig {

    @Bean
    public TypeSet ConfigItemApiTypes() {
        TypeSet set = new TypeSet();
        set.setTypeClasses(ConfigContent.class);
        return set;
    }

    @Bean
    public ConfigContentManager configContentManager() {
        return new ConfigContentManager();
    }

}
