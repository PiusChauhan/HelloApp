package org.example;


public class Main {
    static void main(String[] args) {
        String names = "World";
        if (args.length > 0) {
            names = String.join(", ", args);
        }
        System.out.println("Hello " + names + "!");




        }
    }
