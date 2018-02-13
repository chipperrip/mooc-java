
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.

        Scanner reader = new Scanner(System.in);
        SkiJumpTourneyUI skiProgram = new SkiJumpTourneyUI(reader);

        skiProgram.beginTournament();

    }
}
