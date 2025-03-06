package com.example.login.practise;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsDemo1 {

    public static void main(String[] args) {

        int arr[] = {2, 4, 6, 7, 9, 3, 2, 8, 4, 6,6};
        //   output 7,9,3,8
     Optional<Integer> sum= Arrays.stream(arr).boxed().collect(Collectors.toList()).stream().reduce((a, b)->a+b);
     System.out.println("Sum : "+sum.get());
     System.out.println("----------------------");
        Arrays.stream(arr).boxed().collect(Collectors.toList()).stream().distinct().forEach(System.out::println);
        System.out.println("-------------------");
     Arrays.stream(arr).boxed().collect(Collectors.groupingBy(ca->ca,Collectors.counting())).entrySet().stream().collect(Collectors.partitioningBy(p->p.getValue()==1,Collectors.mapping(Map.Entry::getKey,Collectors.toList()))).get(true).forEach(System.out::println);

     System.out.println("---------------------------");

     Arrays.stream(arr).boxed()
             .collect(Collectors.groupingBy(c->c,HashMap::new,Collectors.counting()))
             .entrySet().stream().filter(p->p.getValue()==1).findFirst().ifPresent(System.out::println);

     System.out.println("----------find first non repeated  number-----------");
     Arrays.stream(arr).boxed().collect(Collectors.groupingBy(c->c,HashMap::new,Collectors.counting())).entrySet()
                     .stream().filter(p->p.getValue()==1).map(Map.Entry::getKey) // Extract the number (key) from the entry
                .findFirst().ifPresent(System.out::println);
     System.out.println("-------------------------------");
        Arrays.stream(arr).boxed().sorted(Integer::compareTo).forEach(System.out::println);

    Arrays.stream(arr).boxed().sorted();
        System.out.println("-------------------");
//       Arrays.stream(arr).collect(Collectors.groupingBy(a->a,Collectors.counting()))
        Arrays.stream(arr).boxed().collect(Collectors.groupingBy(c->c,Collectors.counting())).entrySet().stream().filter(p->p.getValue()==1).forEach(System.out::println);

        String  name="javaj";
        name.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet().stream().filter(p->p.getValue()==1).forEach(System.out::println);

        System.out.println("-----------------");
        name.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(p->p.getValue()==1).findFirst().ifPresent(System.out::println);

        System.out.println("----------------Duplicates using streams-------------");
        Arrays.stream(arr).boxed().collect(Collectors.groupingBy(c->c,Collectors.counting())).entrySet().stream().filter(p->p.getValue()>=2).forEach(System.out::println);
        System.out.println("----Duplicates with more time repeated----------");
        Arrays.stream(arr).boxed().collect(Collectors.groupingBy(c->c,Collectors.counting())).entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).findFirst().ifPresent(System.out::println);
    }
}
