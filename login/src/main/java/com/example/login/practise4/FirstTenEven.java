package com.example.login.practise4;

import java.util.stream.IntStream;

public class FirstTenEven {

    public static void main(String[] args) {

        IntStream.range(1,11)

                .filter(i->i%2==0)
                .forEach(System.out::println);
    }
}
