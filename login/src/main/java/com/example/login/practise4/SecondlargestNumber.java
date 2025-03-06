package com.example.login.practise4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondlargestNumber {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        listOfIntegers
                .stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);

        listOfIntegers.stream()
                .sorted((a,b)->b>a?1:-1)
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
