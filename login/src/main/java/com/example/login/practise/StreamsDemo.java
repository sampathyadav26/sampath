package com.example.login.practise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsDemo {

    public static void main(String[] args) {

        List<Employee> employe=new ArrayList();
        employe.add( new Employee(1,"sampath",1500000.0,28));
        employe.add(new Employee(2,"karthik",1400000.0,27));
        employe.add(new Employee(2,"Mahesh",1600000.0,28));
        employe.add(new Employee(3,"Bhavitha",700000.0,23));


        employe.stream().filter(p->p.getName().startsWith("Ma")).forEach(System.out::println);

        employe.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);

        employe.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);

       List  names= employe.stream().map(p->p.getName()).collect(Collectors.toList());
       //names.forEach(System.out::println);
        employe.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);


        String var="Sampath";
        var.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet()
                .forEach(System.out::println);
//        list.stream().collect(Collectors.groupingBy(Employee::getName));
//        list.forEach(System.out::println);

       Integer sum= employe.stream().map(p->p.getAge()).collect(Collectors.summingInt(c->c));
       System.out.println(sum);
      // System.out.println(sum);




    }
}
