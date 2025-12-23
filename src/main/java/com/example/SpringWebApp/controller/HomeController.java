package com.example.SpringWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greeting(){
        return "Hello word";
    }

    @RequestMapping("/about")
    public String about(){
        return "Spring Web App About";
    }

}
