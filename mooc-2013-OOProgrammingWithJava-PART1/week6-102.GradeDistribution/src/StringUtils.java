/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chip
 */
public class StringUtils {

    public static String printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times
        String stars = "";
        int number = 1;
        while (number <= amount) {
            stars += ("*");
            number++;
        }
        return stars;

    }

}
