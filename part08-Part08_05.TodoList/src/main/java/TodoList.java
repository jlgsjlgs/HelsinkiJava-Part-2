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

public class TodoList {
    private ArrayList<String> listings;
    
    public TodoList(){
        this.listings = new ArrayList<>();
    }
    
    public void add(String task){
        this.listings.add(task);
    }
    
    public void print(){
        int index = 1;
        for (String temp: listings){
            System.out.println(index + ": " + temp);
            index++;
        }
    }
    
    public void remove(int number){
        listings.remove(number-1);
    }
}
