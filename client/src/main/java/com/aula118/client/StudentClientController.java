package com.aula118.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//anotaçoes
@RestController
@RequestMapping("student")
public class StudentClientController {
    
    //injeçao de indepencias
    @Autowired
    StudentClientInterface studentClient;

    //consumo da outra API, implementando um metodo que chama o metodo da outra API
    // caminho 1 -> getStudentResponse, vai chamar o metodo getStudent
    @GetMapping
    public StudentClientResponse getStudentResponse(){

        return studentClient.getStudent();
    }
}
