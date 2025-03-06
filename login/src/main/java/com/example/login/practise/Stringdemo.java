package com.example.login.practise;

import org.apache.logging.log4j.util.PropertySource;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stringdemo {
    
    public static void main(String[] args) {

        String str="Sampath";
        str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()==1).findFirst().ifPresent(System.out::println);
        int num=3564;
        Optional<Integer> sum= Optional.of(Integer.toString(num).chars().map(Character::getNumericValue).sum());
        System.out.println("Sum :"+sum.get());


      System.out.println("-----max number-------");
      int arr[]={1,2,4,6,3,7,8,2,8,9,-1};
        System.out.println("=======sum of integer========");
     Optional<Integer> sum1= Arrays.stream(arr).boxed().reduce((a, b)->a+b);
        System.out.println(sum1.get());

        Optional<Integer> max = Arrays.stream(arr).boxed().collect(Collectors.toList()).stream().max(Integer::compareTo);
        System.out.println("maximum number :"+max);

        System.out.println("-----min number-------");
        Stream<Integer> sorted = Arrays.stream(arr).boxed().collect(Collectors.toList()).stream().sorted();
        sorted.findFirst().ifPresent(System.out::println);
    }
}
