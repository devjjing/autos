package org.example;


public class Autos {
    public static void main(String[] args) {

        Person me = new Person();
        me.name = "Tangjing";
        me.lieblingsfarbe = "Blau";
        me.alter = 17;
        Car myCar = new Car ("BMW", "X7", "grau", 2019, 340);
        myCar.startCar();
        myCar.accelerate();
        me.name();

    }

}