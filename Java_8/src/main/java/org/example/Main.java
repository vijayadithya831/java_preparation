package org.example;
// Given a list of integers, find out all the even numbers that exist in the list using Stream functions?

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(10,15,8,49,25,98,32);

        List<Integer> resultList = integerList.stream()
                .filter(x -> x%2 == 0)
                .toList();

        System.out.println("This is the Result List");
        System.out.println("resultList: " + resultList);
    }
}