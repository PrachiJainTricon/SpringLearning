package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import sun.util.resources.LocaleData;

import javax.jws.WebParam;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping("/first")
public class HomeController {

    @RequestMapping(path = "/home" , method = RequestMethod.GET)
    public String home(Model model){
        System.out.println("THis is home url");

        // dynamic content
        model.addAttribute("name","Prachi Jain 2");
        model.addAttribute("id",1);
        // dynamic list on jsp page
        List<String> friends = new ArrayList<String>();
        friends.add("Shyam");
        friends.add("Ram");
        friends.add("abc");
        model.addAttribute("f",friends);
        return "index";
    }

    @RequestMapping("/about")
    public String about(){
        System.out.println("This is about url");
        return "about";
    }

    @RequestMapping("/services")
    public ModelAndView services(){
        System.out.println("This is services url");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","rakhi jain");
        modelAndView.addObject("id",4);
        modelAndView.setViewName("service");
        return modelAndView;
    }

    @RequestMapping("/help")
    public ModelAndView help(){
        System.out.println("This is help url");
        ModelAndView modelAndView = new ModelAndView();
        // creating model and view object
        modelAndView.addObject("name","Uttam");
        modelAndView.addObject("rollno",2);
        LocalDateTime now = LocalDateTime.now(); // not working
        modelAndView.addObject("time",now);

        // array of marks
        List<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(34);
        list.add(67);
        modelAndView.addObject("marks",list);
        // setting the view name
        modelAndView.setViewName("help");


        return modelAndView;

    }
}
