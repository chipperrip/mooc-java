
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
public class Phonebook {

    private ArrayList<Person> phonebook;

    public Phonebook() {
        phonebook = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        phonebook.add(new Person(name, number));
    }

    public void printAll() {

        for (Person person : phonebook) {
            System.out.println(person);
        }

    }

    public String searchNumber(String name) {
        String results = "";
        boolean notFound = true;
        for (Person person : phonebook) {
            if (person.getName().contains(name)) {
                results += person.getNumber() + "\n";
                notFound = false;
            }
        }

        if (notFound) {
            return "number not known";
        } else {
            return results;
        }

    }

    @Override
    public String toString() {
        String text = "";
        for (Person person : phonebook) {
            text += person + "\n";
        }
        return text;
    }
}
