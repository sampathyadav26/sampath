package com.example.login.config;

public class practice {
    public static void main(String[] args) {
        String s = "i like java";
        StringBuilder builder=new StringBuilder(s.trim().replaceAll("\\s+", " ")).reverse();
        String result=new String();
        result=builder.substring(1);
    }
//    public static String reverseEachWord(String str) {
//        String[] words = str.split(" ");
//        StringBuilder result = new StringBuilder();
//
//        for (int i = words.length - 1; i >= 0; i--) {
//            result.append(new StringBuilder(words[i]).reverse()).append(" ");
//        }
//
//        return result.toString().trim();
////            String[] words = str.split(" ");
////            StringBuilder result = new StringBuilder();
////
////            for (String word : words) {
////                result.append(new StringBuilder(word).reverse()).append(" ");
////            }
////            return result.toString().trim();
//        }
}
