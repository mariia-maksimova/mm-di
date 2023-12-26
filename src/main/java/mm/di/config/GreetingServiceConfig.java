package mm.di.config;

import mm.di.repositories.EnglishGreetingRepository;
import mm.di.repositories.EnglishGreetingRepositoryImpl;
import mm.di.services.*;
import mm.pets.services.PetService;
import mm.pets.services.PetServiceFactory;
import org.springframework.context.annotation.*;

@Configuration
@ImportResource("classpath:mm-di-config.xml")
public class GreetingServiceConfig {

    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Bean("petService")
    @Profile({"dog"})
    PetService dogPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("dog");
    }

    @Bean("petService")
    @Profile({"cat", "default"})
    PetService catPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("cat");
    }

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
