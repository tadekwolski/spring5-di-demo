package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    public static final String HELLO_CONSTRUCTOR = "Hello - I was created by constructor";


    @Override
    public String sayGreetings() {
        return HELLO_CONSTRUCTOR;
    }
}
