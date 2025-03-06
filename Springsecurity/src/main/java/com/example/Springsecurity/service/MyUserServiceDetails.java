package com.example.Springsecurity.service;

import com.example.Springsecurity.entity.User;
import com.example.Springsecurity.entity.UserDetailsImpl;
import com.example.Springsecurity.repo.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserServiceDetails implements UserDetailsService {

    @Autowired
    private userRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String uname) throws UsernameNotFoundException {
            User user=userRepo.findByuname(uname);
            if(user==null){
                throw new UsernameNotFoundException("username is not found");
            }
        return new UserDetailsImpl(user);
    }
}
