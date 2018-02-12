
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
public class Judge {

    private Random random;

    public Judge() {
        random = new Random();
    }

    public int judge() {
        return random.nextInt(11) + 10;
    }

}
