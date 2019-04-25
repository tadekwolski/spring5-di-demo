package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    public static final String HELLO_GETTER = "Hello - I was created by getter";


    @Override
    public String sayGreetings() {
        return HELLO_GETTER;
    }
}
