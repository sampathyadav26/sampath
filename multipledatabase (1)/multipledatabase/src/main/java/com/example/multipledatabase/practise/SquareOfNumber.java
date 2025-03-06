package com.example.multipledatabase.practise;

import java.util.Arrays;
import java.util.List;

public class SquareOfNumber {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,4,6,7,8,10);
        list.stream().map(x->x*x).forEach(System.out::println);
    }




}
