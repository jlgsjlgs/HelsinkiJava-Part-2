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
    private int cur;
    
    public Container(){
        this.cur = 0;
    }
    
    public int contains(){
        return this.cur;
    }
    
    public void add(int amount){
        if (amount < 0){
            return;
        }
        if (this.cur + amount > 100){
            this.cur = 100;
        } else {
            this.cur += amount;
        }
    }
    
    public void remove(int amount){
        if (this.cur - amount < 0){
            this.cur = 0;
        } else {
            this.cur -= amount;
        }
    }
    
    public String toString(){
        return this.cur + "/100";
    }
}
