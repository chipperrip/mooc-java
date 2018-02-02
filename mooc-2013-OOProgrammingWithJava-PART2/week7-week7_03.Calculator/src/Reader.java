
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chip
 */
public class Reader {

    private Scanner reader;

    public Reader() {
        reader = new Scanner(System.in);
    }

    public String readString() {
        return reader.nextLine();
    }

    public int readInteger() {
        return Integer.parseInt(reader.nextLine());
    }

    public int[] getValues() {

        int[] values = new int[2];

        System.out.print("value1: ");
        values[0] = readInteger();// read the value using the Reader-object
        System.out.print("value2: ");
        values[1] = readInteger(); // read the value using the Reader-object

        return values;

    }

}
