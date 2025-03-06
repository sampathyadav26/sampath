package com.example.multipledatabase.practise;

import java.util.Arrays;

public class FirstCharacterAndIndexNumber {

    public static void main(String[] args) {

        String str="hello world game week";

        int[] currentIndex= {0};
        Arrays.stream(str.trim().split("\\s+")).forEach(word->{
                System.out.println(word + " -> " + currentIndex[0] + "," + word.charAt(0));
                currentIndex[0] +=word.length()+1;
        });
    }
}
