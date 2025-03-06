package com.example.login.practise;

import org.apache.logging.log4j.util.PropertySource;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Practise1 {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,4,6,3,8,2,9,19,10);

        System.out.println("-----------------------------------");
        list.stream()
                .filter(n->n%2==0).forEach(System.out::println);
        System.out.println("==================max number========================");

        list.stream().max(Integer::compareTo).ifPresent(System.out::println);
        System.out.println("----third highest number--");
        list.stream().sorted((a,b)->b>a?1:-1).skip(2).findFirst().ifPresent(System.out::println);






    }
}
