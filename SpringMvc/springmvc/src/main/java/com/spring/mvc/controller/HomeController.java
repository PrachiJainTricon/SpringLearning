package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sun.util.resources.LocaleData;

import java.time.LocalDateTime;
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
    public ModelAndView help(){
        System.out.println("This is help url");
        ModelAndView modelAndView = new ModelAndView();
        // creating model and view object
        modelAndView.addObject("name","Uttam");
        modelAndView.addObject("rollno",2);
        LocalDateTime now = LocalDateTime.now();
        modelAndView.addObject("time",now);
        // setting the view name
        modelAndView.setViewName("help");


        return modelAndView;

    }
}
