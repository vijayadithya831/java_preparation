package com.practice.java8.optional;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        String email = "vijay@gmail.com";
        String email1 = null;
        // of, empty, ofNullable

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        Optional<String> emailOptional = Optional.of(email);
        System.out.println(emailOptional);

        Optional<String> stringOptional = Optional.ofNullable(email1);
        System.out.println(stringOptional);

        System.out.println(emailOptional.get());

    }

}
