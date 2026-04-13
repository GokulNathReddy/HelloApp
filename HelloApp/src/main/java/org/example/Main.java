package org.example;

public class Main {
    public static void main(String[] args) {
        String name = (args.length > 0) ? String.join(", ", args) : "World";
        System.out.println("Hello, " + name + "!");
    }
}
