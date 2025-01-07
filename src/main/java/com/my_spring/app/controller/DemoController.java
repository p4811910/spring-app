package com.my_spring.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DemoController {

    @GetMapping
    public String sayHello() {
        return "Hello from api";
    }

    @GetMapping("/db")
    public String sayHelloConnectToDb() {
        return "API is connected to db";
    }

}
