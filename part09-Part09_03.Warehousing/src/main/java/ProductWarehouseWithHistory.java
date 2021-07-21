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

public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory chghistory;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.chghistory = new ChangeHistory();
        this.chghistory.add(initialBalance);
    }
    
    public String history(){
        return this.chghistory.toString();
    }
    
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.chghistory.add(this.getBalance());
    }
    
    public double takeFromWarehouse(double amount){
        double temp = super.takeFromWarehouse(amount);
        this.chghistory.add(this.getBalance());
        return temp;
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.chghistory.toString());
        System.out.println("Largest amount of product: " + this.chghistory.maxValue());
        System.out.println("Smallest amount of product: " + this.chghistory.minValue());
        System.out.println("Average: " + this.chghistory.average());
    }
}
