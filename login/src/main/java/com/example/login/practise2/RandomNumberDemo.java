package com.example.login.practise2;

import java.util.Random;
import java.util.stream.Stream;

public class RandomNumberDemo {


    public static void main(String[] args) {

        Random random=new Random();
        random.ints(10,99).limit(5).forEach(System.out::println);
    }
}
