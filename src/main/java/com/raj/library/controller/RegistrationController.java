package com.raj.library.controller;

import com.raj.library.Service.AdminService;
import com.raj.library.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/addAdmin")
    public void addAdmin(@ModelAttribute Admin admin){

    }
}
