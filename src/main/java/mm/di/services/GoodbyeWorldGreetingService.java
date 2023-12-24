package mm.di.services;

public class GoodbyeWorldGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Goodbye World!";
    }
}
