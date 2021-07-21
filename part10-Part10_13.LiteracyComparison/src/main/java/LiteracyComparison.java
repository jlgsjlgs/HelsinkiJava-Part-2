
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        ArrayList<String> myList = new ArrayList<>();
        
        try {
            Files.lines(Paths.get("literacy.csv")).forEach(row -> myList.add(row));
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        myList.stream()
                .map(string -> string.split(","))
                .filter(parts -> parts.length == 6)
                .sorted((x, y) -> {
                    return x[5].compareTo(y[5]);
                })
                .forEach(parts -> System.out.println(parts[3] + " (" + parts[4] + "), " + parts[2].split(" ")[1].trim() + ", " + parts[5]));
    }
}
