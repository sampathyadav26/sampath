package com.example.multipledatabase.practise1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practise1 {


    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,6,8,3,9,20,22,31);

        List<String>  stringList=Arrays.asList("Maveric","Capgemini","Accenture","Cognizant");

        stringList.stream()
                .map(s->Character.toUpperCase(s.charAt(3))).forEach(System.out::println);
        System.out.println("==============================");
        stringList.stream()
                .map(s->s.substring(0,3)+s.substring(3,4).toUpperCase()+s.substring(4))
                .forEach(System.out::println);
        System.out.println("================================");
        stringList.stream()
                .map(s->s.charAt(3)).forEach(System.out::println);
    }
}
