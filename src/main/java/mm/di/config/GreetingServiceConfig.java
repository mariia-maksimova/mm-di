package mm.di.config;

import mm.di.services.GoodbyeWorldGreetingService;
import mm.di.services.HelloWorldGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {
    @Bean
    HelloWorldGreetingService helloWorldGreetingService() {
        return new HelloWorldGreetingService();
    };

    @Bean
    GoodbyeWorldGreetingService goodbyeWorldGreetingService() {
        return new GoodbyeWorldGreetingService();
    };
}
