package io.cattle.platform.redis.config;

import java.util.List;

import io.cattle.platform.extension.ExtensionManager;
import io.cattle.platform.redis.RedisEventingService;
import io.cattle.platform.util.concurrent.NamedExecutorService;

import javax.inject.Inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("redis")
public class RedisJavaConfig {

    @Inject
    ExtensionManager extensionManager;

    @SuppressWarnings("unchecked")
    @Bean
    public RedisEventingService EventService() {
        RedisEventingService service = new RedisEventingService();
        service.setNamedExecutorServiceList((List<NamedExecutorService>) extensionManager
                .list("named.executor.service"));
        return service;
    }
}
