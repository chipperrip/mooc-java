
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chip
 */
public class Person {

    private String name = "";
    private String city = "";
    private String street = "";
    private ArrayList<String> numbers = new ArrayList<String>();

    public Person(String name, String number) {
        this.name = name;
        this.numbers.add(number);
    }

    public Person(String name, String city, String street) {
        this.name = name;
        this.city = city;
        this.street = street;
    }

    public void addNumber(String number) {
        this.numbers.add(number);
    }

    public void addCity(String city) {
        this.city = city;
    }

    public void addStreet(String street) {
        this.street = street;
    }

    public ArrayList<String> getNumbers() {
        return numbers;
    }

    public String getAddress() {
        if (city.isEmpty() || street.isEmpty()) {
            return "address unknown";
        }

        return street + " " + city;
    }

    public String getName() {
        return this.name;
    }

}
