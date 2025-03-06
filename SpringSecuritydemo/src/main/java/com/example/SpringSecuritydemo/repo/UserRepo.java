package com.example.SpringSecuritydemo.repo;

import com.example.SpringSecuritydemo.entity.UserDemo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<UserDemo,Integer> {

    Optional<UserDemo> findByuname(String userDemo);
}
