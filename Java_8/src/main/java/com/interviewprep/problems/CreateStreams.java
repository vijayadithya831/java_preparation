package com.interviewprep.problems;

import com.practice.dao.impl.ProjectDAOImpl;
import com.practice.dao.interfaces.ProjectDAO;
import com.practice.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStreams {

    private static final ProjectDAO projectDAO = new ProjectDAOImpl();

    public static void main(String[] args) {

        List<Employee> employeeList = projectDAO.getEmployees();

        List<String> empNamesList = new ArrayList<>();

        String[] empNamesArray = new String[10];

        for(Employee e : employeeList) {
            empNamesList.add(e.getEmpName());
        }

        for(int i=0;i<employeeList.size();i++) {
            empNamesArray[i] = employeeList.get(i).getEmpName();
        }
        // 1. List -> Stream
        Stream<String> stream1 = empNamesList.stream();

        // 2. Array -> Stream
        Stream<String> stream2 = Arrays.stream(empNamesArray);

        // 3. Stream.of() method
        Stream<Integer> stream3 = Stream.of(1,2,3,4,5);

        // 4. Stream.generate() method
        Stream<Double> stream4 = Stream.generate(Math::random).limit(5);

        stream1.forEach(System.out::println);
        System.out.println();
        stream2.forEach(System.out::println);
        System.out.println();
        stream3.forEach(System.out::println);
        System.out.println();
        stream4.forEach(System.out::println);
        System.out.println();
    }

}
