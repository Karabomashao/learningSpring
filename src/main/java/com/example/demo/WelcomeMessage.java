package com.example.demo;


import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {

    public String getMessage(){
        return  "Welcome to Spring";
    }
}
