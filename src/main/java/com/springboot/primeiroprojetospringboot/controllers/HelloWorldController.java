package com.springboot.primeiroprojetospringboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.primeiroprojetospringboot.model.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/hello-world")// se a pagina fizer qualquer requisição nessa part ela mapeia pra o que estiver dentro dela 
public class HelloWorldController {

    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }
    @PostMapping ("") // Método Usado para a criação de novos recursos da API
    public String helloWordPost(@RequestBody User body) {
        return "Hello Word Post" + body.getNome();
    }
    
}
