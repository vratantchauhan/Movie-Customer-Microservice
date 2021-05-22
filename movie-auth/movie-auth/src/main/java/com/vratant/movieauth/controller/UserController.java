package com.vratant.movieauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {

    @GetMapping("/")
    public String indexPage(){
        return"index";
    }

    @GetMapping("/homepage")
    public String res(){
        return"homepage";
    }
}
