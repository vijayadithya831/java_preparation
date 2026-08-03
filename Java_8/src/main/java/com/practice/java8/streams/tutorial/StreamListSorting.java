package com.practice.java8.streams.tutorial;

import com.practice.dao.impl.ProjectDAOImpl;
import com.practice.dao.interfaces.ProjectDAO;
import com.practice.model.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {

    public static final ProjectDAO projectDAO = new ProjectDAOImpl();

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
        // Using Comparator.naturalOrder()/reverseOrder() methods
//        fruits.stream().sorted(Comparator.reverseOrder()).sorted(Comparator.naturalOrder()).forEach(System.out::println);

//        System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
        // Using Lambda to define Comparable functional interface
//        fruits.stream().sorted((o1, o2) ->o2.compareTo(o1)).forEach(System.out::println);

//        System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
        // Using only sorted method to get ascending order by default
        fruits.stream().sorted().forEach(System.out::println);

        // Sorting a list of employees based on their salary
        List<Employee> employeeList = projectDAO.getEmployees();
//        employeeList.forEach(System.out::println);
        List<Employee> sortedList = employeeList.stream()
                .sorted((o1, o2)  -> (o2.getSalary().subtract(o1.getSalary())).intValue()                    )
                .collect(Collectors.toList());

        List<Employee> sortedList1 = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
//                        .thenComparing(Employee::getAge))
                .collect(Collectors.toList());

//        List<Employee> sortedList2 = employeeList.stream()
//                .sorted(Comparator.comparing(Employee::getSalary)
//                        .thenComparing(Employee::getEmpId))
//                .collect(Collectors.toList());

        sortedList.forEach(System.out::println);
        System.out.println("*****************");
        sortedList1.forEach(System.out::println);
        System.out.println("*****************");
//        sortedList2.forEach(System.out::println);
    }



}
