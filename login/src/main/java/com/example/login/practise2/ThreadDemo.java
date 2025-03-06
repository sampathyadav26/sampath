package com.example.login.practise2;

public class ThreadDemo extends Thread {


    public  void run(){
        System.out.println("my Thrad is running by extending the Thread Class ");
    }

    public static void main(String[] args) {

        ThreadDemo obj=new ThreadDemo();
        obj.start();
    }
}
