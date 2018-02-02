/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chip
 */
public class Change {

    private char fromCharacter;
    private char toCharacter;

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString) {

        
        //replaces all instances of fromChar in string characterString to toCharacter
        
        String changedString = "";

        for (int i = 0; i < characterString.length(); i++) {
            
            char temp = characterString.charAt(i);
            
            if (temp == fromCharacter) {
                changedString += toCharacter;
            } else {
                changedString += temp;
            }
        }
        return changedString;
    }

}
