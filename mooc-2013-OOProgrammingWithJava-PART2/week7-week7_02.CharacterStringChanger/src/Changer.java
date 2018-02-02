
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
public class Changer {

    //a list that holds change objects
    private ArrayList<Change> changes;

    public Changer() {
        changes = new ArrayList<Change>();
    }

    public void addChange(Change change) {
        //adds a change to this change class
        changes.add(change);
    }

    public String change(String characterString) {

        //executes all added changes for the character string in the order
        //they were added to this changer class
        String changedString = characterString;

        for (Change change : changes) {
            changedString = change.change(changedString);
        }

        return changedString;
    }

}
