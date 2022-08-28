package com.aula118.serve;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentControler {

    // camnho 7 -> do objeto da classe que crie
    private static Student student = new Student(1,"ze",14);
    
    // caminho 5-> e caimos nesse metodo
    @GetMapping("/student")
    public StudentResponse getStudent(){

        // caminho 6-> que monta uma resposta
        return StudentResponse.builder().id(student.getId()).name(student.getName()).age(student.getAge()).build();
    }
}
