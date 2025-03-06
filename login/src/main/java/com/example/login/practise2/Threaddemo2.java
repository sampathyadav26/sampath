package com.example.login.practise2;

public class Threaddemo2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread Running by implementing Runnable Interface");
    }

    public static void main(String[] args) {

        Threaddemo2 obj=new Threaddemo2();

        Thread obj1=new Thread(obj);
        obj1.start();
    }
}
