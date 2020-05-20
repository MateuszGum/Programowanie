package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private kczym km;
    @Autowired
    public GreetingController(kczym km){
        this.km=km;
    }
    @RequestMapping(path="/bye, method = GET")
    public Greeting bye (@RequestParam(value = "name", defaultValue = "World") String name, @RequestParam(value = "wiek", defaultValue = "World") String wiek)
    {
        return new Greeting(counter.incrementAndGet(), String.format(template, name),String.format(template, wiek),String.format(template, kczym.sprawdz(name)));
    }
    @RequestMapping("/nowy")
    public Greeting nowy (@RequestParam(value = "name", defaultValue = "World") String name, @RequestParam(value = "wiek", defaultValue = "World") String wiek)
    {
        return new Greeting(counter.incrementAndGet(), String.format(template, name),String.format(template, wiek),String.format(template, kczym.sprawdz(name)));
    }

}