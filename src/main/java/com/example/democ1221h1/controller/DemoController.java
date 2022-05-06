package com.example.democ1221h1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
    @GetMapping("/user")
    public ModelAndView userPage(){
        return new ModelAndView("user");
    }
    @GetMapping("/admin")
    public ModelAndView adminPage(){
        return new ModelAndView("admin");
    }
    @GetMapping("/home")
    public ModelAndView home(){
        return new ModelAndView("home");
    }

}
