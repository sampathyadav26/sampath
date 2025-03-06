package com.example.login.practise4;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        String inputString = "Java Concept Of The Day".toLowerCase();

        inputString.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(s->s, LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(s->s.getValue()==1)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
