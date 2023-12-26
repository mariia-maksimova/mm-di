package mm.di.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean {
    public PrototypeBean() {
        System.out.println("Creating a Prototype Bean...");
    }

    public String getMyScope() {
        return "I'm a Prototype";
    }
}
