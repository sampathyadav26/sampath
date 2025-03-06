package com.example.multipledatabase.practise;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Testdemo {

    public static void main(String[] args) {

        List<Integer> list3=Arrays.asList(1,4,6,7,3,6,7,4,8,10);
        List<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);

        List<Integer> list1=list.stream().filter(s->s==0).collect(Collectors.toList());
        //list1.forEach(System.out::println);
        List<Integer> list2=list.stream().filter(s->s==1).collect(Collectors.toList());
       // list2.forEach(System.out::println);
       // System.out.println("=======");
        Stream.concat(list1.stream(),list2.stream()).forEach(System.out::println);

        List<Integer> sortedList = list.stream()
                .sorted(Comparator.comparingInt(i -> i)) // Sort 0s first, 1s last
                .collect(Collectors.toList());
        System.out.println("-----------------new ----------------");

        list.stream().sorted(Comparator.comparing(Integer::valueOf)).forEach(System.out::println);
        System.out.println("---------desc---------");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("----------------------------------");
        list.stream().sorted(Comparator.comparingInt(i->i)).forEach(System.out::println);
        System.out.println("--------------------");
        list.stream().sorted((a,b)->b>a?1:-1).forEach(System.out::println);


        Map<Integer, List<Integer>> collect = list.stream().collect(Collectors.groupingBy(s -> s));
        list.stream().collect(Collectors.partitioningBy(s->s%2==1)).entrySet().stream().forEach(System.out::println);
    }
}
