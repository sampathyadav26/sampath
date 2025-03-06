package com.example.login.config;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Employee employee=new Employee(10,"sampath","IT",100000l);
        Employee employee5=new Employee(11,"Hemanth","IT",10000l);
        Employee employee1=new Employee(9,"Karthik","Sales",10000l);
        Employee employee2=new Employee(14,"Teja","Sales",100l);
        Employee employee6=new Employee(20,"Ajay","Testing",5000l);
        Employee employe3=new Employee(21,"Mahesh","Development",3000l);
        Employee employe4=new Employee(22,"Ajay","Finanance",60000l);

        List<Employee> list=new ArrayList<>();
        list.add(employee);
        list.add(employee1);
        list.add(employee2);
        list.add(employee6);
        list.add(employee5);
        list.add(employe3);
        list.add(employe4);

       // list.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

        list.stream().collect(Collectors.toList())
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment
                        ,Collectors.maxBy(Comparator.comparing(Employee::getSalary)))
                ).entrySet()
                .stream()
                .forEach(System.out::println);

        System.out.println("===================================");

        String str=" java like i";

        String[] split=str.split("\\s+");

        IntStream.range(0,split.length).mapToObj(ind->split[split.length-ind-1])
                .forEach(System.out::print);

    }
}
