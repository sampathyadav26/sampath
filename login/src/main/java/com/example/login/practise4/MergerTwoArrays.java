package com.example.login.practise4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergerTwoArrays {

    public static void main(String[] args) {

        int[] a = new int[] {4, 2, 7, 1};

        int[] b = new int[] {8, 3, 9, 5};

        IntStream.concat(Arrays.stream(a),Arrays.stream(b))
                .sorted()
                .forEach(System.out::println);

        int[] a1 = new int[] {4, 2, 5, 1};

        int[] b1 = new int[] {8, 1, 9, 5};
   System.out.println("-------------------");
        IntStream.concat(Arrays.stream(a),Arrays.stream(b))
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("-----------minimum three Numbers --------------");
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        listOfIntegers
                .stream()
                .sorted(Comparator.naturalOrder())
                .limit(3)
                .forEach(System.out::println);
        System.out.println("------Maximum three Numbers");
        listOfIntegers
                .stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);
    }
}
