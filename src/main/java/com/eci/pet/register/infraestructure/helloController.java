package com.eci.pet.register.infraestructure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class helloController {

    @GetMapping("/hello")
    public String getMethodName() {
        return "hello from my first spring api :)";
    }
    
}
