package com.practice.java8.streams.tutorial;

import com.practice.dao.impl.ProjectDAOImpl;
import com.practice.dao.interfaces.ProjectDAO;
import com.practice.model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindElementsExample {

    public static final ProjectDAO projectDAO = new ProjectDAOImpl();

    public static void main(String[] args) {

        List<Employee> employeeList = projectDAO.getEmployees();

        List<Integer> numbers = employeeList.stream().map(employee -> Integer.parseInt(employee.getEmpId())).collect(Collectors.toList());

        Optional<Integer> firstElement = numbers.stream().findFirst();

        if (firstElement.isPresent())
            System.out.println("firstElement: " + firstElement.get());
        else
            System.out.println("Stream is empty!");

        Optional<Integer> anyElement = numbers.stream().findAny();

        if(anyElement.isPresent())
            System.out.println("anyElement: " + anyElement.get());
        else
            System.out.println("Stream is empty!");

    }

}
