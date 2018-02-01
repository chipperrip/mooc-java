/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author morgj
 */
import java.util.Random;

public class NightSky {

    private final double density;
    private final int width;
    private final int height;
    private int starsInLastPrint = 0;

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height) {
        this.density = 0.10;
        this.width = width;
        this.height = height;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine() {
        Random rand = new Random();

        for (int i = 0; i < width; i++) {

            if (rand.nextDouble() < density) {

                System.out.print("*");
                starsInLastPrint++;
            } else {

                System.out.print(" ");

            }
        }
        System.out.println("");
    }

    public void print() {

        this.starsInLastPrint = 0;

        for (int i = 0; i < height; i++) {
            printLine();
        }
        System.out.println("Number of stars: " + starsInLastPrint);

    }

    public int starsInLastPrint() {
        return starsInLastPrint;
    }
}
