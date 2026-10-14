package com.interviewprep.problems;

public class Problem1 {

    public static void main(String[] args) {
        Animal ref = new Dog();

        ref.bark();
    }

}

class Animal {
    void bark() {
        System.out.println("Barking in progress in Animal class!");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking in progress in Dog class!");
    }
}
