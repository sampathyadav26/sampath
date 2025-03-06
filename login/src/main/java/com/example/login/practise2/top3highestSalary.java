package com.example.login.practise2;

import java.util.*;
import java.util.stream.Collectors;

public class top3highestSalary {


    public static void main(String[] args) {

//        List<Integer> top3salary= Arrays.asList(10,20,30,40,50,60);
//
//        top3salary.stream().sorted(Comparator.reverseOrder()).limit(3)
//                .forEach(System.out::println);

        String name="sampath";
        name.chars().mapToObj(c->(char)c)
                .collect(Collectors.toList())
                        .stream()
                .collect(Collectors.groupingBy(s->s, LinkedHashMap::new,Collectors.counting())).entrySet()
                .stream()
                .filter(s->s.getValue()==1)
                .findFirst()
                .stream().forEach(System.out::println);

    }
}
