package com.example.multipledatabase.practise;

public class SingletoneDemo {

    private static SingletoneDemo obj=new SingletoneDemo();

    private SingletoneDemo(){

    }
    public static SingletoneDemo get(){
        return obj;
    }

    public void doSomething(){

    }
}
