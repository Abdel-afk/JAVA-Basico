package com.company;

public class ForLoop {

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            System.out.println(i + " Hola mundo");
            if (i == 6)
                continue;

            System.out.println(i + " hola mundo");
        }
        System.out.println("fin");
    }
}
