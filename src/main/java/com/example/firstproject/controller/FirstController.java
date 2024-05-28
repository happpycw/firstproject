package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class FirstController {


    @GetMapping ("/hi")
    public String niceToMeetYou(Model model1) {
        model1.addAttribute("username","hongpark");
        return "greetings";
    }
    @GetMapping ("/bye")
    public String seeYouNext(Model model1) {
        model1.addAttribute("nickname","홍길동");
        return "goodbye";
    }
}
