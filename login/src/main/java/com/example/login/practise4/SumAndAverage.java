package com.example.login.practise4;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class SumAndAverage {

    public static void main(String[] args) {

        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};

     Integer sum=   Arrays.stream(a).sum();
        System.out.println(sum);
      OptionalDouble avg=  Arrays.stream(a).average();
        System.out.println(avg);
    }
}
