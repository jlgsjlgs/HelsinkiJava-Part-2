/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan
 */
import java.util.Scanner;

public class UserInterface {
    private TodoList listings;
    private Scanner scanner;
    
    public UserInterface(TodoList newlist, Scanner scanner){
        this.listings = newlist;
        this.scanner = scanner;
    }
    
    public void start(){
        
        while (true){
            System.out.println("Command: ");
            String userInput = scanner.nextLine();
            
            if (userInput.equals("stop")){
                break;
            }
            
            switch (userInput){
                case "add":
                    System.out.println("To add: ");
                    String wordToAdd = scanner.nextLine();
                    this.listings.add(wordToAdd);
                    break;
                case "list":
                    this.listings.print();
                    break;
                case "remove":
                    System.out.println("Which one is removed? ");
                    int numberToRemove = Integer.valueOf(scanner.nextLine());
                    this.listings.remove(numberToRemove);
                    break;
            }
        }
    }
}
