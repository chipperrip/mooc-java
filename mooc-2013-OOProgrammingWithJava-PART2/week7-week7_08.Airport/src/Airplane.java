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

  
}
