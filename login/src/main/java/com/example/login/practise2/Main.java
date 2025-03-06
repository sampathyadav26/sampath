package com.example.login.practise2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Sample list of employees
        List<Employee> employees = Arrays.asList(
                new Employee("John", "HR", 50000),
                new Employee("Alice", "HR", 60000),
                new Employee("Bob", "HR", 55000),
                new Employee("Charlie", "HR", 52000),
                new Employee("David", "IT", 90000),
                new Employee("Eve", "IT", 95000),
                new Employee("Frank", "IT", 87000),
                new Employee("Grace", "Sales", 70000),
                new Employee("Heidi", "Sales", 72000),
                new Employee("Ivan", "Sales", 68000)
        );

  Map<String,List<Employee>>  top3=    employees.stream().collect(Collectors.groupingBy(Employee::getDepartment))
                .entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey,e->e.getValue().stream()
                        .sorted(Comparator.comparing(Employee::getSalary).reversed())
                        .limit(3)
                        .collect(Collectors.toList())));


        top3.forEach((department, topEmployees) -> {
            System.out.println("Top 3 salaries in " + department + " department:");
            topEmployees.forEach(System.out::println);
           System.out.println();
       });
        // Group by department and find top 3 salaries in each department
//        Map<String, List<Employee>> top3SalariesByDepartment = employees.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment)) // Group by department
//                .entrySet().stream() // Create a stream of entries (department -> list of employees)
//                .collect(Collectors.toMap(
//                        Map.Entry::getKey, // Key is department name
//                        entry -> entry.getValue().stream() // Stream of employees in that department
//                                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()) // Sort by salary in descending order
//                                .limit(3) // Take top 3
//                                .collect(Collectors.toList()) // Collect as a list
//                ));
//
//        // Print top 3 salaries by department
//        top3SalariesByDepartment.forEach((department, topEmployees) -> {
//            System.out.println("Top 3 salaries in " + department + " department:");
//            topEmployees.forEach(System.out::println);
//            System.out.println();
//        });
    }
}
