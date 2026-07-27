package com.practice.java8.streams.tutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class StreamFilterExample {

    public static void main(String[] args) {

//        Storing the Stream back to List

        List<Product> productList = getProducts().stream()
                .filter(product -> {
                    return product.getPrice() >= 80000;
                })
                .collect(Collectors.toList());
        productList.forEach(System.out::println);

        System.out.println("*************************");

//        Directly using forEach method on stream

        getProducts()
                .stream()
                .filter(product -> {
                    return product.getPrice() >= 80000;
                })
                .forEach(System.out::println);
    }
    private static List<Product> getProducts() {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1, "HP Victus", 75000));;
        productList.add(new Product(2, "Asus Tuf Gaming", 85000));;
        productList.add(new Product(3, "Acer Nitro", 65000));;
        productList.add(new Product(4, "Lenovo Legion", 95000));;
        productList.add(new Product(5, "Macbook Air", 70000));;

        return productList;
    }
}

