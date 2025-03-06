package com.example.login.practise4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streamdemo1 {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);


        List<Integer> even=new ArrayList<>();
        List<Integer> odd=new ArrayList<>();
        listOfIntegers.stream()
                .collect(Collectors.partitioningBy(n->n%2==0))
                .entrySet()
                .stream()
                .forEach(System.out::println);

        listOfIntegers.stream()
                .collect(Collectors.groupingBy(i->i%2==0?"Even":"odd"))
                .entrySet()
                .stream()
                .forEach(System.out::println);


    }
}
