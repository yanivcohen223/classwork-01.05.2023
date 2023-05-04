package org.example;

public class Apartment {
    private String address;
    private float size;

    public String getAddress() {
        return address;
    }

    public float getSize() {
        return size;
    }

    public Apartment(String address, float size) {
        this.address = address;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "address='" + address + '\'' +
                ", size=" + size +
                '}';
    }
}
