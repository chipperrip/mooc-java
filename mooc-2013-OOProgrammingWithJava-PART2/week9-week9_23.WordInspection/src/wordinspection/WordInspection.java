/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Chip
 */
public class WordInspection {

    private List<String> list = new ArrayList<String>();

    public WordInspection(File file) {

        Scanner reader;
        try {
            reader = new Scanner(file, "UTF-8");

        } catch (Exception e) {
            System.out.println("File error.");
            return;
        }

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (!line.isEmpty() || line.contains(" ")) {
                list.add(line);
            }

        }

        reader.close();
    }

    public int wordCount() {

        //returns amount of words in file
        if (list.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (String word : list) {
            count++;
        }
        System.out.println("Amount of words: " + count);
        return count;
    }

    public List<String> wordsContainingZ() {
        ArrayList<String> listZ = new ArrayList<String>();

        for (String word : list) {
            if (word.toLowerCase().contains("z")) {
                listZ.add(word);
            }
        }
        return listZ;
    }

    public List<String> wordsEndingInL() {
        ArrayList<String> listL = new ArrayList<String>();

        for (String word : list) {
            if (word.toLowerCase().charAt(word.length() - 1) == 'l') {
                listL.add(word);
            }
        }

        return listL;
    }

    public List<String> palindromes() {
        ArrayList<String> listP = new ArrayList<String>();

        for (String word : list) {
            if (isPalindrome(word)) {
                listP.add(word);
            }
        }

        return listP;
    }

    public List<String> wordsWhichContainAllVowels() {

        ArrayList<String> listVowels = new ArrayList<String>();

        for (String word : list) {

            if (word.contains("a")
                    && word.contains("e")
                    && word.contains("i")
                    && word.contains("o")
                    && word.contains("u")
                    && word.contains("y")
                    && word.contains("ä")
                    && word.contains("ö")) {
                listVowels.add(word);
            }
        }

        return listVowels;

    }

    private static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();
        if (str.equals(rev)) {
            return true;
        } else {
            return false;
        }
    }
}
