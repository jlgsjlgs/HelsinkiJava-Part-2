/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> quantities;
    
    public Warehouse(){
        this.prices = new HashMap<>();
        this.quantities = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.prices.put(product, price);
        this.quantities.put(product, stock);
    }
    
    public int price(String product){
        if (!this.prices.containsKey(product)){
            return -99;
        } else {
            return this.prices.get(product);
        }
    }
    
    public int stock(String product){
        if (!this.quantities.containsKey(product)){
            return 0;
        } else {
            return this.quantities.get(product);
        }
    }
    
    public boolean take(String product){
        if (!this.quantities.containsKey(product)){
            return false;
        } else {
            if (this.quantities.get(product) - 1 >= 0){
                this.quantities.put(product, this.quantities.get(product)-1);
                
                if (this.quantities.get(product) > 0){
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }
    
    public Set<String> products(){
        return this.prices.keySet();
    }
    
}
