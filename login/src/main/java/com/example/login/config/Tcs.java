package com.example.login.config;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Tcs {


    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(2,3,5,4,7,8,9);

        list.stream().filter(n->n%2!=0).forEach(System.out::println);


        String str="sampath";

        str.chars().mapToObj(c->(char)c)
                .collect(Collectors.toList())
                .stream()
                .collect(Collectors.groupingBy(s->s, LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .forEach(System.out::println);


        int a=10,b=20;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("b "+b);
        System.out.println("a "+a);
    }
}
