package com.embarkx.FirstSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/greetings")
    public String hello(){
        return "Hiii";
    }

    @PostMapping("/namehello")
    public String namehello(@RequestBody String name){
        return "Hiii " + name + "!";
    }
}
