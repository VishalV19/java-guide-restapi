package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowWorldController {

    // Http Get request
    // -- http://localhost:8080/hellow-world
    // We use @GetMapping annotation to map HTTP GET request on to sepcific handler method

    @GetMapping ("/hellow-world")
    public String hellowWorld(){
        return "Hellow World";
    }
}
