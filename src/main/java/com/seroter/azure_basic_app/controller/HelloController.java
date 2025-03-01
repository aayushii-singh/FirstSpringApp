package com.seroter.azure_basic_app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";

    }

    @GetMapping("/hello/query")
    public String greetUser(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    @GetMapping("/hello/param/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}


