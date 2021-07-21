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

public class Box implements Packable{
    private double maxweight;
    private ArrayList<Packable> mybox;
    
    public Box(double weight){
        this.maxweight = weight;
        this.mybox = new ArrayList<>();
    }
    
    public void add(Packable item){
        if (this.weight() + item.weight() <= this.maxweight){
            this.mybox.add(item);
        }
    }
    
    public String toString(){
        return "Box: " + this.mybox.size() + " items, total weight " + this.weight() + " kg";
    }
    
    public double weight(){
        double thisweight = 0;
        
        for (Packable items: this.mybox){
            thisweight += items.weight();
        }
        
        return thisweight;
        
    }
    
    
}
