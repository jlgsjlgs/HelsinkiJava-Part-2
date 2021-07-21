
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container conA = new Container();
        Container conB = new Container();

        while (true) {
            System.out.println("First: " + conA);
            System.out.println("Second: " + conB);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            int amount = Integer.valueOf(parts[1]);
            switch (parts[0]){
                case "add":
                    if (amount >= 0 ){
                        conA.add(amount);
                    }
                    break;
                case "remove":
                    if (amount >=0){
                        conB.remove(amount);
                    }
                    break;
                case "move":
                    if (amount >= 0)
                    {
                        if (conA.contains() < amount){
                        conB.add(conA.contains());
                        conA.remove(amount);
                        } else {
                            conA.remove(amount);
                            conB.add(amount);
                        }   
                    }
            }
        }
    }
}
