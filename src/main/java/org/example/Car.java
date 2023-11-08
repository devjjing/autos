package org.example;

public class Car {

    String brand;
    String model;
    String color;
    int year;
    int velocity;

    Car(String brand, String model, String color, int year, int velocity) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.velocity = velocity;
    }

    public void accelerate() {
        int i = 0;
        while (i <= velocity) {
            System.out.println("velocity of " + model + " : " + i);
            i += 10;
        }
    }
    public void startCar() {
        System.out.println("Auto ist gestartet!");
        System.out.println("The " + brand + " " + model + " is starting.");
    }
}
