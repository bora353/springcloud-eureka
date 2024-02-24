package com.example.anotherservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/another")
    public String hi(){
        return "another Service!!!";
    }
}
