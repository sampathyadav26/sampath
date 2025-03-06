package com.example.SpringSecuritydemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.User;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDemo  {
    @Id
    @GeneratedValue
    private int uid;

    private String uname;

    private String password;


    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> roles;
}
