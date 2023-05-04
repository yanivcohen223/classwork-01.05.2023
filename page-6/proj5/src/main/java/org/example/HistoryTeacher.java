package org.example;

public class HistoryTeacher extends Teacher{
    protected String field_of_profession;

    public HistoryTeacher(String name, int id_number, String field_of_profession) {
        super(name, id_number);
        this.field_of_profession = field_of_profession;
    }

    @Override
    public String toString() {
        return "HistoryTeacher{" +
                "field_of_profession='" + field_of_profession + '\'' +
                ", name='" + name + '\'' +
                ", id_number=" + id_number +
                "} ";
    }
}
