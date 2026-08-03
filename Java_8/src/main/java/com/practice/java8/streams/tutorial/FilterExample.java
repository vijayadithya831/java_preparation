package com.practice.java8.streams.tutorial;

import com.practice.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

    public static void main(String[] args) {

//        Storing the Stream back to List

        List<Product> productList = getProducts().stream()
                .filter(product -> product.getPrice() >= 80000)
                .collect(Collectors.toList());
        productList.forEach(System.out::println);

        System.out.println("*************************");

//        Directly using forEach method on stream

        getProducts()
                .stream()
                .filter(product -> product.getPrice() >= 80000)
                .forEach(System.out::println);
    }
    private static List<Product> getProducts() {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1, "HP Victus", 75000));
        productList.add(new Product(2, "Asus Tuf Gaming", 85000));
        productList.add(new Product(3, "Acer Nitro", 65000));
        productList.add(new Product(4, "Lenovo Legion", 95000));
        productList.add(new Product(5, "Macbook Air", 70000));

        return productList;
    }
}

