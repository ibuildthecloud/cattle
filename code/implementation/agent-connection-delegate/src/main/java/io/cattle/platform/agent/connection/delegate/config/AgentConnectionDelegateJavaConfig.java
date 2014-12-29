package io.cattle.platform.agent.connection.delegate.config;

import io.cattle.platform.agent.connection.delegate.AgentDelegateConnectionFactory;
import io.cattle.platform.agent.connection.delegate.dao.AgentDelegateDao;
import io.cattle.platform.agent.connection.delegate.dao.impl.AgentDelegateDaoImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AgentConnectionDelegateJavaConfig {

    @Bean
    public AgentDelegateDao agentDelegateDao() {
        return new AgentDelegateDaoImpl();
    }

    @Bean
    public AgentDelegateConnectionFactory agentDelegateConnectionFactory() {
        return new AgentDelegateConnectionFactory();
    }
}
