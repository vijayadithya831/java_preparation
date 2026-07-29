package com.practice.java8.streams.tutorial;

import com.practice.dao.impl.ProjectDAOImpl;
import com.practice.dao.interfaces.ProjectDAO;
import com.practice.model.Employee;

import java.util.List;

public class EmployeeTest {

    private static final ProjectDAO projectDAO = new ProjectDAOImpl();

    public static void main(String[] args) {
        List<Employee> employeeList = projectDAO.getEmployees();
        int i = 0;
        for (Employee employee : employeeList) {
            i++;
            System.out.println("Employee " + i + ": " + employee);
        }
    }
}