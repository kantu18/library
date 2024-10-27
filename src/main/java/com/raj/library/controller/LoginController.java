package com.raj.library.controller;

import com.raj.library.Service.AdminService;
import com.raj.library.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    AdminService adminService;

    @GetMapping("/admin-Login")
    public String adminLogin(Model model){
        model.addAttribute("adminLogin",new Admin());
        return "adminLogin";
    }
    @PostMapping("/adminLogin")
    public String adminChecker(@ModelAttribute Admin admin){
        if(adminService.checkUserName(admin)==true){

        }else{
            return "noAdmin";
        }
    }
}
