/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Chip
 */
public class PersonalDuplicateRemover implements DuplicateRemover {

    private Set<String> strings;
    private int duplicates;

    public PersonalDuplicateRemover() {
        this.strings = new HashSet<String>();
    }

    @Override

    // add string if it doesn't exist, else incrmeent detected duplicates 
    public void add(String characterString) {
        if (!strings.contains(characterString)) {
            strings.add(characterString);
        } else {
            duplicates++;
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return duplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return strings;
    }

    @Override
    public void empty() {
        strings.clear();
        duplicates = 0;

    }

}
