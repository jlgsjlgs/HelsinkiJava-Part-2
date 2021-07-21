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

public class OneItemBox extends Box{
    private ArrayList<Item> boxcontent;
    
    public OneItemBox(){
        this.boxcontent = new ArrayList<>();
    }
    
    @Override
    public void add(Item item){
        if (this.boxcontent.isEmpty()){
            this.boxcontent.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item){
        if (this.boxcontent.contains(item)){
            return true;
        }
        
        return false;
    }
}
