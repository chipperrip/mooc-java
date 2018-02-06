/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chipper
 */
public class Airplane {

    private String id;
    private int capacity;

    public Airplane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    @Override
    public String toString() {

        // HA-LOL (42 ppl)
        // G-OWAC (101 ppl)
        return id + " (" + capacity + " ppl)";
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        Airplane plane = (Airplane) object;

        if (this.capacity != plane.capacity) {
            return false;
        }

        if (!this.id.equals(plane.id) || this.id == null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {

        if (this.id == null) {
            return 7;
        }

        return this.capacity + this.id.hashCode();

    }

}
