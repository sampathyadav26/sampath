package com.example.login.practise;

public class FirstNonRepeatedCharacter {


    public static void main(String[] args) {

        String name="malyalam";

        for(int i=0;i<name.length();i++){

            int index2=name.lastIndexOf(name.charAt(i));
            int index3=name.indexOf(name.charAt(i));
            if(index2==index3){
                System.out.println("non repeated character : "+name.charAt(i));
                break;
            }
        }
    }
}
