package org.example;

public class Drone extends Helicopter{

    public Drone(String m_manufacturer, float m_max_speed, float m_max_altitude, String m_engine_power) {
        super(m_manufacturer, m_max_speed, m_max_altitude, m_engine_power);
    }

    protected void takeoff(){
        System.out.println("taking off now!");
    }
}
