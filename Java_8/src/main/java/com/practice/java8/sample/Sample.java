package com.practice.java8.sample;

import java.util.HashMap;
import java.util.Map;

public class Sample {
    public static void main(String args[]) {

        String s1 = "Aa";
        String s2 = "BB";
        int hashCode1 = s1.hashCode();
        int hashCode2 = s2.hashCode();

        System.out.println("hashCode1: " + hashCode1);
        System.out.println("hashCode2: " + hashCode2);

        Map map = new HashMap();

        map.put(s1, "Vijay");
        map.put(s2, "Adithya");

        System.out.println("map: " + map);
        System.out.println("map.get(s1): " + map.get(s1));
        System.out.println("map.get(s2): " + map.get(s2));

    }
}
