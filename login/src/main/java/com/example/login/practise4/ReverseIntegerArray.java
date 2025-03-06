package com.example.login.practise4;

import java.util.stream.IntStream;

public class ReverseIntegerArray {
    public static void main(String[] args) {

        int[] array = new int[] {5, 1, 7, 3, 9, 6};

        IntStream.range(0,array.length)
                        .map(ind->array[array.length-ind-1])
                                .forEach(System.out::println);
        System.out.println("----------------------------------");
        IntStream.range(0,array.length)
                .map(ind->array[array.length-ind-1])
                .forEach(System.out::println);
    }
}
