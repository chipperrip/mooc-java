/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.*;

/**
 *
 * @author Chipper
 */
public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors = new ArrayList<Sensor>(0);

    private boolean isOn = false;

    public AverageSensor() {
    }

    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }

    @Override
    public boolean isOn() {

        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : sensors) {
            sensor.on();
        }
        isOn = isOn();
    }

    @Override
    public void off() {
        for (Sensor sensor : sensors) {
            sensor.off();
        }

        isOn = isOn();
    }

    @Override
    public int measure() {
        //measures all sensors and returns the average of the values

        int count = 0;
        int sum = 0;
        for (Sensor sensor : sensors) {
            count++;
            sum += sensor.measure();
        }
        return sum / count;
    }

    public String readings() {
        
    }

}
