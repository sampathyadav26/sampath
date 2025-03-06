package com.example.login.practise4;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Java Concept Of The Day";

       String reversed= Arrays.stream(str.split(" "))
                .map(word->new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(reversed);

        String str1= "Day the of Concept Java";

        String[] str2=str1.split(" \\s+");
        IntStream.range(0, str2.length).mapToObj(ind -> str2[str2.length -ind - 1] + " ")
                .forEach(System.out::print);

       String[] str3=str1.split("\\s+");
       IntStream.range(0,str3.length)
               .mapToObj(ind->str3[str3.length-ind-1]+" ")
               .forEach(System.out::print);

    }
}
