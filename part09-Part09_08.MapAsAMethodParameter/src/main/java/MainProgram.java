import java.util.Map;
import java.util.HashMap;

public class MainProgram {

    public static void main(String[] args) {
        // test your method here
        Map<String, String> myMap = new HashMap();
        myMap.put("Michael", "Mike");
        System.out.println(returnSize(myMap));

    }

    // Implement here a method returnSize, which takes a Map-object as a parameter 
    // and returns the size of the map object
    
    public static int returnSize(Map map) {
        return map.size();
    }
}
