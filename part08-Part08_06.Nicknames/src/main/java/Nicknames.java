
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> nicknamelist = new HashMap<>();
        
        nicknamelist.put("matthew", "matt");
        nicknamelist.put("michael", "mix");
        nicknamelist.put("arthur", "artie");
        
        System.out.println(nicknamelist.get("matthew"));
    }

}
