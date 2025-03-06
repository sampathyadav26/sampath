package com.example.multipledatabase;

public class ReverseStringdemo {

    public static void main(String[] args) {

        String s="i like java";

       String str= s.trim();
       String str3=str.replaceAll("\\s+","");
       int len=str3.length();
         String output="a vaje kili";
        StringBuilder stringBuilder=new StringBuilder(str3);
        stringBuilder.reverse();
        //System.out.println(stringBuilder);
        String result=stringBuilder.substring(0,1)+" "+stringBuilder.substring(1,5)+" "+stringBuilder.substring(5);
        System.out.println(result);


        String rev="";
        for(int i=len-1;i>=0;i--){
            rev=rev+str3.charAt(i);
        }
        System.out.println(rev);
       String rev4="";
        for(int i=0;i<=rev.length()-1;i++){
           // rev4 = rev4 + rev.charAt(i);
            System.out.print(rev.charAt(i));
            if(i==0||i==4){
                System.out.print(" ");
            }
        }
    }


}
