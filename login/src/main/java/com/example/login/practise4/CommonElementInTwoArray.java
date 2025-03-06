package com.example.login.practise4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonElementInTwoArray {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);


        list1.stream().filter(list2::contains).forEach(System.out::println);

        System.out.println("----------------------");
        Stream.concat(list1.stream(),list2.stream())
                .collect(Collectors.groupingBy(n->n,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(a->a.getValue()>=2)
                .forEach(System.out::println);

        Stream.concat(list1.stream(),list2.stream())
                .collect(Collectors.groupingBy(n->n,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(d->d.getValue()>=2)
                .forEach(System.out::println);
    }


}
