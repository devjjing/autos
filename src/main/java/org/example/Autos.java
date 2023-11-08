package org.example;


public class Autos {
    public static void main(String[] args) {

        Car myCar = new Car();
        startCar();
        Person.name = ("Tangjing", 17, "Blau");
        Car myCar = new Car ("BMW", "X7", "grau", 2019, 340);
        Car.startCar("BMW", "X7");
        Car.accelerate("X7", 550);


    }

    public static void startCar(){
    System.out.println("Auto ist gestartet!");
        System.out.println("The " + Car.brand + " " + Car.model + " is starting.");
    }
}