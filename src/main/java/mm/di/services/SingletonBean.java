package mm.di.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creating a Singleton Bean...");
    }

    public String getMyScope() {
        return "I'm a Singleton";
    }
}
