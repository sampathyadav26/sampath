package com.example.multipledatabase.practise;

public class Anagram {

    public static void main(String[] args) {

        StringBuilder stringBuilder=new StringBuilder("carrace");
        StringBuilder stringBuilder1=new StringBuilder("racecar");
        int count =0;
        for(int i=0;i<stringBuilder.length();i++){
            for(int j=0;j<stringBuilder1.length();j++){
                if(stringBuilder.charAt(i)==stringBuilder1.charAt(j)){
                    count++;
                    stringBuilder1.deleteCharAt(j);
                }
            }
        }
        System.out.println(count);
        System.out.println("string length -->  "+stringBuilder.length());
        if(count==stringBuilder.length()){
            System.out.println("Strings are Anagram");
        }else {
            System.out.println("Strings are not Anagram");
        }
    }
}
