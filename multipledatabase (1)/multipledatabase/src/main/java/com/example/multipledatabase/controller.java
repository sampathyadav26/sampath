//package com.example.multipledatabase;
//
//import com.example.multipledatabase.corn.CornSheduling;
//import com.example.multipledatabase.db1repo.bookRepo;
//
//import com.example.multipledatabase.db2entity.Users;
//import com.example.multipledatabase.db2repo.userRepo;
//import com.example.multipledatabase.entity.Book;
//import org.apache.el.stream.Stream;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//public class controller {
//
//    @Autowired
//    private CornSheduling cornSheduling;
//     @Autowired
//    private userRepo  userRepo;
//    @Autowired
//    private bookRepo  bookRepo;
//    @Value("${cron.job.time}")
//    private String scheduledtime;
//    @PostMapping("/adduser")
//    public Users addUser(@RequestBody Users user){
//
//        return  userRepo.save(user);
//    }
//
//    @PostMapping("/addbooks")
//    public Book addBooks(@RequestBody Book book){
//        return bookRepo.save(book);
//    }
//
//    @GetMapping("/runjob")
//    @Scheduled(cron = scheduledtime, zone = "Asia/Kolkata")
//    public void run(){
//        //System.out.println(name);
//        cornSheduling.running();
//    }
//}
