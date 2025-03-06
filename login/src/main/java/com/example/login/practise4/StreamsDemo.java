package com.example.login.practise4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 4, 2, 6, 7, 2, 9, 10, 4, 81, 6, 100, 9);



        System.out.println("even number");
        list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        System.out.println("odd numbers");
        list.stream().filter(n -> n % 2 != 0).forEach(System.out::println);

        System.out.println("distinct numbers");
        list.stream().distinct().forEach(System.out::println);

        System.out.println("Sorted order");
        list.stream().sorted(Integer::compareTo).forEach(System.out::println);

        System.out.println("second max element");
        list.stream().sorted((a, b) -> b > a ? 1 : -1).skip(1).findFirst().ifPresent(System.out::println);
        list.stream().sorted((a, b) -> a.compareTo(b)).forEach(System.out::println);

        System.out.println("print elements starting with ");
        list.stream().map(n -> n.toString()).filter(n -> n.startsWith("1")).forEach(System.out::println);


        System.out.println("------second repeated duplicate number----");
        List<Integer> numbers = Arrays.asList(10, 20, 10, 20, 56, 6, 10, 100);

        Set<Integer> set = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

//        numbers.stream()
//                .filter(n->!set.add(n))
//                .filter(duplicates::add)
//                .skip(1)
//                .findFirst()
//                .ifPresent(System.out::println);

        numbers.stream()
                .collect(Collectors.groupingBy(n -> n, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(n -> n.getValue() >= 2)
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);

        String str = "hellow world";
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        long vowelcount = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList())
                .stream().filter(vowels::contains)
                .count();
        System.out.println(vowelcount);

        String[] vowels2 = {"a", "e", "i", "o", "u"};
        Long count = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList())
                .stream()
                .filter(c -> Arrays.asList(vowels2).contains(String.valueOf(c)))
                .count();
        System.out.println(count);

        System.out.println("unique characters");
        str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList())
                .stream().distinct().forEach(System.out::print);


        System.out.println("----------reverse a word using stream -------------");
        String str1 = "world hello";


        String[] str4 = str1.split("\\s");
        IntStream.range(0, str4.length).mapToObj(ind -> str4[str4.length -ind - 1] + " ")
                .forEach(System.out::print);

        List<String> list1 = Arrays.asList("sampath", "karthik", "mahesh", "bhavitha");
        list1.stream()
                .collect(Collectors.groupingBy(String::length))
                .entrySet()
                .stream()
                .sorted(Comparator.comparingInt(Map.Entry::getKey))
                .forEach(System.out::println);


    }

}
