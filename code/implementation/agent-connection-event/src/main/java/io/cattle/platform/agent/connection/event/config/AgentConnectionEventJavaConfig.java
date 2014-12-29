package io.cattle.platform.agent.connection.event.config;

import io.cattle.platform.agent.connection.event.AgentEventingConnectionFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AgentConnectionEventJavaConfig {

    @Bean
    public AgentEventingConnectionFactory agentEventingConnectionFactory() {
        return new AgentEventingConnectionFactory();
    }

}
