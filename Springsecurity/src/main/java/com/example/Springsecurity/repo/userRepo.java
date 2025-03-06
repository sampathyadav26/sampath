package com.example.Springsecurity.repo;


import com.example.Springsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepo extends JpaRepository<User,Integer> {

  public   User findByuname(String uname);

}
