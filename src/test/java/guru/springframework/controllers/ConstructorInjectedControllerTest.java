package guru.springframework.controllers;

import guru.springframework.services.ConstructorGreetingService;
import guru.springframework.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    public void testGreeting() throws Exception {
        Assert.assertEquals("Hello - I was created by constructor",constructorInjectedController.sayHello());
    }
}