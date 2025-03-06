package com.example.multipledatabase.practise;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " | " + department + " | " + salary;
    }
}

 class MaxSalaryByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 80000),
                new Employee("Bob", "IT", 95000),
                new Employee("Charlie", "HR", 60000),
                new Employee("David", "HR", 70000),
                new Employee("Eve", "Finance", 75000));


        employees.stream().collect(Collectors.groupingBy(s->s.department,
                Collectors.maxBy(Comparator.comparingDouble(e->e.salary))))
                .forEach((d,e)->{
                    System.out.println(d+"->"+e.get());
                });

        // Find the max salary in each department
//        Map<String, Optional<Employee>> maxSalaryByDept = employees.stream()
//                .collect(Collectors.groupingBy(
//                        e -> e.department,
//                        Collectors.maxBy(Comparator.comparingDouble(e -> e.salary))
//                ));
//
//        // Print results
//        maxSalaryByDept.forEach((dept, emp) ->
//                System.out.println(dept + " -> " + emp.orElse(null))
//        );
    }
}

