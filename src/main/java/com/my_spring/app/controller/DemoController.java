package com.my_spring.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class DemoController {

    @GetMapping
    public String sayHello() {
        return "Hello from api";
    }

}
