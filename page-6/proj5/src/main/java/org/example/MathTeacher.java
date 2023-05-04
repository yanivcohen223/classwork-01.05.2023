package org.example;

public class MathTeacher extends Teacher{

    protected int math_skills;

    public MathTeacher(String name, int id_number, int math_skills) {
        super(name, id_number);
        this.math_skills = math_skills;
    }

    @Override
    public String toString() {
        return "MathTeacher{" +
                "math_skills=" + math_skills +
                ", name='" + name + '\'' +
                ", id_number=" + id_number +
                "} ";
    }
}
