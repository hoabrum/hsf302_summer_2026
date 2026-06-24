package com.springboot.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springmvc")
public class HomeController {


    @GetMapping("/home")
    public String home() {
        System.out.println("home welcome ");
        return "home";
    }
}
