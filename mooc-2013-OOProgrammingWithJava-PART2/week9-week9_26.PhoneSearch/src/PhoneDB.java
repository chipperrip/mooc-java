
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chip
 */
class PhoneDB {

    private Map<String, Person> database = new HashMap<String, Person>();

    public PhoneDB() {
    }

    public void addNumber(String name, String number) {
        if (database.containsKey(name)) {
            database.get(name).addNumber(number);
        } else {
            database.put(name, new Person(name, number));
        }
    }

    public ArrayList<String> findNumbers(String name) {
        return database.get(name).getNumbers();
    }

    public boolean contains(String name) {
        return database.containsKey(name);
    }

    public String findPersonByNumber(String number) {
        for (String person : database.keySet()) {
            for (String num : database.get(person).getNumbers()) {
                if (number.equals(num)) {
                    return person;
                }
            }
        }

        return "not found";
    }

    public void addAddress(String name, String street, String city) {
        Person person = database.get(name);
        person.addStreet(street);
        person.addCity(city);
    }

    public String getAddress(String name) {
        String address = database.get(name).getAddress();
        if (address.equals("address unknown")) {
            return address;
        } else {
            return "address: " + address;
        }
    }

    public void clear(String name) {
        database.remove(name);
    }

    public void filteredInfo(String filter) {
        String info = "";
        for (String string : database.keySet()) {
            Person person = database.get(string);
            if (person.getAddress().contains(filter) || string.contains(filter)) {
                System.out.println("");
                getInfo(string);
            }
        }
        if (info.isEmpty()) {
            return "keyword not found";
        }
    }

    public void getInfo(String name) {
        System.out.print(" ");
        if (findNumbers(name).isEmpty()) {
            System.out.println("phone number not found");
        } else {
            System.out.println("phone numbers: ");

            for (String number : findNumbers(name)) {
                System.out.println(" " + number);
            }
        }
    }
}
