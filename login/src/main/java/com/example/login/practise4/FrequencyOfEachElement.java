package com.example.login.practise4;

import org.apache.logging.log4j.util.PropertySource;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachElement {
    public static void main(String[] args) {


        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        stationeryList.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                . map(str->str.getValue()>=2?str.getKey().toUpperCase():str.getKey())
                .forEach(System.out::println);

        stationeryList.stream()
                        .collect(Collectors.groupingBy(c->c,Collectors.counting()))
                                .entrySet()
                                        .stream()
                                                .map(str->str.getValue()>=2?str.getKey().toUpperCase():str.getKey());
        System.out.println("-----------");
        stationeryList.stream()
                .collect(Collectors.groupingBy(String::length))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, List<String>>comparingByKey().reversed())
                .forEach(System.out::println);
        System.out.println("===============================");
        stationeryList.stream()
                .distinct()
                .collect(Collectors.groupingBy(String::length))
                .entrySet()
                .stream()
                .sorted( (a,b)->Integer.compare(b.getKey(),a.getKey()))
                .forEach(System.out::println);
    }

}
