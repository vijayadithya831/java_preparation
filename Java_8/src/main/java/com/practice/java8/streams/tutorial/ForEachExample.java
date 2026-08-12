package com.practice.java8.streams.tutorial;

import com.practice.dao.impl.ProjectDAOImpl;
import com.practice.dao.interfaces.ProjectDAO;
import com.practice.model.Employee;

import java.util.List;

public class ForEachExample {

    private static final ProjectDAO projectDAO = new ProjectDAOImpl();

    public static void main(String[] args) {

        List<Employee> employeeList = projectDAO.getEmployeeNameAndAge();

        // Before Java 8 forEach
        System.out.println("Before Java 8 forEach");
        for(Employee emp : employeeList) {
            System.out.println("Employee Name: " + emp.getEmpName());
            System.out.println("Employee Age: " + emp.getAge());
            System.out.println("**********");
        }

        // After Java 8 forEach
        System.out.println("After Java 8 forEach");
        employeeList.forEach((emp) -> {
            System.out.println("Employee Name: " + emp.getEmpName());
            System.out.println("Employee Age: " + emp.getAge());
            System.out.println("**********");
        });

        // Applying same logic with Stream. (Warning is shown to use without stream, since it is simpler)
        System.out.println("Applying same logic with Stream. (Warning is shown to use without stream, since it is simpler)");
        employeeList.stream()
                .forEach((emp) -> {
                    System.out.println("Employee Name: " + emp.getEmpName());
                    System.out.println("Employee Age: " + emp.getAge());
                    System.out.println("**********");
                });

    }
}
