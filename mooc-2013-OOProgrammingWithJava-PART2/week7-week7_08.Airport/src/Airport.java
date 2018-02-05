
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chipper
 */
public class Airport {

    //private HashMap<String, HashMap<Airplane, ArrayList<Flight>>> fleet;
    private HashMap<Airplane, ArrayList<Flight>> fleet;
    private Scanner reader;

    public Airport(Scanner reader) {
        //fleet = new HashMap<String, HashMap<Airplane, ArrayList<Flight>>>();

        fleet = new HashMap<Airplane, ArrayList<Flight>>();
        this.reader = reader;
    }

    private void addAirplane() {

        System.out.print("Give plane ID: ");
        String id = reader.nextLine();

        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(reader.nextLine());

        fleet.put(new Airplane(id, capacity), new ArrayList<Flight>());
    }

    private void addFlight() {

        System.out.print("Give plane ID: ");
        String id = reader.nextLine();

        Airplane plane = findPlane(id);

        System.out.print("Give departure airport code: ");
        String departureCode = reader.nextLine();

        System.out.print("Give destination airport code: ");
        String destinationCode = reader.nextLine();

        fleet.get(plane).add(new Flight(plane, departureCode, destinationCode));
    }

    public void airportPanel() {
        System.out.print("Airport panel\n"
                + "--------------------\n"
                + "\n");

        while (true) {
            System.out.print("Choose operation:\n"
                    + "[1] Add airplane\n"
                    + "[2] Add flight\n"
                    + "[x] Exit\n"
                    + "> ");

            String command = reader.nextLine();

            if (command.equals("1")) {
                addAirplane();
            } else if (command.equals("2")) {
                addFlight();
            } else if (command.equals("x")) {
                break;
            }
        }
    }

    private Airplane findPlane(String id) {

        for (Airplane tempPlane : planeSet()) {
            if (tempPlane.toString().contains(id)) {
                return tempPlane;
            }
        }

        return null;
    }

    public void flightService() {

        System.out.print("Flight service\n"
                + "--------------------\n"
                + "\n");

        while (true) {
            System.out.print("Choose operation:\n"
                    + "[1] Print planes\n"
                    + "[2] Print flights\n"
                    + "[3] Print plane info\n"
                    + "[x] Quit\n"
                    + "> ");

            String command = reader.nextLine();

            if (command.equals("1")) {
                printPlanes();
            } else if (command.equals("2")) {
                printFlights();
            } else if (command.equals("3")) {
                printPlaneInfo();
            } else if (command.equals("x")) {
                break;
            }
        }
    }

    private void printFlights() {

        for (Airplane plane : planeSet()) {
            for (Flight flight : fleet.get(plane)) {
                System.out.println(flight);
            }
        }
    }

    private void printPlanes() {
        for (Airplane plane : planeSet()) {
            System.out.println(plane);
        }
    }

    private void printPlaneInfo() {
        System.out.print("Give plane ID: ");
        System.out.println(findPlane(reader.nextLine()));
    }

    private Set<Airplane> planeSet() {
        return fleet.keySet();
    }
}
