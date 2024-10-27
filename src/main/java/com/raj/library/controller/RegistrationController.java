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

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/addAdmin")
    public String  addAdmin(@ModelAttribute Admin admin){
        adminService.addAdmin(admin);
        return "Success";
    }
    @GetMapping("/add-Admin")
    public String getMethodForAddAdmin(Model model){
        model.addAttribute("admin",new Admin());
        return "addAdmin";
    }
    private List<Admin> adminList = new ArrayList<>();
    @GetMapping("/showAdmin")
    public String showAdmin(Model model){
        adminList = adminService.getAdmins();
        model.addAttribute("admin",adminList);
        return "admins";
    }
}
