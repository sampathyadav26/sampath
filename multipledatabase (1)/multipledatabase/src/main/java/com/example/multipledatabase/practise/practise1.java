package com.example.multipledatabase.practise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class practise1 {

    public static void main(String[] args) {

        String s = "jakasj";
        s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(st -> st.getValue() == 1)
                .findFirst()
                .ifPresent(System.out::println);


        System.out.println("=========Even Number======");
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        listOfIntegers.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
        System.out.println("========Odd Numbers==========");
        listOfIntegers.stream()
                .filter(i -> i % 2 != 0)
                .forEach(System.out::println);
        System.out.println("==============");
        listOfIntegers.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0)).entrySet().stream()
                .forEach(System.out::println);

        System.out.println("**********Remove Duplicate******");
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

        listOfStrings.stream().distinct().forEach(System.out::println);


        System.out.println("==========Frequency of Each Character========");

        String inputString = "Java Concept Of The Day";

        inputString.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .forEach(System.out::println);

        System.out.println("=========Frequency of Each Element");
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        stationeryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .forEach(System.out::println);

        System.out.println("=====list of elements in reverse order");
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

        decimalList.stream()
                .sorted(Comparator.reverseOrder()).forEach(System.out::println);


        System.out.println("=========String joiner=====");
        List<String> listOfStrings1 = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        listOfStrings1.stream().collect(Collectors.joining(",","[","]")).chars().mapToObj(c->(char)c)
                .collect(Collectors.toList()).stream()
                .forEach(System.out::print);

        System.out.println("========multiple of 5=======");
        List<Integer> listOfIntegers1 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        listOfIntegers1.stream().filter(i->i%5==0).forEach(System.out::println);


        System.out.println("================max and min==========");
        List<Integer> listOfIntegers2 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        listOfIntegers2.stream().max(Integer::compareTo).ifPresent(System.out::println);
        System.out.println("==min===");
        listOfIntegers2.stream().min(Integer::compareTo).ifPresent(System.out::println);

        System.out.println("=========merging Arrays======");

        int[] a = new int[] {4, 2, 7, 1};

        int[] b = new int[] {8, 3, 9, 5};

        IntStream.concat(Arrays.stream(a),Arrays.stream(b)).mapToObj(c->c).sorted().forEach(System.out::println);

        System.out.println("=========max 3====");
        List<Integer> listOfIntegers3 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        listOfIntegers3.stream().sorted((c,d)->d-c).limit(3).forEach(System.out::println);
        System.out.println("=========min 3=======");
        listOfIntegers3.stream().sorted((e,f)->e-f).limit(3).forEach(System.out::println);


        System.out.println("=====String Are Anagram=====");
        String s1 = "RaceCar";
        String s2 = "CarRace";

  StringBuilder stringBuilder=new StringBuilder("RaceCar");
  StringBuilder stringBuilder1=new StringBuilder("CarRace");
  int count=0;
   if(stringBuilder.length()!=stringBuilder1.length()){
       System.out.println("strings are not anagaram");
   }else {

       for (int i = 0; i < stringBuilder1.length(); i++) {

           for (int j = 0; j < stringBuilder.length(); j++) {

               if (stringBuilder1.charAt(i) == stringBuilder.charAt(j)) {
                   count++;
                   stringBuilder.deleteCharAt(j);
                   break;
               }
           }

       }
   }
       if(stringBuilder1.length()==count){
           System.out.println("Strings are Anagaram");
       }else {
           System.out.println("Strings are not Anagaram");
       }


        System.out.println("===========sum of digits=====");
        int i = 15623;

       Integer sum= Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));

        System.out.println("sum"+sum);

        System.out.println("====sort them Accorung to length");
        List<String> listOfStrings4 = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

        listOfStrings4.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);

        System.out.println("======common elements between twon arrays=======");
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

        list1.stream().filter(list2::contains).forEach(System.out::println);


        System.out.println("===reverse each word ======");
        String str = "Java Concept Of The Day";

       String reverse= Arrays.stream(str.split(" "))
                .map(word->new StringBuffer(word).reverse()).collect(Collectors.joining(" "));

        System.out.println("reverse  "+reverse);

        System.out.println("====list Strings Start with number====");

        List<String> listOfStrings5 = Arrays.asList("0ne", "2wo", "3hree", "Five", "Six");

        listOfStrings5.stream()
                .filter(t->Character.isDigit(t.charAt(0))).forEach(System.out::println);
           listOfStrings5.stream()
                   .filter(v->Character.isDigit(v.charAt(0))).forEach(System.out::println);

        String str2="madam";

      //  System.out.println(str2.length()-1);

      Boolean ispaillindrome=  IntStream.range(0,str2.length()).noneMatch(j->str2.charAt(j) !=str2.charAt(str2.length()-j-1));

      if(ispaillindrome){
          System.out.println("pallindrome");
      }else{
          System.out.println("not pallindrome");
      }



         String str5="world hello";

        String[] str6=str5.split(" ");

        String rev="";

        int len=str6.length-1;

        for(int k=len;k>=0;k--){
             rev=rev +" "+str6[k];
        }

        System.out.println("reverseword  " +rev);


    }
}
