package org.com.forest;

import com.creatures.Animal;
import com.creatures.Bear;
import com.creatures.Monkey;
import com.creatures.Tiger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Bear baloo = new Bear();
        Monkey louie = new Monkey();
        Tiger shere_khan = new Tiger();

        baloo.scratch_back();
        louie.eat_banana();
        shere_khan.hunt_deer();
    }
}