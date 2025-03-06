package com.example.login.controller;

import com.example.login.pojo.User;
import com.example.login.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
//@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    private UserService userService;
   @Operation(summary = "login with Credenatials ")

    @PostMapping("/login")
    public String login(@RequestBody User user){
      return   userService.login(user);
    }

}
