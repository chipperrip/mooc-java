/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Chipper
 */
public class ConstantSensor implements Sensor {

    private final boolean isOn = true;

    private int measurement;

    public ConstantSensor(int measurement) {
        this.measurement = measurement;
    }

    public boolean isOn() {
        return isOn;
    }

    public void on() {
        //does nothing
    }

    public void off() {
        //does nothing
    }

    public int measure() {
        return measurement;
    }
}
