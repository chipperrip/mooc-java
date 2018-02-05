
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chip
 */
public class Suitcase {

    private ArrayList<Thing> things;
    private int weightLimit;

    public Suitcase(int limit) {

        //construct suitcase with weight limit
        things = new ArrayList<Thing>();
        weightLimit = limit;

    }

    public void addThing(Thing thing) {

        //if weight of suitcase + new thing doesn't exceed suitcase limit,
        //add thing to suitcase
        if ((this.totalWeight() + thing.getWeight()) <= weightLimit) {
            things.add(thing);
        }
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

        // 3 things (6kg)
        return emptyOrThings + " (" + totalWeight() + " kg)";
    }

    public int totalWeight() {
        //calculates and returns suitcase total weight
        int suitcaseWeight = 0;
        for (Thing thing : things) {
            suitcaseWeight += thing.getWeight();
        }
        return suitcaseWeight;
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }

    public Thing heaviestThing() {

        if (things.isEmpty()) {
            return null;
        }
        Thing heaviest = things.get(0);

        for (Thing thing : things) {
            if (thing.getWeight() > heaviest.getWeight()) {
                heaviest = thing;
            }
        }

        return heaviest;
    }

}
