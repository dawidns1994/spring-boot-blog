package com.test.blog.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @Value("${welcome.message}")
    private String welcomeMessage;
    @Value("${blog.title}")
    private String title;

    @RequestMapping("/")
    public String welcome(Model model) {
        model.addAttribute("message", welcomeMessage);
        model.addAttribute("title", title);
        return "welcome";
    }
}
