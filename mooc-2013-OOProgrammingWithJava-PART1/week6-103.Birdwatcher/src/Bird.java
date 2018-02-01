/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chip
 */
public class Bird {

    private String name;
    private String latin;
    private int count;

    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.count = 0;
    }

    public String toString() {
        return (name + " (" + latin + ")"); //Seagull (Dorkus Dorkus)
    }
    
    public void observation(){
        this.count++;
    }
    
   public boolean equals(String name){
       return this.name.toUpperCase().equals(name.toUpperCase());
   }

}
