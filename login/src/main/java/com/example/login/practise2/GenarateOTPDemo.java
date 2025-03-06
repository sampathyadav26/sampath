package com.example.login.practise2;

import java.util.Random;
import java.util.stream.IntStream;

public class GenarateOTPDemo {

    public static void main(String[] args) {

        Random random=new Random();

        int otp=1000+ random.nextInt(9000);

        System.out.println(otp);

    }
}
