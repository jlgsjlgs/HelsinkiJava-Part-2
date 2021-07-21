/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan
 */
public class Container {
    private int capacity;
    
    public Container(){
        this.capacity = 0;
    }
    
    public void addLiquid(int adding){
        if (this.capacity + adding > 100){
            this.capacity = 100;
        } else {
            this.capacity += adding;
        }
    }
    
    public void removeLiquid(int removing){
        if (this.capacity - removing < 0){
            this.capacity = 0;
        } else {
            this.capacity -= removing;
        }
    }
    
    public int getAmount(){
        return this.capacity;
    }
}
