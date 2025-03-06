package com.example.multipledatabase.practise;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HashMapDemo {

    public static void main(String[] args) {

        Map<Integer,String> map=new HashMap<>();
        map.put(2,"sampath");
        map.put(5,"karthik");
        map.put(1,"Maveric");
        map.put(3,"capgemini");

     //   map.entrySet().stream().sorted(Map.Entry.comparingByKey())


        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);
        System.out.println("=================================");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

        System.out.println("===========================");
        List<Integer> list=Arrays.asList(3,6,2,7,2,9,11,31,57);
        Optional<Integer> secondmax=list.stream()
                .sorted((a,b)->b>a?1:-1).distinct().skip(1).findFirst();
        System.out.println(secondmax.get());

        System.out.println("================================");
        list.stream()
                .sorted((a,b)->b-a).forEach(System.out::println);
        System.out.println("=======================================");
        List<String> list1=Arrays.asList("Sampath","karthik","Maveric","Capgemini");
        list1.stream()
                .map(s->Character.toUpperCase(s.charAt(2))).
        forEach(System.out::println);


        System.out.println("====================================");
            list1.stream()
                .map(s->s.substring(0,1).toLowerCase()+s.toUpperCase().substring(1))
                .forEach(System.out::println);
        System.out.println("-------------------");
            list1.stream()
                    .filter(s->s.startsWith("S"))
                    .forEach(System.out::println);

        System.out.println("====================");
            list1.stream()
                    .map(s->s.substring(0,1).toLowerCase()+s.substring(1,3).toUpperCase()+s.substring(3))
                    .forEach(System.out::println);
        System.out.println("============================");

        String str="world hello";

      String[] Str1= str.split("\\s");
        IntStream.range(0,Str1.length).mapToObj(i->Str1[Str1.length-i-1]).forEach(System.out::print);


        String str1="programming";
        str1.chars().
                mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(d->d,Collectors.counting())).entrySet()
                .stream().forEach(System.out::println);
        System.out.println("-----------------------------");
        List<String> list2=Arrays.asList("Sampath@343","karthik#765","Maveric@756","Capgemini@566");
          list2.stream()
                  .flatMapToInt(String::chars)
                  .filter(s->Character.isLetter(s))
                  .forEach(c->System.out.print((char) c));

          list2.stream()
                  .flatMapToInt(String::chars)
                  .filter(s->Character.isDigit(s))
                  .forEach(c->System.out.print((char) c));
    }
}
