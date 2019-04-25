package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService {

    public static final String HELLO_PROPERTY = "Hello - I was created by property";


    @Override
    public String sayGreetings() {
        return HELLO_PROPERTY;
    }
}
