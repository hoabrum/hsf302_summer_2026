package com.springboot.demo.controller;

import com.springboot.demo.dto.SigninDTO;
import com.springboot.demo.entity.User;
import com.springboot.demo.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/springmvc")
public class SigninController {

    private final UserService userService;

    public SigninController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/sign-in")
    public String signin(@ModelAttribute SigninDTO signinDTO, Model model,
                         @RequestParam(value = "param", required = false) Integer param) {
        model.addAttribute("signinDTO", new SigninDTO());
        System.out.println("Params = " + param);
        return "sign-in";
    }

    @PostMapping("/sign-in")//endpoint
    public ModelAndView signin(@ModelAttribute SigninDTO signinDTO) {
        ModelAndView mv = new ModelAndView();
        System.out.println(signinDTO);
        mv.setViewName("sign-in");
        User userEntity = new User();
        BeanUtils.copyProperties(signinDTO, userEntity);
        userService.saveUserInfo(userEntity);
        return mv;
    }

}
