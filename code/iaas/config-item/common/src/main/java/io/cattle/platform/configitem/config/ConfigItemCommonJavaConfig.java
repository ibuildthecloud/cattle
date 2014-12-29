package io.cattle.platform.configitem.config;

import io.cattle.platform.configitem.version.dao.impl.ConfigItemStatusDaoImpl;
import io.cattle.platform.configitem.version.impl.ConfigItemStatusManagerImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigItemCommonJavaConfig {

    @Bean
    public ConfigItemStatusManagerImpl configItemStatusManagerImpl() {
        return new ConfigItemStatusManagerImpl();
    }

    @Bean
    public ConfigItemStatusDaoImpl configItemStatusDaoImpl() {
        return new ConfigItemStatusDaoImpl();
    }

}
