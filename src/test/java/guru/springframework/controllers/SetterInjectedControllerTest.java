package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
import guru.springframework.services.SetterGreetingService;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new SetterGreetingService());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURU,setterInjectedController.sayHello());
    }

}