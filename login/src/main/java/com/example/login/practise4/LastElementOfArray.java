package com.example.login.practise4;

import java.util.Arrays;
import java.util.List;

public class LastElementOfArray {

    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");

        listOfStrings.stream()
                .skip(listOfStrings.size()-1).findFirst()
                .ifPresent(System.out::println);
        listOfStrings.stream()
                .skip(listOfStrings.size()-2).findFirst()
                .ifPresent(System.out::println);
    }
}
