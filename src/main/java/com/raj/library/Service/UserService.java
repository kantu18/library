package com.raj.library.Service;

import com.raj.library.entity.Admin;
import com.raj.library.entity.User;
import com.raj.library.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public boolean checkUserName(User user){
        if(userRepo.existsById(user.getUserName())){
            return true;
        }else {
            return false;
        }
    }
    public boolean checkPassword(User user){
        Optional<User> byId = userRepo.findById(user.getUserName());
        System.out.println(byId.get().getPassword());
        System.out.println(user.getPassword());
        if(byId.get().getPassword().equals(user.getPassword())){
            adminUserName = byId.get().getUserName();
            return true;
        }else{
            return false;
        }
    }
}
