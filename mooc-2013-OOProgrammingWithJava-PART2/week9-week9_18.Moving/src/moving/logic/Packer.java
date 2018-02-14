/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author Chip
 */
public class Packer {

    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        //initialize list of boxes, add initial box
        List<Box> boxes = new ArrayList<Box>();
        boxes.add(new Box(boxesVolume));

        //if item doesn't fit into current box, add new box followed by adding the item to new box
        for (int i = 0; i < things.size(); i++) {
            if (boxes.get(boxes.size() - 1).addThing(things.get(i))) {
            } else {
                boxes.add(new Box(boxesVolume));
                boxes.get(boxes.size() - 1).addThing(things.get(i));
            }
        }
        return boxes;
    }

}
