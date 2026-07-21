package com.practice.java8.defaultstatic;

interface Vehicle {
    String getBrand();

    String speedUp();

    String slowDown();

    default String turnAlarmOn() {
        return "Turning vehiocle alarm ON!";
    }

    default String turnAlarmOff() {
        return "Turning vehiocle alarm OFF!";
    }

    static String getCompany() {
        return "Volkswagen";
    }
}

class Car implements Vehicle {
    @Override
    public String getBrand() {
        return "BMW";
    }

    @Override
    public String speedUp() {
        return "Vrooom!";
    }

    @Override
    public String slowDown() {
        return "Screeech!";
    }
}

public class DefaulltDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        System.out.println(vehicle.getBrand());
        System.out.println(vehicle.speedUp());
        System.out.println(vehicle.slowDown());

        System.out.println(vehicle.turnAlarmOn());
        System.out.println(vehicle.turnAlarmOff());

        System.out.println(Vehicle.getCompany());
    }
}
