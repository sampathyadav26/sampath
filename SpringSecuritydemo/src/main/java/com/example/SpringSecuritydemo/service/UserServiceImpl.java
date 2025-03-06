package com.example.SpringSecuritydemo.service;

import com.example.SpringSecuritydemo.entity.UserDemo;
import com.example.SpringSecuritydemo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

     @Autowired
    private UserRepo userRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public UserDemo saveUser(UserDemo userDemo) {
        System.out.println("---service------");
        userDemo.setPassword(passwordEncoder.encode(userDemo.getPassword()));
        return userDemo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserDemo userDemo=userRepo.findByuname(username)
                .orElseThrow(()->new UsernameNotFoundException("user naot found"+username));
        return new
    }
}
