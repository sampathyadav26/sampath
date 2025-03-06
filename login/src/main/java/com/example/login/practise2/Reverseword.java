package com.example.login.practise2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reverseword {


    public static void main(String[] args) {
        String str="sampath is name my";

        String[] split = str.split("\\s+");

        IntStream.range(0,split.length).mapToObj(ind-> split[split.length-ind-1])

                .forEach(System.out::print);

//        String str1=  Arrays.stream(str.split(" "))
//                  .sorted(Comparator.reverseOrder())
//                  .collect(Collectors.joining(" "));
//
//        System.out.println(str1);
//
//        String reversed = Arrays.stream(str.split(" "))
//                .sorted(Comparator.reverseOrder()) // Reverse the order of the words
//                .collect(Collectors.joining(" ")); // Join the reversed words with spaces
//
//        System.out.println(reversed);
    }
}


