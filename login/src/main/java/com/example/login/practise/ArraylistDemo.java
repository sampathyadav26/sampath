package com.example.login.practise;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraylistDemo {

    public static void main(String[] args) {
        List<Integer> num=  Arrays.asList(2,4,6,7,9,10,47);
        List<Integer> num1=  Arrays.asList(0,4,6,71,92,101,47);
        List<Integer> num2=  Arrays.asList(23,41,6,73,95,10,476);

        List<List<Integer>> flatmapademo=new ArrayList<>();
        flatmapademo.add(num);
        flatmapademo.add(num1);
        flatmapademo.add(num2);
        System.out.println("=======even number======");
        flatmapademo.stream().flatMap(s->s.stream()).map(s->s*2).forEach(System.out::println);

        flatmapademo.stream().flatMap(p->p.stream()).filter(p->p%2==0).forEach(System.out::println);

        System.out.println("--------------------------");
//        num.stream().filter(e->(Integer)e% 2==0).forEach(System.out::println);
//        System.out.println("-----------------");
//        num.stream().max(Integer::compareTo).ifPresent(System.out::println);
//        System.out.println("-----------------");
//        num.stream().min(Integer::compareTo).ifPresent(System.out::println);
//        System.out.println("-----------------");
//        Optional<Integer> num4=num.stream().reduce((a, b)->a+b);
//        System.out.println(num4.get());
//        System.out.println("-----------------");
//        num.stream().map(e->e*2).forEach(System.out::println);
//        System.out.println("----------------");
//        num.stream().filter(e->e>5).map(e->e*2).max(Integer::compareTo).ifPresent(System.out::println);


        String str="sampath";

//        str.chars().mapToObj(c->(char)c)
//                .collect(Collectors.toList())
//                .stream()
//                .map(Character->str.substring(0,2)+str.substring(2,5).toUpperCase()+str.substring(5))
//                .forEach(System.out::println);

        Stream.of(str)
                .map(s->s.substring(0,2)+s.substring(2,5).toUpperCase()+s.substring(5))
                .forEach(System.out::println);
    }
}
