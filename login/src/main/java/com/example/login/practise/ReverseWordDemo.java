package com.example.login.practise;

public class ReverseWordDemo {

    public static void main(String[] args) {

        String str="how are you?";
        String[] str1=str.split(" ");
        int len=str1.length-1;
        String rev="";

        for(int i=len;i>=0;i--){

            rev =rev+str1[i]+" ";
        }

        System.out.println(rev);
    }
}
