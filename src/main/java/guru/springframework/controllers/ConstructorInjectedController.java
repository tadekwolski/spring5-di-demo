package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {


    public GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreetings();
    }


    public ConstructorInjectedController(@Qualifier(value = "constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
