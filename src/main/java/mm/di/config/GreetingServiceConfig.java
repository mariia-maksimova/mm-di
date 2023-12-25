package mm.di.config;

import mm.di.repositories.EnglishGreetingRepository;
import mm.di.repositories.EnglishGreetingRepositoryImpl;
import mm.di.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

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

    @Bean
    @Primary
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    };

    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    };

    @Bean("i18nService")
    @Profile("EN")
    I18nEnglishGreetingService I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18nEnglishGreetingService(englishGreetingRepository);
    };

    @Bean("i18nService")
    @Profile({"default",  "ES"})
    I18nSpanishGreetingService I18nSpanishGreetingService() {
        return new I18nSpanishGreetingService();
    };
}
