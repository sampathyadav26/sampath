package com.example.login.practise;

public class ReverseString {


    public static void main(String[] args) {

        String sam="Sampath";
        String rev="";
        for(int i=sam.length()-1;i>=0;i--){
            rev=rev+sam.charAt(i);
        }
        System.out.println(rev);
    }
}
