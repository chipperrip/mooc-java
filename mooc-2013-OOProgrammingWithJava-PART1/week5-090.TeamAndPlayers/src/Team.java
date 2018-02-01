
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author morgj
 */
public class Team {

    private ArrayList<Player> roster;
    private String name;
    private int maxSize;

    public Team(String teamName) {
        name = teamName;
        roster = new ArrayList<Player>();
        maxSize = 16;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        if (roster.size() < maxSize) {
            roster.add(player);
        }
    }

    public void printPlayers() {

        for (Player player : roster) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return roster.size();
    }

    public int goals() {
        int teamGoals = 0;

        for (Player player : roster) {
            teamGoals += player.goals();
        }
        
        return teamGoals;
    }

}
