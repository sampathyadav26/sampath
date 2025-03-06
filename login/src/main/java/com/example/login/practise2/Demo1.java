package com.example.login.practise2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {

    public static void main(String[] args) {

        List<Integer> obj= Arrays.asList(17,23,65,18,15,93,17,65);
        obj.stream().map(e->e+"").filter(e->e.startsWith("1")).forEach(System.out::println);
       System.out.println("--------find first element-----");
        obj.stream().findFirst().ifPresent(System.out::println);
        System.out.println("-------count the elements in a array----");
      Long num=  obj.stream().count();
      System.out.println(num);

      System.out.println("----find out All Even  Numbers ---- ");
      obj.stream().filter(n->n%2==0).forEach(System.out::println);

        System.out.println("----find out All Odd Numbers ---- ");
        obj.stream().filter(n->n%2!=0).forEach(System.out::println);

        System.out.println("----numbers starting with 1");
        obj.stream().map(e->e+"").filter(e->e.startsWith("1")).forEach(System.out::println);


        System.out.println("-----duplicates values----");
        Set<Integer> original=new HashSet<>();
        obj.stream().filter(n->!original.add(n)).forEach(System.out::println);

        System.out.println("---max number----");
        obj.stream().max(Integer::compare).ifPresent(System.out::println);

        System.out.println("---min number----");
        obj.stream().min(Integer::compare).ifPresent(System.out::println);

        System.out.println("---sort the elements-----");
        obj.stream().sorted().forEach(System.out::println);

        System.out.println("----sorting elemets in reverse order---");
        obj.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        List<String> str=Arrays.asList("java","python","testing");
        str.stream().map(word->word.toUpperCase()).forEach(System.out::println);

       System.out.println("----maximum lenth of string----");
        str.stream().max(Comparator.comparing(String::length)).ifPresent(System.out::println);


        System.out.println("----concating two streams----");
        List<Integer> obj1= Arrays.asList(17,23,18,152,93,172,65);
        List<Integer> obj2= Arrays.asList(171,23,65,18,93,17,651);

        Stream.concat(obj1.stream(),obj2.stream()).forEach(System.out::println);

        System.out.println("---- print 10 randoms using streams----");

        Random random=new Random();
        Stream.generate(random::nextInt).limit(10).forEach(System.out::println);

    }
}
