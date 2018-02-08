
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chipper
 */
public class ShoppingBasket {

    private Map<String, Purchase> basket;

    public ShoppingBasket() {
        basket = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        if (basket.containsKey(product)) {
            basket.get(product).increaseAmount();
        } else {
            basket.put(product, new Purchase(product, 1, price));
        }
    }

    public int price() {
        int sum = 0;

        for (Purchase item : basket.values()) {
            sum += item.price();
        }

        return sum;
    }

    public void print() {
        for (Purchase purchace : basket.values()) {
            System.out.println(purchace.toString());
        }
    }

}
