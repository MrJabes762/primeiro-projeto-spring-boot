package com.springboot.primeiroprojetospringboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/hello-world")// se a pagina fizer qualquer requisição nessa part ela mapeia pra o que estiver dentro dela 
public class HelloWorldController {

    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }
    @PostMapping
    public String helloWordPost() {
        return "Hello Word Post";
    }
    
}
