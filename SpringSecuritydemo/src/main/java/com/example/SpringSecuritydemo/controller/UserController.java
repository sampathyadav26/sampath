package com.example.SpringSecuritydemo.controller;

import com.example.SpringSecuritydemo.entity.UserDemo;
import com.example.SpringSecuritydemo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
   @Autowired
    private UserServiceImpl userService;

     @GetMapping("/hello")
    public String hello(){
        return "hellow world";
    }

    @PostMapping("/add")
    public UserDemo addUser(@RequestBody UserDemo userDemo){
         System.out.println("controller");
       return userService.saveUser(userDemo);
    }
}
