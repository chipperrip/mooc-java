/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author Chip
 */
public class Item implements Thing, Comparable<Item> {
    //An item is a thing and is comparable with other items
    //items have a name and a volume

    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public String toString() {
        return name + " (" + volume + (" dm^3)");
    }

    @Override
    public int compareTo(Item comparable) {
        return this.volume - comparable.getVolume();
    }

}
