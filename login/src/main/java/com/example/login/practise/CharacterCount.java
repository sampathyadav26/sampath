package com.example.login.practise;

public class CharacterCount {

    public static void main(String[] args) {
        String name = "abababab";


        for (int i = 0; i < name.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < name.length(); j++) {
                if (name.charAt(i) == name.charAt(j)) {
                    count++;
                }
            }
            if(count>3){
                System.out.println(count+"    "+name.charAt(i));
            }

        }

        String str="S&am123path@";
        String s = str.replaceAll("\\W", "");

        System.out.println(s);
//        String str1="";

//        for(int i=0;i<str.length()-1;i++){
//            if(str.charAt(i)=())
//        }
    }
}
