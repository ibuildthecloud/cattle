package io.cattle.platform.api.pubsub.subscribe.jetty.config;

import java.util.List;

import javax.inject.Inject;

import io.cattle.platform.api.pubsub.manager.impl.ClassAvailableSubscriptionHandler;
import io.cattle.platform.api.pubsub.subscribe.ApiPubSubEventPostProcessor;
import io.cattle.platform.extension.ExtensionManager;
import io.cattle.platform.util.type.Priority;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JettyPubSubJavaConfig {

    @Inject
    ExtensionManager extensionManager;

    @SuppressWarnings("unchecked")
    @Bean
    public ClassAvailableSubscriptionHandler JettyWebSocketSubcriptionHandler() {
        ClassAvailableSubscriptionHandler handler = new ClassAvailableSubscriptionHandler(
                "org.eclipse.jetty.websocket.WebSocketFactory",
                "io.cattle.platform.api.pubsub.subscribe.jetty.JettyWebSocketSubcriptionHandler");
        handler.setPriority(Priority.SPECIFIC);
        handler.setEventProcessors((List<ApiPubSubEventPostProcessor>) extensionManager
                .list("api.pub.sub.event.post.processor"));

        return handler;
    }

}
