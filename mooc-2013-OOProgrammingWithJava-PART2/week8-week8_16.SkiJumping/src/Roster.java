
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chipper
 */
public class Roster {

    private ArrayList<SkiJumper> roster;

    public Roster() {
        roster = new ArrayList<SkiJumper>();
    }

    public void add(String name) {
        roster.add(new SkiJumper(name));
        sort();
    }

    public void sort() {
        Collections.sort(roster);

    }

//    public SkiJumper getJumper(String name) {
//        SkiJumper jumper;
//        return roster.get(Collections.binarySearch(roster, name));
//
//    }
    public ArrayList<SkiJumper> getRoster() {
        return roster;
    }
}
