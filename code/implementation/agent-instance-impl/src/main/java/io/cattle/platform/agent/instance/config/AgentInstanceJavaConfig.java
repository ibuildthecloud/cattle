package io.cattle.platform.agent.instance.config;

import io.cattle.platform.agent.instance.ipsec.process.AgentInstanceIpsecNetworkServiceCreate;
import io.cattle.platform.agent.instance.ipsec.process.AgentInstanceIpsecNicActivate;
import io.cattle.platform.agent.instance.ipsec.process.AgentInstanceIpsecNicDeactivate;
import io.cattle.platform.agent.instance.link.process.AgentInstanceLinkActivate;
import io.cattle.platform.agent.instance.link.process.AgentInstanceLinkPurge;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AgentInstanceJavaConfig {

    @Bean
    public AgentInstanceLinkActivate agentInstanceLinkActivate() {
        return new AgentInstanceLinkActivate();
    }

    @Bean
    public AgentInstanceLinkPurge agentInstanceLinkPurge() {
        return new AgentInstanceLinkPurge();
    }

    @Bean
    public AgentInstanceIpsecNetworkServiceCreate agentInstanceIpsecNetworkServiceCreate() {
        return new AgentInstanceIpsecNetworkServiceCreate();
    }

    @Bean
    public AgentInstanceIpsecNicActivate agentInstanceIpsecNicActivate() {
        return new AgentInstanceIpsecNicActivate();
    }

    @Bean
    public AgentInstanceIpsecNicDeactivate agentInstanceIpsecNicDeactivate() {
        return new AgentInstanceIpsecNicDeactivate();
    }

}
