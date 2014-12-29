package io.cattle.platform.docker.api.config;

import java.util.Arrays;

import io.cattle.platform.object.meta.TypeSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DockerApiJavaConfig {

    @Bean
    public TypeSet DockerApiTypes() {
        TypeSet set = new io.cattle.platform.object.meta.TypeSet();
        set.setTypeClasses(Arrays.asList(
                io.cattle.platform.docker.api.model.ContainerExec.class,
                io.cattle.platform.docker.api.model.ContainerExecOutput.class));
        return set;
    }

}