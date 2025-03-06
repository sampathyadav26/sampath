package com.example.login.practise;

import java.util.*;
import java.util.stream.Collectors;

public class SecondDuplicateNumber {

    public static void main(String[] args) {

        int arr[]={1,3,5,8,1,5,3};

        Set<Integer> set=new LinkedHashSet<>();

        Arrays.stream(arr).boxed()
                .collect(Collectors.toList())
                .stream()
                .collect(Collectors.groupingBy(s->s, LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(s->s.getValue()==2)
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);

    }
}
