
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Divisible {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                .forEach(luku -> System.out.println(luku));
    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        
        ArrayList<Integer> myList = numbers.stream()
                .filter(Divisible::isDivisible)
                .collect(Collectors.toCollection(ArrayList::new));
        return myList;
    }
    
    public static boolean isDivisible(Integer myNum){
        if (myNum % 2 == 0 || myNum % 3 == 0 || myNum % 5 == 0){
            return true;
        }
        return false;
    }

}
