package com.example.login.practise4;

import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";

        inputString.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet()
                .stream()
                .forEach(System.out::println);
    }
}
