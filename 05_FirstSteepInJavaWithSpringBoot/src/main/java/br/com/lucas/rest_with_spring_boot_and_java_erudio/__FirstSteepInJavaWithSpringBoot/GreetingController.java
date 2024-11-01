package br.com.lucas.rest_with_spring_boot_and_java_erudio.__FirstSteepInJavaWithSpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World")
                                 String name){
    return  new Greeting(String.format(template, name), counter.incrementAndGet());
    }
}
