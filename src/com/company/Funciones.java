package com.company;

public class Funciones {

    public static void main(String[] args) {

        holaMundo();
        holaMundo(4);
        holaMundo("Nombre");

        holaMundo("Abdel");

        String hola = devolverHola();
        System.out.println(hola);

    }

    public static void holaMundo() {
        System.out.println("Hola Mundo");
        System.out.println("Hola Mundo");
    }

    private static void holaMundo(String name) {
        System.out.println("Hola " + name);
    }

    private static void holaMundo(Integer number) {
        System.out.println("El numero es: " + number);
    }

    private static void holaMundo(String name, String surname) {
        System.out.println("Hola " + name + " " + surname);
    }

    private static String devolverHola() {
        return "Hola";
    }

    private static int sum(int num1, int num2) {
        return num1 + num2;
    }

}
