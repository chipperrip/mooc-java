/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chipper
 */
public class Flight {

    private Airplane plane;
    private String departureCode;
    private String destinationCode;

    public Flight(Airplane plane, String departureCode, String destinationCode) {
        this.plane = plane;
        this.departureCode = departureCode;
        this.destinationCode = destinationCode;
    }

    public String toString() {
        //HA-LOL (42 ppl) (HEL-BAL)
        //HA-LOL (42 ppl) (BAL-HEL)
        //G-OWAC (101 ppl) (JFK-BAL)
        return plane.toString() + " (" + departureCode + "-" + destinationCode + ")";
    }

}
