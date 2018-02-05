
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chip
 */
public class Dictionary {

    private HashMap<String, String> dictionary;

    public Dictionary() {
        dictionary = new HashMap<String, String>();
    }

    public void add(String word, String translation) {
        dictionary.put(stringCleaning(word), stringCleaning(translation));
    }

    public String translate(String word) {
        // returns the translation of its parameter.
        //If the word is unknown, it returns null.
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        }
        return null;
    }

    public int amountOfWords() {
        if (dictionary.isEmpty()) {
            return 0;
        }
        return dictionary.size();
    }

    public static String stringCleaning(String string) {
        //returns a trimmed and lowercased version of the parameter

        string = string.toLowerCase();
        return string.trim();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> list = new ArrayList<String>();

        for (String key : dictionary.keySet()) {
            list.add(key + " = " + dictionary.get(key));
        }

        return list;
    }

}
