package com.springboot.primeiroprojetospringboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWordService {

    @Autowired
    private HelloWordService helloWordService;
    
    public String helloWorld (String name) {
        return "Hello World" + name;
    }
}
