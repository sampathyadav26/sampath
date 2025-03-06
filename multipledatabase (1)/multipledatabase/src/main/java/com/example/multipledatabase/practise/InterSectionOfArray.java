package com.example.multipledatabase.practise;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterSectionOfArray {

    public static void main(String[] args) {

        int[] firstArray={1,2,4,2};
        int[] secondArray={2,3,2};

      //  Arrays.stream(firstArray).filter(x-> Arrays.stream(secondArray).anyMatch(y->y==x)).distinct().forEach(System.out::println);
        System.out.println("========================");
        List<Integer> firstList = Arrays.asList(1, 2, 4, 2, 5, 6);
        List<Integer> secondList = Arrays.asList(2, 3, 2, 5, 7);
        System.out.println("===================");
    //    firstList.stream().filter(secondList::contains).forEach(System.out::println);


     Stream.concat(firstList.stream(),secondList.stream())
                     .distinct()
                             .forEach(System.out::println);

        System.out.println("======================");
        firstList.stream().flatMap(s->secondList.stream())
                .collect(Collectors.groupingBy(s->s,Collectors.counting()))
                .entrySet()
                .stream()
                .forEach(System.out::println);



    }
}
