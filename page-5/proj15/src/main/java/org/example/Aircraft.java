package org.example;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Aircraft {
    private final String m_manufacturer;
    private float m_max_speed;
    private float m_max_altitude;
    private final String m_production_date;

    public String getM_manufacturer() {
        return m_manufacturer;
    }

    public float getM_max_speed() {
        return m_max_speed;
    }

    public float getM_max_altitude() {
        return m_max_altitude;
    }

    public String getM_production_date() {
        return m_production_date;
    }

    public Aircraft(String m_manufacturer, float m_max_speed, float m_max_altitude) {
        this.m_manufacturer = m_manufacturer;
        this.m_max_speed = m_max_speed;
        this.m_max_altitude = m_max_altitude;
        //new date formatter
        DateTimeFormatter nDate = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        this.m_production_date = nDate.format(now);
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "m_manufacturer='" + m_manufacturer + '\'' +
                ", m_max_speed=" + m_max_speed +
                ", m_max_altitude=" + m_max_altitude +
                ", m_production_date='" + m_production_date + '\'' +
                '}';
    }
}
