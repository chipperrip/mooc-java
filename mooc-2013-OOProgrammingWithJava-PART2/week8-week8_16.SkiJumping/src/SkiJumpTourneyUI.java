
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chipper
 */
public class SkiJumpTourneyUI {

    private Scanner reader;
    private Roster roster;

    public SkiJumpTourneyUI(Scanner reader) {
        this.reader = reader;
        this.roster = new Roster();
    }

    public void beginTournament() {

        System.out.println("Kumpula ski jumping week\n");

        addParticipants(); // add participants from user

        System.out.print("The tournament begins!\n"
                + "\n");

        jumpUI(); //commence jumping

        end();  //print end sequence
    }

    private void end() {
        System.out.println("Thanks!\n"
                + "\n"
                + "Tournament results:\n"
                + "Position    Name");

        //sort participants by points, highest first
        roster.sort();
        roster.reverse();

        //print participant score and jump lengths
        int i = 0;
        for (SkiJumper jumper : roster.getRoster()) {
            i++;
            System.out.println(i + "           " + jumper + "\n"
                    + "            " + jumper.getJumpString());
        }
    }

    public void addParticipants() {
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        //add participants from user input, break if no input
        while (true) {
            System.out.print("  Participant name: ");
            String input = reader.nextLine();

            if (input.equals("")) {
                break;
            }

            roster.add(input);
        }
        System.out.println("");
    }

    public void jumpUI() {

        //performs a number of rounds up to user input
        int round = 0;

        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String input = reader.nextLine();
            System.out.println("");

            if (!input.equals("jump")) {
                break;
            }

            round++;

            System.out.println("\n"
                    + "Round " + round);
            System.out.println("");

            //sort jumping order by lowest score first, followed by alphabetical
            System.out.println("Jumping order: ");

            roster.sort();

            int order = 0;
            for (SkiJumper participant : roster.getRoster()) {
                order++;
                System.out.println("  " + order + ". " + participant);
            }
            
            //performs jumps and prints results

            System.out.println("\n"
                    + "Results of round " + round);

            Jump jump = new Jump(roster);
            jump.performJumps();

            System.out.println("");
        }
    }

}
