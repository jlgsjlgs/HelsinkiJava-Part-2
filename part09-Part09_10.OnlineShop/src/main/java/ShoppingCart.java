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

public class ShoppingCart {
    private Map<String, Item> myCart;
    
    public ShoppingCart(){
        this.myCart = new HashMap<>();
    }
    
    public void add(String product, int price){
        if (!this.myCart.containsKey(product)){
            this.myCart.put(product, new Item(product, 1, price));
        } else {
            this.myCart.get(product).increaseQuantity();
        }
    }
    
    public int price(){
        int total = 0;
        for (Item temp: this.myCart.values()){
            total+= temp.price();
        }
        
        return total;
    }
    
    public void print(){
        for (Item temp: this.myCart.values()){
            System.out.println(temp);
        }
    }
}
