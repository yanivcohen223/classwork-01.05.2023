package org.example;

public class Main {
    public static void identifyTeacher(Teacher teacher) {
        if (teacher instanceof MathTeacher) {
            System.out.format("%s is math teacher and he have %d math skills", teacher.name, ((MathTeacher) teacher).math_skills);
        }
        else {
            System.out.format("%s is history teacher his profession is %s", teacher.name, ((HistoryTeacher)teacher).field_of_profession);
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Teacher t1 = new MathTeacher("Alon", 123, 3);
        Teacher t2 = new HistoryTeacher("Hezi", 456, "WW2");

        System.out.println(t1);
        System.out.println(t2);

        // 6.a - we cant see any details because we look with the eyes of the superior class;


        identifyTeacher(t1);
        System.out.println("");
        identifyTeacher(t2);
    }
}