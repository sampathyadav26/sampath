package com.example.login.practise4;

import io.swagger.v3.oas.models.security.SecurityScheme;

import java.util.Arrays;
import java.util.List;

public class MaxAndMin {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        listOfIntegers
                .stream()
                .max(Integer::compareTo)
                .ifPresent(System.out::println);
        System.out.println("-------------------");
      listOfIntegers.stream()
                      .max(Integer::compareTo)
                              .ifPresent(System.out::println);
        System.out.println("-------------------");
        listOfIntegers
                .stream()
                        .max((a,b)->a>b?1:-1)
                                .ifPresent(System.out::println);

        System.out.println("-------minimum number------------");
        listOfIntegers
                .stream()
                .min(Integer::compareTo)
                .ifPresent(System.out::println);
    }
}
