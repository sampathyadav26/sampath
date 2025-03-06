package com.example.Springjwt.controller;

import com.example.Springjwt.config.MyUserDetailService;
import com.example.Springjwt.model.AruthenticateResponse;
import com.example.Springjwt.model.AuthenticationRequest;
import com.example.Springjwt.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private MyUserDetailService myUserDetailService;

    @Autowired
    private TokenUtil tokenUtil;

    @GetMapping("/hi")
    public String hello(){
        return "welocme";
    }

    @PostMapping("/authenticate")
    public ResponseEntity<?> createToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
       try {

           authenticationManager.authenticate(
                   new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(),authenticationRequest.getPassword())
           );
       }
       catch (BadCredentialsException e){
           throw  new Exception("Incorrect username or password",e);
       }
     final UserDetails userDetails= myUserDetailService.loadUserByUsername(authenticationRequest.getUsername());

       final  String jwt= tokenUtil.fetchUsernameByDecodingToken(authenticationRequest.getUsername());

       return ResponseEntity.ok(new AruthenticateResponse(jwt));
    }
}
