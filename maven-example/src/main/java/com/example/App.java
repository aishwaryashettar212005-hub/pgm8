package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Maven");

        int a = 5;
        int b = 2;
        System.out.println("5+2=" + sum(a, b));
    }

    public static int sum(int x, int y) {
        return x + y;
    }
}
