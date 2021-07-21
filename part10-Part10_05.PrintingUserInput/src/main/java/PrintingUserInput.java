
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> myList = new ArrayList<>();
        
        while (true){
            String userInput = scanner.nextLine();
            
            if (userInput.isEmpty()){
                break;
            }
            
            myList.add(userInput);
        }
        
        myList.stream()
                .forEach(sentence -> System.out.println(sentence));
    }
}
