package com.example.login.service;

import com.example.login.pojo.User;
//zimport org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService  {

    public String login(User user){
//        String message="";
        String userName="Sampath";
        String Password="Sampath@2603";
        if(user.getUserName().equals(userName)&&user.getPassword().equals(Password)){
            return "Successfully logged in";
        }else{
            return "incorrect username or password";
        }
    }
}
