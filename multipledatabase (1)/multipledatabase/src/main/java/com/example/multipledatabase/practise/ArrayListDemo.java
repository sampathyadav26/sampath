package com.example.multipledatabase.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(3);
        list.add(32);

//        Iterator iterator=list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//
//            System.out.println("-----------");
//            for (Integer l:list){
//                System.out.println(l);
//            }
//        }
        List<Integer> list1 = Arrays.asList(3, 6, 2, 7, 2, 9, 11, 31, 57);
        list1.stream().sorted((a, b) -> b - a).forEach(s -> {
            System.out.println(s);
        });
        System.out.println("========================");
        list1.stream().sorted((a, b) -> b > a ? 1 : -1).distinct().skip(1).findFirst().ifPresent(System.out::println);
        System.out.println("=================");
        String str = "sampath@#123";
        String str2 = "";
        String str3 = " ";
        String str4 = "";
        String str5 = "";
        String str6 = "";

        for (int i = 0; i < str.length(); i++) {
            str5 = str5 + str.charAt(i);
            if (str5.length() >= 3) {
                str5 = str5.substring(0, 3).toUpperCase() + str5.substring(3);
            }
        }
        System.out.println(  str5);


        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                str2 = str2 + str.charAt(i);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                str3 = str3 + str.charAt(i);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetterOrDigit(str.charAt(i))) {
                str4 = str4 + str.charAt(i);
            }
        }
//        System.out.println(str2);
//        System.out.println(str3);
//        System.out.println(str4);
    }


}
