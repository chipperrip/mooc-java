
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
    private ArrayList<ToBeStored> things;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        things = new ArrayList<ToBeStored>();
    }

    public void add(ToBeStored thing) {
        if (enoughCapacity(thing)) {
            things.add(thing);
        }
    }

    private boolean enoughCapacity(ToBeStored thing) {
        return (thing.weight() + this.weight()) <= maxWeight;
    }

    public double weight() {

        double totalWeight = 0;

        for (ToBeStored thing : things) {
            totalWeight += thing.weight();
        }
        return totalWeight;
    }

    public String toString() {

        String emptyOrThings = "";

        if (things.isEmpty()) {
            emptyOrThings = "empty";
        } else if (things.size() > 1) {
            emptyOrThings = things.size() + " things";
        } else {
            emptyOrThings = "1 thing";
        }

        // Box: 6 things, total weight 4.0 kg
        return "Box: " + emptyOrThings + ", total weight " + weight() + " kg";
    }
}
