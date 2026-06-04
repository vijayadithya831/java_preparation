package com.practice.java8.streams;
// Given a list of integers, find out all the even numbers that exist in the list using Stream functions?

import java.util.*;
import java.util.stream.Collectors;

public class EvenFilterJava8 {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(10,15,8,49,25,98,32);

        List<Integer> resultList = integerList.stream()
                .filter(x -> x%2 == 0)
                .toList();

        System.out.println("This is the Result List");
        System.out.println("resultList: " + resultList);

        // if the array is given in Array instead of ArrayList

        int[] arr = {10,15,8,49,25,98,32};

        Map <Boolean, List<Integer>> listMap = Arrays.stream(arr).boxed()
                .collect(Collectors.partitioningBy(x -> x%2 == 0));

        List<Integer> resultList1 = listMap.get(true);
        System.out.println("listMap: " + listMap);
        System.out.println("resultList1: " + resultList1);

    }
}