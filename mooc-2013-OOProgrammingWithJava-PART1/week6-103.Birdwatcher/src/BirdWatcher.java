
import java.util.ArrayList;
import java.util.Collections;
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
public class BirdWatcher {

    //Class contains a database of Birds.
    private ArrayList<Bird> database;

    public BirdWatcher() {
        database = new ArrayList<Bird>();

    }

    public void add(Scanner reader) {

        //adds a bird to the database
        System.out.print("Name: ");
        String name = reader.nextLine();

        System.out.print("Latin name: ");
        String latin = reader.nextLine();

        database.add(new Bird(name, latin));
    }

    public void observation(Scanner reader) {

        System.out.print("What was observed:? ");

        Bird search = findBird(reader.nextLine());

        //observes a bird if bird exists
        if (search != null) {
            search.observation();
        }

    }

    public Bird findBird(String name) {

        //Finds and returns a bird. Prints "Is not a bird!" if bird not found.
        //RETURNS NULL if bird not found.     RETURNS NULL if Bird not found.
        for (Bird bird : database) {
            if (bird.equals(name)) {
                return bird;
            }
        }
        System.out.println("Is not a bird!");
        return null;
    }

    public void show(Scanner reader) {
        System.out.print("What? ");
        Bird search = findBird(reader.nextLine());

        // prints bird if search is not empty
        if (search != null) {
            System.out.println(search);
        }
    }

    public void statistics(Scanner reader) {

        //prints all birds
        for (Bird bird : database) {
            System.out.println(bird);
        }
    }

    public void run(Scanner reader) {

        // execution code for database functionality
        while (true) {
            System.out.print("? ");
            String command = reader.nextLine();

            if (command.toUpperCase().equals("QUIT")) {
                break;
            } else if (command.toUpperCase().equals("ADD")) {
                this.add(reader);
            } else if (command.toUpperCase().equals("OBSERVATION")) {
                this.observation(reader);
            } else if (command.toUpperCase().equals("STATISTICS")) {
                this.statistics(reader);
            } else if (command.toUpperCase().equals("SHOW")) {
                this.show(reader);
            }

        }
    }
}
