
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
    private ArrayList<Integer> points;

    public SkiJumper(String name) {
        //assume legal name
        this.name = name;
        points = new ArrayList<Integer>();
    }

    public int getPoints() {
        int sum = 0;

        if (points.size() == 0) {
            return sum;
        }

        for (int judge : points) {
            sum += judge;

        }
        return sum;
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
}
