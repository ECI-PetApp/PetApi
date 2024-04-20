package com.eci.pet.register.infraestructure;

import org.apache.catalina.connector.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class helloController {

    @GetMapping("/hello")
    public String getMethodName() {
        return "hello from my first spring api";
    }
    
}
