package com.raj.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Me")
public class Me {



    @GetMapping("details")
    public String getUser(Model model){
        model.addAttribute("details",userService.getUser());
        return "Me";
    }
}
