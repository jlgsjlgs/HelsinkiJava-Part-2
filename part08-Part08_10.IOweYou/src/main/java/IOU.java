/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan
 */
import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> hashing;
    
    public IOU(){
        this.hashing = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        this.hashing.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom){
        return this.hashing.getOrDefault(toWhom, 0.0);
    }
}
