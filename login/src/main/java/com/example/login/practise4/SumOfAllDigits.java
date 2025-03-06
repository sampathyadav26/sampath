package com.example.login.practise4;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllDigits {

    public static void main(String[] args) {

        int i=15623;

       Integer sum= Stream.of(i)
                .map(n->n.toString().split(""))
               // .forEach(System.out::println);
             .flatMap(Arrays::stream)
               // .forEach(System.out::println);
               .collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sum);
    }
}
