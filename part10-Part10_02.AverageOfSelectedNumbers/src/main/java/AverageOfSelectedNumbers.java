
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> myList = new ArrayList<>();
        
        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            
            myList.add(input);
        }
        
        System.out.println("Print the average of the negative numbers of the positive numbers? (n/p)");
        String questionInput = scanner.nextLine();
        
        if (questionInput.equals("p")){
            double posAvg = myList.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();
            
            System.out.println("Average of the postive numbers: " + posAvg);
        } else if (questionInput.equals("n")){
            double negAvg = myList.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();
            
            System.out.println("Average of the negative numbers: " + negAvg);
        }
    }
}
