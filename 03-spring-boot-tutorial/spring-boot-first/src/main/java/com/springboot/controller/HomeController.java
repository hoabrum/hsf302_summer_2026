package com.springboot.controller;

import com.springboot.entity.Student;
import com.springboot.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @Autowired
    Student student;

    @Autowired
    Environment env;

    private DateUtil dateUtil;

    @Autowired
    public HomeController(DateUtil dateUtil) {
        this.dateUtil = dateUtil;
    }

    @GetMapping("/home")
    public @ResponseBody String home() {
        System.out.println("Home Page");
        return "Welcome to Spring Boot: " + student + dateUtil.getCurrentDate() + env.getProperty("spring.application.name");
    }
}
