package io.cattle.platform.agent.connection.ssh.config;

import io.cattle.platform.agent.connection.ssh.ClientKeyPairProvider;
import io.cattle.platform.agent.connection.ssh.SshAgentConnectionFactory;
import io.cattle.platform.agent.connection.ssh.dao.SshAgentDao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AgentConnectionSshJavaConfig {

    @Bean
    public SshAgentConnectionFactory sshAgentConnectionFactory() {
        return new io.cattle.platform.agent.connection.ssh.SshAgentConnectionFactory();
    }

    @Bean
    public SshAgentDao sshAgentDao() {
        return new io.cattle.platform.agent.connection.ssh.dao.impl.SshAgentDaoImpl();
    }

    @Bean
    public ClientKeyPairProvider clientKeyPairProvider() {
        return new io.cattle.platform.agent.connection.ssh.ClientKeyPairProvider();
    }
}
