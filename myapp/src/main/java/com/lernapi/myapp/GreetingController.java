package com.lernapi.myapp;

import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @PostMapping("/categories")
    public String categories(@RequestBody Map<String,String> category) throws Exception {
        String name = category.get("name");
        return new Categories().setCategories(name);
    }

    @GetMapping("/categories")
    public com.lernapi.myapp.db.tables.pojos.Categories categories(@RequestParam Integer categoryID) throws Exception {
        com.lernapi.myapp.db.tables.pojos.Categories res = new Categories().getCategories(categoryID);
        return res;
    }
}
