package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Drone a1 = new Drone("S", 1.0f, 1.0f, "1000hp");

        a1.takeoff();

        //airplane would be extending of aircraft
    }
}