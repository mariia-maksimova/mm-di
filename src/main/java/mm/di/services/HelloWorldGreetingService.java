package mm.di.services;

public class HelloWorldGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World!";
    }
}
