package com.example.login.practise2;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class DropWhileDemo {

        public static void main(String[] args) {
            List<Integer> list
                    = Stream.of(2,2,4,5,6,7,8,9,10)
                    .dropWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
            System.out.println(list);

            List<Integer> list1=Stream.of(2,4,6,3,5,6,7,9)
                    .takeWhile(n->n>4)
                    .collect(Collectors.toList());

            System.out.println(list1);


            Stream.iterate(1,i->i<10,i->i+3).forEach(System.out::println);





        }


    }

