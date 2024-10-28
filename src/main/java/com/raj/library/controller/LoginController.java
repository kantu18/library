package com.raj.library.controller;

import com.raj.library.Service.AdminService;
import com.raj.library.Service.UserService;
import com.raj.library.entity.Admin;
import com.raj.library.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
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
        if(adminService.checkUserName(admin)){
            if(adminService.checkPassword(admin)){
                return "redirect:/login/AdminDetails";
            }{
                return "wrongPassword";
            }
        }else{
            return "noAdmin";
        }
    }
    @GetMapping("/AdminDetails")
    public String adminDetailsShow(Model model){
        model.addAttribute("details",adminService.getAdmin());
        return "adminDetails";
    }

    @Autowired
    private UserService userService;

    @GetMapping("/User-Login")
    public String userLogin(Model model){
        model.addAttribute("userLogin",new User());
        return "userLogin";
    }
    @PostMapping("/userLogin")
    public String userChecker(@ModelAttribute User user){
        if(userService.checkUserName(user)){
            if(userService.checkPassword(user)){
                return "redirect:/login/AdminDetails";
            }{
                return "wrongPassword";
            }
        }else{
            return "noAdmin";
        }
    }
}
