/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan
 */
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private int maxweight;
    private ArrayList<Item> boxlist;
    
    public BoxWithMaxWeight(int capacity){
        this.maxweight = capacity;
        this.boxlist = new ArrayList<>();
    }
    
    @Override
    public void add(Item item){
        if (this.maxweight - item.getWeight() >= 0){
            this.maxweight -= item.getWeight();
            this.boxlist.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item){
        if (this.boxlist.contains(item)){
            return true;
        }
        
        return false;
    }
}
