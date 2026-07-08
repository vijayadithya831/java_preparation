package com.practice.java8.optional;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        String email = "vijay@gmail.com";
        String email1 = null;
        String name = "Vijay";
        // of, empty, ofNullable

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println("emptyOptional: " + emptyOptional);

        Optional<String> emailOptional = Optional.of(email);
        System.out.println("emailOptional: " + emailOptional);

        Optional<String> stringOptional = Optional.ofNullable(email1);
        System.out.println("stringOptional: " + stringOptional);

        System.out.println(emailOptional.get());

//        if(stringOptional.isPresent()){
//            System.out.println("Inside if part");
//            System.out.println(emailOptional.get());
//        } else {
//            System.out.println("Inside else part");
//            System.out.println("No Value Present");
//        }
        String defaultOptionalString = stringOptional.orElse(name + "@gmail.com");
//        String defaultOptionalString = stringOptional.orElseGet(() -> name + "@gmail.com");
        System.out.println("defaultOptionalString: " + defaultOptionalString);

        String optionalObject = emailOptional.orElseThrow(() -> new IllegalArgumentException("Email does not exist!"));
        System.out.println("optionalObject: " + optionalObject);

        Optional<String> gender = Optional.of("Male");
        Optional<String> emptyGender = Optional.empty();

        gender.ifPresent(s -> System.out.println("gender: " + s));
        emptyGender.ifPresent(s -> System.out.println("gender: " + s));

        // Explanation of filter method using normal logic not including optional

        String result = "abc";
        if(result != null && result.contains("abc")) {
            System.out.println("result: " + result);
        }

        // now with filter

        Optional<String> optionalString = Optional.of("abc");

        optionalString.filter(res -> res.contains("abc")).ifPresent(res -> System.out.println("res: " + res));





    }

}
