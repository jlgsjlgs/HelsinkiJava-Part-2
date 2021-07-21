/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan
 */
import java.util.List;
import java.util.ArrayList;

public class Herd implements Movable{
    private List<Movable> myHerd;
    
    public Herd(){
        this.myHerd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        this.myHerd.add(movable);
    }
    
    public void move(int dx, int dy){
        for (Movable temp: this.myHerd){
            temp.move(dx, dy);
        }
    }
    
    public String toString(){
        String tempstring = "";
        
        for (Movable temp: this.myHerd){
            tempstring += temp.toString() + "\n";
        }
        
        return tempstring;
    }
}
