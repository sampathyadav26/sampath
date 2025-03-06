package com.example.login.practise;

import java.util.*;
import java.util.stream.Collectors;

public class streamDemo2 {

    public static void main(String[] args) {
        List<Integer> arr  = Arrays.asList(12, 4, 6, 7,12, 9, 3,6, 2, 8, 4,7);

        List<Integer> numbers = Arrays.asList(10,20,10,20,56,6,10,100);
         String str="S&am123path@";
         str.chars().mapToObj(c->(char)c).collect(Collectors.toList()).stream().filter(Character::isAlphabetic).forEach(System.out::print);
        System.out.println("---------------------------");

        Set<Integer> seen=new LinkedHashSet<>();
        Set<Integer> duplicates=new LinkedHashSet<>();

          arr.stream().filter(n->!seen.add(n))
                  .filter(duplicates::add)
                  .skip(1).findFirst()
                  .ifPresent(System.out::println);

        System.out.println("-------------");
//       // Optional<Integer> sum=Arrays.stream(arr).boxed().reduce((a, b)->a+b);
//        System.out.println(sum);
//        System.out.println("---max number");
//        Arrays.stream(arr).boxed().max(Integer::compareTo).ifPresent(System.out::println);
//        System.out.println("----duplicates values-");
//        Arrays.stream(arr).boxed().collect(Collectors.groupingBy(c->c,Collectors.counting())).entrySet()
//                .stream().filter(p->p.getValue()>=2).forEach(System.out::println);
//        System.out.println("--------");
//        String  name="javaj";
//        name.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting())).entrySet()
//                .stream().filter(p->p.getValue()==1).forEach(System.out::println);
//        System.out.println("---------distinct element---");
//        Arrays.stream(arr).boxed().distinct().forEach(System.out::println);
//        System.out.println("----non repeated numbers----");
//        Arrays.stream(arr).boxed().collect(Collectors.groupingBy(n->n, LinkedHashMap::new,Collectors.counting()))
//                .entrySet().stream().filter(p->p.getValue()==1).forEach(System.out::println);

    }
}
