package com.aula118.client;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// caminho 4 -> de um FeignClient que vai definir pegar da API(url)
@FeignClient(name = "student", url = "http://localhost:8080/student")
public interface StudentClientInterface {
    
    // caminho 3 -> a Interfacer vai fazer o RequestMapping
    @RequestMapping(method = RequestMethod.GET, value = "/")
    // caminho 2 -> getStudent e o metodo da minha Interfacer
    StudentClientResponse getStudent();

}
