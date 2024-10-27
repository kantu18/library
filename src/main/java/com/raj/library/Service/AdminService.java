package com.raj.library.Service;

import com.raj.library.entity.Admin;
import com.raj.library.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService {

    @Autowired
    AdminRepo adminRepo;


    public void addAdmin(Admin admin){
        adminRepo.save(admin);
    }
    List<Admin> adminList = new ArrayList<>();
    public List<Admin> getAdmins(){
        adminList = adminRepo.findAll();
        return adminList;
    }
}
