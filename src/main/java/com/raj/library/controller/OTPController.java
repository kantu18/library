package com.raj.library.controller;


import com.raj.library.Service.OtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Verify")
public class OTPController {
    @Autowired
    private OtpService otpService;
}
