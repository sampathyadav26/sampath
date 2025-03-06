package com.example.Springsecurity.controller;

import com.example.Springsecurity.entity.User;
import com.example.Springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.datatransfer.StringSelection;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

     @Autowired
    private UserService userService;

     @PostMapping("/add")
     public User save(@RequestBody User user){
         System.out.println("Controller"+user);
         return userService.add(user);
     }


     @GetMapping("/")
     public  String welcome(String msg){
         msg ="welcome user";
         return msg;
     }

    @GetMapping("/welcome")
    public  String welcome1(String msg){
        msg ="welcome agter login";
        return msg;
    }

     @GetMapping("/admin")
     public String admin(String msg){
         msg ="welcome admin";
         return msg;
     }

    @GetMapping("/emp")
    public String employee(String msg){
        msg ="welcome employee";
        return msg;
    }

    @GetMapping("/list")
    public List<User> all(){
       return   userService.alluser();
    }

}
