package com.liffey.datasync.api.controller;

import com.liffey.datasync.api.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class HelloController {
    @Autowired
    private HelloService helloService;
    @GetMapping("/hello")
    public String get() {
        return helloService.sayHello();
    }
}
