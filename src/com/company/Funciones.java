package com.company;

public class Funciones {

    public static void main(String[] args) {

        //holaMundo();
        //holaMundo();

        holaMundo("Abdel");

        String hola = devolverHola();
        System.out.println(hola);

    }

    private static void holaMundo() {
        System.out.println("Hola Mundo");
        System.out.println("Hola Mundo");
    }

    private static void holaMundo(String name) {
        System.out.println("Hola" + name);
    }

    private static String devolverHola() {
        return "hola";
    }

}