
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chip
 */
public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dict) {

        this.reader = reader;
        this.dictionary = dict;
    }

    private void add(Scanner reader) {

        System.out.print("In Finnish: ");
        String key = stringCleaning(reader.nextLine());

        System.out.print("Translation: ");
        String value = stringCleaning(reader.nextLine());

        if (key.isEmpty() || value.isEmpty()) {
            System.out.println("Invalid input");
        } else {
            dictionary.add(key, value);
        }
    }

    private void translate(Scanner reader) {

        System.out.print("Give a word: ");

        String translation
                = dictionary.translate(stringCleaning(reader.nextLine()));
        if (translation.isEmpty()) {
            System.out.println("Invalid input");
        } else {
            System.out.println("Translation: " + translation);
        }

    }

    public void start() {

        System.out.println("Statement: ");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quit the text user interface");

        while (true) {
            System.out.print("Statement: ");
            String input = stringCleaning(reader.nextLine());

            if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;

            } else if (input.equals("add")) {
                add(reader);

            } else if (input.equals("translate")) {
                translate(reader);

            } else {
                System.out.println("Unknown statement");
            }
        }
    }

    public static String stringCleaning(String string) {
        //returns a trimmed and lowercased version of the parameter

        string = string.toLowerCase();
        return string.trim();
    }

}
