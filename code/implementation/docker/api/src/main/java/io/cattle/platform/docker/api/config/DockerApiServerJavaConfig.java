package io.cattle.platform.docker.api.config;

import io.cattle.platform.docker.api.ExecActionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DockerApiServerJavaConfig {

    @Bean
    public ExecActionHandler execActionHandler() {
        return new ExecActionHandler();
    }

}