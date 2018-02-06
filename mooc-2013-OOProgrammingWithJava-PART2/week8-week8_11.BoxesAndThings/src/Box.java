
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chipper
 */
public class Box implements ToBeStored {

    private final double maxWeight;
    private double currentWeight;
    private ArrayList<ToBeStored> things;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }

    public void add(ToBeStored thing) {
        if (enoughCapacity(thing)) {
            things.add(thing);
        }
    }

    private boolean enoughCapacity(ToBeStored thing) {
        return (thing.weight() + currentWeight) <= maxWeight;
    }

    public double weight() {
        return currentWeight;
    }

}
