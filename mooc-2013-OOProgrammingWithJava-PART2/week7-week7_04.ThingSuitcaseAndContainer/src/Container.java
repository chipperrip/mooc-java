
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chip
 */
public class Container {

    private ArrayList<Suitcase> container;
    private int weightLimit;

    public Container(int weightLimit) {
        container = new ArrayList<Suitcase>();
        this.weightLimit = weightLimit;
    }

    public int totalWeight() {
        //calculates and returns container total weight
        int containerWeight = 0;
        for (Suitcase suitcase : container) {
            containerWeight += suitcase.totalWeight();
        }
        return containerWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= weightLimit) {
            container.add(suitcase);
        }
    }

    public String toString() {
        String emptyOrSuitcases = "";

        if (container.isEmpty()) {
            emptyOrSuitcases = "empty";
        } else if (container.size() > 1) {
            emptyOrSuitcases = container.size() + " suitcases";
        } else {
            emptyOrSuitcases = "1 suitcase";
        }

        // 2 suitcases (7 kg)
        return emptyOrSuitcases + " (" + totalWeight() + " kg)";
    }

    public void printThings() {
        for (Suitcase suitcase : container) {
            suitcase.printThings();
        }
    }
}
