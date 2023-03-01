package com.company;

public class CarMain {

    public static void main(String[] args) {

        String car = "alfa romea";
        Car cocheObj = new Car();

        Car cocheObj2 = new Car("rojo", "honda", "civic", 1430.45, 5.4);

        cocheObj2.acelerar(50);

        System.out.println(cocheObj2);

        cocheObj2.peso = 1350.8;

        System.out.println(cocheObj2);
    }
}
