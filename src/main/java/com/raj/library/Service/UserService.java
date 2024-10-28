package com.raj.library.Service;

import com.raj.library.entity.Admin;
import com.raj.library.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public boolean checkUserName(Admin admin){
        if(userRepo.existsById(admin.getUserName())){
            return true;
        }else {
            return false;
        }
    }
}
