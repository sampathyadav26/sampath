package com.example.login.practise4;

import java.util.List;
import java.util.stream.Collectors;

public class StringsAnagaram {


    public static void main(String[] args) {

        String s1 = "RaceCar";
        String s2 = "CarRace";

     List<Character> s= s1.chars()
                .mapToObj(c->(char)c)
                .map(Character::toUpperCase)
             .sorted()
                .collect(Collectors.toList());


     List<Character> s3=s2.chars()
             .mapToObj(c->(char)c)
             .map(Character::toUpperCase)
             .sorted()
             .collect(Collectors.toList());

     if(s.equals(s3)){
         System.out.println("two Strings Anangram");
     }else {
         System.out.println("two Strings Are Not a Anagram");
     }
    }
}
