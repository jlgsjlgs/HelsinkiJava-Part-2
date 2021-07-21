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
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> hashing;
    
    public VehicleRegistry(){
        this.hashing = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if (this.hashing.containsKey(licensePlate)){
            return false;
        } 
        
        this.hashing.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate){
        if (this.hashing.containsKey(licensePlate)){
            return this.hashing.get(licensePlate);
        }
        
        return null;
    }
    
    public boolean remove(LicensePlate licensePlate){
        if (this.hashing.containsKey(licensePlate)){
            this.hashing.remove(licensePlate);
            return true;
        }
        
       return false;
    }
    
    public void printLicensePlates(){
        for (LicensePlate temp: this.hashing.keySet()){
            System.out.println(temp);
        }
    }
    
    public void printOwners(){
        ArrayList<String> ownerlist = new ArrayList<>();
        
        for (String owner: this.hashing.values()){
            if (!(ownerlist.contains(owner))){
                System.out.println(owner);
                ownerlist.add(owner);
            }
        }
    }
}
