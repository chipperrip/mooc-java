
import java.sql.DatabaseMetaData;
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
public class PhoneSearch {

    private Scanner reader;
    private PhoneDB phoneDB;

    public PhoneSearch(Scanner scan) {
        reader = scan;

    }

    public void commands() {
        System.out.println("phone search\n"
                + "available operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit");

        while (true) {
            System.out.println("");
            System.out.print("command: ");
            String input = reader.nextLine();

            if (input.equals("x")) {
                break;

            } else if (input.equals("1")) {
                addNumber();

            } else if (input.equals("2")) {
                searchNumber();

            } else if (input.equals("3")) {
                searchPersonByNumber();

            } else if (input.equals("4")) {
                addAddress();

            } else if (input.equals("5")) {
                searchPersonalInformation();

            } else if (input.equals("6")) {
                deletePersonalInformation();

            } else if (input.equals("7")) {
                filteredListing();
            }
        }

    }

    private void addNumber() {
        //if person doesn't exist, make a new person. else add number to person.

        System.out.print("whose number: ");
        String name = reader.nextLine();

        System.out.print("number: ");
        String number = reader.nextLine();

        phoneDB.addNumber(name, number);

    }

    private void searchNumber() {
        // finds numbers associated with person

        System.out.print("whose number: ");
        String name = reader.nextLine();

        System.out.print(" ");

        if (phoneDB.contains(name)) {
            for (String number : phoneDB.findNumbers(name)) {
                System.out.println(number);
            }
        } else {
            System.out.println("not found");
        }

    }

    private void searchPersonByNumber() {
        //finds a person associated with a given number

        System.out.print("number: ");
        String number = reader.nextLine();

        System.out.print(" ");
        System.out.println(phoneDB.findPersonByNumber(number));
    }

    private void addAddress() {
        System.out.print("whose address: ");
        String name = reader.nextLine();

        System.out.print("street: ");
        String street = reader.nextLine();

        System.out.print("city: ");
        String city = reader.nextLine();

        phoneDB.addAddress(name, street, city);

    }

    private void searchPersonalInformation() {
        System.out.print("whose information: ");
        String name = reader.nextLine();

        System.out.print(" ");
        System.out.println(phoneDB.getAddress(name));

        System.out.print(" ");
        if (phoneDB.findNumbers(name).isEmpty()) {
            System.out.println("phone number not found");
        } else {
            System.out.println("phone numbers: ");

            for (String number : phoneDB.findNumbers(name)) {
                System.out.println(" " + number);
            }
        }

    }

    private void deletePersonalInformation() {
        System.out.print("whose information: ");
        String name = reader.nextLine();

        phoneDB.clear(name);
    }

    private void filteredListing() {
        System.out.print("whose information: ");
        String name = reader.nextLine();

    }

}
