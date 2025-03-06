package com.example.multipledatabase.corn;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CornSheduling {


    public void running(){
        System.out.println("current time and date :"+ LocalDateTime.now());
    }
}
