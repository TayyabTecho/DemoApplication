package com.example.demoApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {
//private String  userId;
//private String userName;
//private String email;
//private String phoneNumber;
    @GetMapping("/")
        public String sayHello(){
            return "hello from server";
    }
}
//Uzair u=new Uzair();

