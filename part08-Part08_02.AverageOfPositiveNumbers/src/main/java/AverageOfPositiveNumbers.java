
import java.util.Scanner;


public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total=0;
        int index=0;
        
        while (true){
            int temp = Integer.valueOf(scanner.nextLine());
            
            if (temp == 0){
                break;
            }
            
            if (temp > 0){
                total+= temp;
                index++;
            }
        }
        
        if (total != 0){
            double average = (double)total/index;
            System.out.println(average);
        } else {
            System.out.println("nnot");
        }


    }
}
