package com.example.Springsecurity.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
     @Id
     @GeneratedValue
    private int uid;

    private String uname;

    private String password;

    private String email;
   @ElementCollection
   @CollectionTable(
           name="role",
           joinColumns= @JoinColumn(name="uid")
   )
    private List<String> role;
}
