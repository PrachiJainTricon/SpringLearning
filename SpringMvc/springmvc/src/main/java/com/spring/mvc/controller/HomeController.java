package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("THis is home url");

        // dynamic content
        model.addAttribute("name","Prachi Jain 2");
        model.addAttribute("id",1);
//
//        // dynamic list on jsp page
//        List<String> friends = new ArrayList<String>();
//        friends.add("Shyam");
//        friends.add("Ram");
//        friends.add("abc");
//        model.addAttribute("f",friends);

            return "index";
    }

    @RequestMapping("/about")
    public String about(){
        System.out.println("This is about url");
        return "about";
    }

    @RequestMapping("/services")
    public String services(){
        System.out.println("This is services url");
        return "service";
    }

    @RequestMapping("/help")
    public String help(){
        System.out.println("This is help url");
        return "help";

    }
}
