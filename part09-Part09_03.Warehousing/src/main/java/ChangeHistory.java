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

public class ChangeHistory{
    private ArrayList<Double> myhistory;
    
    public ChangeHistory(){
        this.myhistory = new ArrayList<>();
    }
    
    public void add(double status){
        this.myhistory.add(status);
    }
    
    public void clear(){
        this.myhistory.clear();
    }
    
    public String toString(){
        return this.myhistory.toString();
    }
    
    public double maxValue(){
        if (this.myhistory.size() == 0){
            return 0;
        }
        
        double max = 0;
        for (double temp: this.myhistory){
            if (temp > max){
                max = temp;
            }
        }
        
        return max;
    }
    
    public double minValue(){
        if (this.myhistory.size() == 0){
            return 0;
        }
        
        double min = this.myhistory.get(0);
        for (double temp: this.myhistory){
            if (temp < min){
                min = temp;
            }
        }
        
        return min;
    }
    
    public double average(){
        if (this.myhistory.size() == 0){
            return 0;
        }
        
        double total = 0;
        for (double temp: this.myhistory){
            total+= temp;
        }
        
        return total/this.myhistory.size();
    }
}
