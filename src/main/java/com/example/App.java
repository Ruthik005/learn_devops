package com.example;

public class App {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Result of 2 + 3 is: " + app.add(2, 3));
    }
}