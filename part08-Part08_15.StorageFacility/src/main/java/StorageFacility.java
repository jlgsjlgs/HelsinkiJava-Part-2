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
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> hashing;
    
    public StorageFacility(){
        this.hashing = new HashMap<>();
    }
    
    public void add(String unit, String item){
        if (!(this.hashing.containsKey(unit))){
            this.hashing.put(unit, new ArrayList<String>());
        }
        
        this.hashing.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        ArrayList<String> emptyList = new ArrayList<>();
        
        return this.hashing.getOrDefault(storageUnit, emptyList);
    }
    
    public void remove(String storageUnit, String item){
        this.hashing.get(storageUnit).remove(item);
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> nonemptyunits = new ArrayList<>();
        
        for (String tempunit: this.hashing.keySet()){
            if (!(this.hashing.get(tempunit).isEmpty())){
                nonemptyunits.add(tempunit);
            }
        }
        
        return nonemptyunits;
    }
}
