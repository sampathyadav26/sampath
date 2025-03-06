package com.example.login.practise4;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {


            List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

            listOfStrings.stream().distinct()
                    .forEach(System.out::println);

        System.out.println("------------");
            listOfStrings.stream()
                    .map(c->c.startsWith("J")?c.toUpperCase():c)
                    .forEach(System.out::println);
        System.out.println("-----------------------------");
            listOfStrings.stream()
                    .map(c->c.startsWith("P")?c.toLowerCase():c)
                    .forEach(System.out::println);
    }
}
