package com.practice.java8.streams.tutorial;

import com.practice.dao.impl.ProjectDAOImpl;
import com.practice.dao.interfaces.ProjectDAO;

import java.util.List;
import java.util.Map;

public class EmployeeTest {

    private static final ProjectDAO projectDAO = new ProjectDAOImpl();

    public static void main(String[] args) {
        List employeeList = projectDAO.getEmployees();

        for (Object employee : employeeList) {
            Map employeeMap = (Map) employee;
            System.out.println(employeeMap);
        }
    }

}
