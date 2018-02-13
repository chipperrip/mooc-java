
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chipper
 */
public class SkiJumper implements Comparable<SkiJumper> {

    private String name;
    private ArrayList<Integer> jumpLengths;
    private int points;

    public SkiJumper(String name) {
        //assume legal name
        this.name = name;
        jumpLengths = new ArrayList<Integer>();
        points = 0;
    }

    public int getPoints() {
        return points;
    }

    public void scorePoints(int points) {
        this.points += points;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + getPoints() + " points)";
    }

    @Override
    public int compareTo(SkiJumper other) {
        if (this.getPoints() == other.getPoints()) {
            return this.getName().compareToIgnoreCase(other.getName());
        }

        return this.getPoints() - other.getPoints();
    }

    public void addJump(int length) {
        jumpLengths.add(length);
    }

    public String getJumpString() {
        String string = "jump lengths: ";

        for (int i = 0; i < jumpLengths.size(); i++) {
            if (i == jumpLengths.size() - 1) {
                string += jumpLengths.get(i) + " m";
            } else {
                string += jumpLengths.get(i) + " m, ";
            }
        }

        return string;
    }
}
