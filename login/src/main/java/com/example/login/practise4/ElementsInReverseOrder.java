package com.example.login.practise4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ElementsInReverseOrder {

    public static void main(String[] args) {
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        decimalList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println("--second highest element--");

        decimalList.stream()
                .sorted((a,b)->b>a?1:-1).skip(1)
                .findFirst()
                .ifPresent(System.out::println);
        System.out.println("---------------");


    }
}
