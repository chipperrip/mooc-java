/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Chipper
 */
public class Thermometer implements Sensor {

    private boolean isOn = false;

    public Thermometer() {
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void on() {
        isOn = true;
    }

    @Override
    public void off() {
        isOn = false;
    }

    @Override
    public int measure() {
        Random random = new Random();
        return random.nextInt(61) - 30;
    }

}
