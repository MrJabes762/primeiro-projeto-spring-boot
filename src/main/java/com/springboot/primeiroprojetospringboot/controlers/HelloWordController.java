package com.springboot.primeiroprojetospringboot.controlers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController// Suprime as anotações de Controller e Response Body.Essa Classe Vai estar Olvindo as requisições das paginas
@RequestMapping("/hello-word")// se a requiisção cair nessa parte da url será executado o que tiver nela 
public class HelloWordController {

    @GetMapping
    public String helloWord(){
        return "Hello Word";
    }
}
