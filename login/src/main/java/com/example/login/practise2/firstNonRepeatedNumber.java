package com.example.login.practise2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class firstNonRepeatedNumber {


    public static void main(String[] args) {


        List<Integer> list= Arrays.asList(1,2,3,4,5,1,2,3);

        list.stream().collect(Collectors.groupingBy(c->c, LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(n->n.getValue()==1).findFirst()
                .ifPresent(System.out::println);
    }
}
