package io.cattle.platform.docker.allocator.config;

import io.cattle.platform.allocator.constraint.ImageKindConstraintsProvider;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DockerAllocatorJavaConfig {

    @Bean
    public ImageKindConstraintsProvider dockerKindConstraint() {
        return new ImageKindConstraintsProvider("docker");
    }

}
