package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Startup {
    @Autowired
    Server server;

    @PostConstruct
    void init() {
        System.out.println(server);
    }
}
