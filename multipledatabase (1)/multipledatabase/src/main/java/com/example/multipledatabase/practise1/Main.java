package com.example.multipledatabase.practise1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Players> players=new ArrayList<>();
        players.add(new Players("yuvi",100,"batsmen"));
        players.add(new Players("rohit",150,"batsmen"));
        players.add(new Players("shami",50,"bowler"));
        players.add(new Players("bumrah",45,"bowler"));


       Optional<Integer> sum= players.stream().map(s->s.getScore()).reduce((a, b)->a+b);
        System.out.println(sum.get());

        Map<String,List<Players>> skillset=players.stream()
                .collect(Collectors.groupingBy(s->s.getType()));

        skillset.forEach((key,value)-> System.out.println(key+""+value));

        players.stream().map(s->s.getType()).distinct().forEach(System.out::println);
        System.out.println("---------------");
        players.stream().sorted(Comparator.comparing(Players::getType)).forEach(System.out::println);


        System.out.println("--------------------");
        players.stream().sorted((a,b)->b.getScore()>a.getScore()?1:-1).skip(1).findFirst().ifPresent(System.out::println);
    }
}
