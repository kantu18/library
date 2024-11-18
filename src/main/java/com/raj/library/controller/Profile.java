package com.raj.library.controller;

import com.raj.library.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Profile")
public class Profile {

    @Autowired
    private UserService userService;

    @GetMapping("/Me")
    public String getUser(Model model){
        model.addAttribute("details",userService.getUser());
        return "Me";
    }
    @GetMapping("/Edit")
    public String EditUser(){
        return "Edit";
    }
}