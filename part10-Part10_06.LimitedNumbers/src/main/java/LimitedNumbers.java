
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();
        
        while (true){
            Integer userInput = Integer.valueOf(scanner.nextLine());
            
            if (userInput < 0){
                break;
            }
            
            myList.add(userInput);
        }
        
        myList.stream()
                .filter(num -> (num >= 1 && num <= 5))
                .forEach(num -> System.out.println(num));
    }
}
