package com.example.login.practise2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainDemo {


    public static void main(String[] args) {

        List<Employee1> list=new ArrayList<>();
         list.add(new Employee1(1,"Sampath",104000.0,"IT",28));
         list.add(new Employee1(2,"Mahesh",105000.0,"IT",28));
         list.add(new Employee1(3,"karthik",103000,"IT",27));
         list.add(new Employee1(4,"Vani",40000.0,"Testing",26));
         list.add(new Employee1(5,"bhvaitha",50000.0,"HR",23));
         list.add(new Employee1(6,"hemanth",40000.0,"HR",22));
         list.add(new Employee1(7,"Asish",64000,"manager",26));

        Map<String, Stream<Employee1>> collect = list.stream().collect(Collectors.groupingBy(Employee1::getDepartment)).entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().stream()
                        .sorted(Comparator.comparing(Employee1::getSalary).reversed())
                        .limit(2)));

        collect.forEach((department,employee)->{
            System.out.println("department :  "+department);
            employee.forEach(System.out::println);
            System.out.println();
        });

    }
}
