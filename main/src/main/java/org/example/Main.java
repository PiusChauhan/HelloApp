package org.example;


public class Main {
    static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }
            if (nameBuilder.length() > 0) {
                nameBuilder = new StringBuilder(nameBuilder.substring(0, nameBuilder.length() - 2));
            }
            System.out.println("Hello " + nameBuilder + "!");
        }




        }
    }
