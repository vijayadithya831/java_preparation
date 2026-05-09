package org.example;

// Given a list of integers, find out all the numbers starting with 1 using Stream functions?

import java.util.*;

public class StartingFilterJava8 {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(10,15,8,49,25,98,32);

        List<Integer> resultList = integerList.stream()
                .map(x -> x+"")
                .filter(x -> x.startsWith("1"))
                .map(Integer::parseInt)
                .toList();

        System.out.println("resultList: " + resultList);
    }
}
