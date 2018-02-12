
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
public class Execution {

    private Scanner reader;
    private Roster roster;
    private Judge judge;

    public Execution(Scanner reader) {
        this.reader = reader;
        this.roster = new Roster();
        this.judge = new Judge();
    }

    public void beginTournament() {

        System.out.println("Kumpula ski jumping week\n"
                + "\n"
                + "Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        addParticipants(); 
        
        System.out.print("The tournament begins!\n"
                + "\n");
        
        jump();

    }

    public void addParticipants() {
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

    public void jump() {
        int round = 0;

        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String input = reader.nextLine();

            if (input.equals("quit")) {
                break;
            }

            round++;

            System.out.println("\n"
                    + "Round " + round);
            System.out.println("");

            System.out.println("Jumping order: ");
            for (SkiJumper participant : roster.getRoster()) {
                
            }
        }

    }

}
