package com.example.multipledatabase.practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestDemo1 {

    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,0,0,1,0,1);

        List<Integer> even=list.stream().filter(n->n%2==0).collect(Collectors.toList());
        List<Integer> odd=list.stream().filter(n->n%2!=0).collect(Collectors.toList());

        Stream.concat(even.stream(),odd.stream()).forEach(System.out::println);


    }
}
