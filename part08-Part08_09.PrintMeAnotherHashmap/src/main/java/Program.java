
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }
    
    public static void printValues(HashMap<String, Book> hashmap){
        for (Book temp: hashmap.values()){
            System.out.println(temp);
        }
    }
    
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text){
        for (Book temp: hashmap.values()){
            if (temp.getName().contains(text)){
                System.out.println(temp);
            }
        }
    }

}
