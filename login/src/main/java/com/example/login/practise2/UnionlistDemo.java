package com.example.login.practise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionlistDemo {

    public static void main(String[] args) {

       // List<integer> list1-[1,2,3,4,5,6];


        List<Integer> list= Arrays.asList(1,2,3,4,5);

        List<Integer> list1= Arrays.asList(4,5,6,7,8);


        List<List<Integer>> union=new ArrayList<>();
        union.add(list);
        union.add(list1);

       // union.forEach(System.out::println);
        union.stream().flatMap(x->x.stream()).distinct().forEach(System.out::println);

    }
}
