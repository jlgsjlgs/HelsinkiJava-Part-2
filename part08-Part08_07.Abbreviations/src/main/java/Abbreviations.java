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

public class Abbreviations {
    private HashMap<String, String> hashing;
    
    public Abbreviations(){
        this.hashing = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        if (!(this.hashing.containsKey(abbreviation))){
            this.hashing.put(abbreviation, explanation);
        }
    }
    
    public boolean hasAbbreviation(String abbreviation){
        if (this.hashing.containsKey(abbreviation)){
            return true;
        }
        
        return false;
    }
    
    public String findExplanationFor(String abbreviation){
        if (hasAbbreviation(abbreviation)){
            return this.hashing.get(abbreviation);
        } else {
            return null;
        }
    }
    
    
}
