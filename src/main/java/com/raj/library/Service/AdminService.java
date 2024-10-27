package com.raj.library.Service;

import com.raj.library.entity.Admin;
import com.raj.library.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    AdminRepo adminRepo;


    public void addAdmin(Admin admin){

    }
}
