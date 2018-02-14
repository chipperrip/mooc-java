/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chip
 */
public class Box implements Thing, Comparable<Thing> {
    //box holds list of things, with a max capacity of sum of volumes of things

    private int maximumCapacity;
    private List<Thing> box;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.box = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing) {

        //add thing if room in box, return true, else false
        if (this.getVolume() + thing.getVolume() <= maximumCapacity) {
            box.add(thing);
            return true;
        }

        return false;
    }

    @Override
    public int getVolume() {
        //calculate total box content volume
        int totalVolume = 0;
        for (Thing thing : box) {
            totalVolume += thing.getVolume();
        }

        return totalVolume;
    }

    @Override
    //compare ascending volume
    public int compareTo(Thing o) {
        return getVolume() - o.getVolume();
    }

    @Override
    public String toString() {
        //  things in the box: 2 dm^3
        return "  things in the box: " + this.getVolume() + " dm^3";
    }

}
