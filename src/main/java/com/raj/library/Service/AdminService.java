package com.raj.library.Service;

import com.raj.library.entity.Admin;
import com.raj.library.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public boolean checkUserName(Admin admin){
        if(adminRepo.existsById(admin.getUserName())){
            return true;
        }else{
            return false;
        }
    }
    public boolean checkPassword(Admin admin){
        Optional<Admin> byId = adminRepo.findById(admin.getUserName());
        if(byId.get().getPassword()==admin.getPassword()){
            return true;
        }else{
            return false;
        }
    }
}
