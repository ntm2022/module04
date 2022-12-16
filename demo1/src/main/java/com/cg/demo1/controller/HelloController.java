package com.cg.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping({"/","/hello"})
    public String handle(){
        return "hello";//phai trung ten file views
    }
}
