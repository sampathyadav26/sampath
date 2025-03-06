package com.example.login.practise2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

    public static void main(String[] args) {

       List< List<Integer>>  num= Arrays.asList(Arrays.asList(1,15,17,3,9 ),
                Arrays.asList(7,13,7,2,19,1),
                Arrays.asList(89,145,23,86));
     List<Integer>  num1= num.stream().flatMap(p->p.stream()).collect(Collectors.toList());

     num1.stream().map(e->e+"").filter(e->e.startsWith("1")).forEach(System.out::println);

        List< List<String>>  num3= Arrays.asList(Arrays.asList("Java","Spring","SpringBoot" ),
                Arrays.asList("React","css","Spring","Testing","SpringBoot"),
                Arrays.asList("React","JavaScript","Automation"));
        num3.stream().flatMap(e->e.stream()).filter(e->e.startsWith("S")).distinct().forEach(System.out::println);


        String str="java is awesome";

        str.replaceAll("\\s","").chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, LinkedHashMap::new,Collectors.counting())).entrySet().stream()
                .filter(e->e.getValue()>1).skip(1).limit(1).forEach(System.out::println);

    }
}
