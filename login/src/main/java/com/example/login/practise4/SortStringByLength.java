package com.example.login.practise4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortStringByLength {

    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

        listOfStrings.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
 listOfStrings.stream()
                 .map(s->Character.toLowerCase(s.charAt(0))+s.substring(1))
                         .forEach(System.out::println);
       listOfStrings
               .stream()
               .collect(Collectors.groupingBy(String::length))
               .entrySet()
               .stream()
               .sorted(Comparator.comparingInt(Map.Entry::getKey))
               .forEach(System.out::println);



    }
}
