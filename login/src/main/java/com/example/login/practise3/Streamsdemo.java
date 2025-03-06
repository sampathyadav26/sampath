package com.example.login.practise3;

import java.util.*;
import java.util.stream.Collectors;

public class Streamsdemo {

    public static void main(String[] args) {

        List<Integer>  arr  = Arrays.asList(12, 4, 6, 7,12, 9, 3,6, 2, 8, 4,7,18,20);

        List<Integer> arr1=Arrays.asList(1,2,3,4,5,6,2,4,5);
        Integer secondmax=arr1.stream().distinct().sorted((a,b)->b>a?1:-1).skip(1).findFirst().get();
        arr1.stream().distinct().sorted((a,b)->b>a ?1:-1).skip(1).findFirst().ifPresent(System.out::println);
        System.out.println(secondmax);
        System.out.println("--even number--");
        arr.stream().filter(n->n%2==0)
                .forEach(System.out::println);
        System.out.println("--numbers start with one----");
         arr.stream().map(n->""+n).filter(n->n.startsWith("1")).forEach(System.out::println);
        System.out.println("----Odd numbers---");
        arr.stream().filter(n->n%2!=0)
                .forEach(System.out::println);

        System.out.println("-----Max number---");
        arr.stream().max(Integer::compareTo).ifPresent(System.out::println);

        Integer max=arr.stream().max((a,b)->a>b?1:-1).get();
        System.out.println(max);

        System.out.println("---min numbers---");
        arr.stream().min(Integer::compareTo)
                .ifPresent(System.out::println);

        String  name="javaji";
        System.out.println("first non repeated character");
        name.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c, HashMap::new,Collectors.counting()))
                .entrySet().stream().filter(n->n.getValue()==1).findFirst().ifPresent(System.out::println);

        System.out.println("first non repeated number");
        arr.stream().collect(Collectors.groupingBy(c->c, Collectors.counting()))
                .entrySet().stream().filter(n->n.getValue()==1)
                .forEach(System.out::println);
        System.out.println("---duplicates----");
        arr.stream().collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet().stream().filter(n->n.getValue()==2)
                .forEach(System.out::println);
        System.out.println("--only character----");
        String str="S&am123path@";
        str.chars().mapToObj(c->((char)c))
                .collect(Collectors.toList())
                .stream().filter(Character::isAlphabetic)
                .forEach(System.out::println);
        System.out.println("--special character----");
        str.chars().mapToObj(c->(char)c)
                .collect(Collectors.toList())
                .stream().filter(c->!Character.isLetterOrDigit(c))
                .forEach(System.out::println);
        System.out.println("-----sum of digits-----");
       Optional<Integer> sum= arr.stream().reduce((a, b)->a+b);
        System.out.println(sum.get());

        System.out.println("--unique number---");
       List<Integer> unique= arr.stream().distinct().collect(Collectors.toList());
       unique.stream().forEach(System.out::println);


        System.out.println("-----------------------------------------");
        List<Integer> numbers = Arrays.asList(10,20,10,20,56,6,10,100);

        //List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4);

        numbers.stream()
                .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(s -> s.getValue() >= 2)
                .skip(1)
                .findFirst()
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("No valid element found")
                );


        //System.out.println(second.getKey());

        HashSet<Integer> seen = new LinkedHashSet<>();
        HashSet<Integer> duplicates = new LinkedHashSet<>();

        Optional<Integer> result = numbers.stream()
                .filter(n-> !seen.add(n))
                .filter(duplicates::add)
                .skip(1)
                .findFirst();

        result.ifPresentOrElse(
                (n) -> System.out.println("Second duplicate is: "+n),
                () -> System.out.println("Second duplicate not found!!")
        );
    }
}
