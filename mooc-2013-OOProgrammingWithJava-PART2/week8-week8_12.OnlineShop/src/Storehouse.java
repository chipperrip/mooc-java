
import java.util.AbstractMap;
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
public class Storehouse {

    Map<String, Integer> products;  // producs name, price
    Map<String, Integer> stores;     // product name, stock

    public Storehouse() {

        products = new HashMap<String, Integer>();
        stores = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {

        products.put(product, price);
        stores.put(product, stock);
    }

    public int price(String product) {

        if (products.containsKey(product)) {
            return products.get(product);
        }

        return -99;
    }

    public int stock(String product) {

        if (stores.containsKey(product)) {
            return stores.get(product);
        }

        return -99;
    }
}
