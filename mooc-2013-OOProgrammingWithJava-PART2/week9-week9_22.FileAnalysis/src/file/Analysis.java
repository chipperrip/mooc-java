/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chip
 */
public class Analysis {

    private final List<String> list = new ArrayList<String>();

    public Analysis(File file) {
        //read file into a object attribute list
        Scanner reader;
        try {
            reader = new Scanner(file);
            while (reader.hasNextLine()) {
                list.add(reader.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }

    public int lines() {
        //returns number of lines in the list
        return list.size();
    }

    public int characters() {
        //return 0 if list is empty, otherwise characters in the list(file)
        if (list.isEmpty()) {
            return 0;
        }
        int characters = 0;
        for (String string : list) {
            characters += string.length();
        }
        return characters + list.size();
    }
}
