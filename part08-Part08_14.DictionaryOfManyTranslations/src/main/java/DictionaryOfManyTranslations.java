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

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> hashing;
    
    public DictionaryOfManyTranslations(){
        this.hashing = new HashMap<>();
    }
    
    public void add(String word, String translation){
        if (!(this.hashing.containsKey(word))){
            this.hashing.put(word, new ArrayList<String>());
        }
        
        ArrayList<String> templist = this.hashing.get(word);
        templist.add(translation);
    }
    
    public ArrayList<String> translate(String word){
        ArrayList<String> templist = new ArrayList<>();
        
        return this.hashing.getOrDefault(word, templist);
    }
    
    public void remove(String word){
        this.hashing.remove(word);
    }
}
