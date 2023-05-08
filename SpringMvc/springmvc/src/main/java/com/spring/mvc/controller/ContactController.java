package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {

    @RequestMapping("/contact")
    public String showForm(){
        return "contact";
    }

    @RequestMapping(path = "/proccessForm" , method = RequestMethod.POST)
    public String form(){

        return "contact";
    }
}
