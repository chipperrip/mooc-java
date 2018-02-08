
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

    private Map<String, Integer> products;  // producs name, price
    private Map<String, Integer> stores;     // product name, stock

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

        return 0;
    }

    public boolean take(String product) {
        if (stores.containsKey(product) && this.stock(product) > 0) {
            stores.put(product, stores.get(product) - 1);
            return true;
        }

        return false;
    }

    public Set<String> products() {
        return products.keySet();
    }

//    public String toString() {
//
//        String string = "";
//        
//        for(String item:products.keySet()){
//            string += item + ": ";
//        }
//
//    }

}
