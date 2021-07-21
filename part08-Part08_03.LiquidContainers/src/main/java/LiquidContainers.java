
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container containerA = new Container();
        Container containerB = new Container();

        while (true) {
            System.out.println("First: " + containerA.getAmount() + "/100");
            System.out.println("Second: " + containerB.getAmount() + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            int num = Integer.valueOf(parts[1]);
            
            switch (parts[0]){
                case "add":
                    if (num >= 0){
                        containerA.addLiquid(num);
                    } else {
                        continue;
                    }
                    break;
                case "move":
                    if (num >= 0){
                        if (num > containerA.getAmount()){
                            containerB.addLiquid(containerA.getAmount());
                            containerA.removeLiquid(num);
                        } else {
                            containerA.removeLiquid(num);
                            containerB.addLiquid(num);
                        }
                    }
                    break;
                case "remove":
                    if (num >= 0){
                        containerB.removeLiquid(num);
                    }
                    break;
            }

        }
    }

}
