package com.springboot.demo.controller;

import com.springboot.demo.dto.SigninDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/springmvc")
public class SigninController {

    @GetMapping("/sign-in")
    public ModelAndView signin() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sign-in");
        return mv;
    }

    @PostMapping("/sign-in")
    public ModelAndView signin(@ModelAttribute SigninDTO signinDTO) {
        ModelAndView mv = new ModelAndView();
        System.out.println(signinDTO);
        mv.setViewName("sign-in");
        return mv;
    }

}
