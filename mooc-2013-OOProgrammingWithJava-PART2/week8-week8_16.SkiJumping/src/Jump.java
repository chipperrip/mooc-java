
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chipper
 */
public class Jump {

    private Roster roster;
    private Random random;

    public Jump(Roster roster) {
        this.roster = roster;
        random = new Random();
    }

    public int vote() {

        //Gets 5 random votes (10-20) from the judges; discards greatest and smallest votes
        ArrayList<Integer> votes = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            votes.add(random.nextInt(11) + 10);
        }

        //prints the votes
        System.out.println("    judge votes: " + votes);

        votes.remove(Collections.min(votes));
        votes.remove(Collections.max(votes));

        int voteTally = 0;

        for (int i : votes) {
            voteTally += i;
        }

        return voteTally;
    }

    public void performJumps() {

        //performs a jump for each partcipant
        //gets a jump length plus judge vote tally and adds them to get the total points
        //scores the points to the individual paritcipant
        for (SkiJumper participant : roster.getRoster()) {

            System.out.println("  " + participant.getName());

            int points = jump(participant) + vote();

            participant.scorePoints(points);
        }
    }

    private int jump(SkiJumper jumper) {
        //performs a single jump and prints the length. stores the length of the jump in the participant
        int length = random.nextInt(61) + 60;
        jumper.addJump(length);
        System.out.println("    length: " + length);

        return length;
    }
}
