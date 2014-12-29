package io.cattle.platform.agent.connection.ssh.config;

import io.cattle.platform.agent.connection.ssh.api.manager.AuthorizedManager;
import io.cattle.platform.agent.connection.ssh.api.model.Authorized;
import io.cattle.platform.agent.connection.ssh.dao.SshAgentDao;
import io.cattle.platform.object.meta.TypeSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AgentConnectionSshApiJavaConfig {

    @Bean
    public SshAgentDao sshAgentDao() {
        return new io.cattle.platform.agent.connection.ssh.dao.impl.SshAgentDaoImpl();
    }

    @Bean
    public AuthorizedManager AuthorizedManager() {
        return new io.cattle.platform.agent.connection.ssh.api.manager.AuthorizedManager();
    }

    @Bean
    public TypeSet SshApiTypes() {
        TypeSet set = new TypeSet();
        set.setTypeClasses(Authorized.class);
        return set;
    }

}
