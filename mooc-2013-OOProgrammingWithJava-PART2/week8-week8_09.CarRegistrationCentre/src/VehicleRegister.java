
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chip
 */
public class VehicleRegister {

    private HashMap<RegistrationPlate, String> register;

    public VehicleRegister() {
        register = new HashMap<RegistrationPlate, String>();

    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (register.containsKey(plate)) {
            return false;
        }

        register.put(plate, owner);
        return true;
    }

    public String get(RegistrationPlate plate) {
        if (register.containsKey(plate)) {
            return register.get(plate);
        }

        return null;
    }

    public boolean delete(RegistrationPlate plate) {
        if (register.containsKey(plate)) {
            register.remove(plate);
            return true;
        }

        return false;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate : register.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {

        ArrayList<String> owners = new ArrayList<String>();

        for (String owner : register.values()) {
            if (!owners.contains(owner)) {
                owners.add(owner);
                System.out.println(owner);
            }
        }
    }
}
