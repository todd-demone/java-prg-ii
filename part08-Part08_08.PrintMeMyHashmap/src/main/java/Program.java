
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> abbreviations = new HashMap<>();
        abbreviations.put("i.e.", "more precisely");
        abbreviations.put("etc.", "and so on");
        abbreviations.put("e.g.", "for example");
        printKeys(abbreviations);
        System.out.println("---");
        printKeysWhere(abbreviations, "i");
        System.out.println("---");
        printValuesOfKeysWhere(abbreviations, ".e");
    }
    
    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key: hashmap.keySet()) {
            System.out.println(key);
        }
    }
    
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key: hashmap.keySet()) {
            if(key.contains(text)) {
                System.out.println(key);
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for(String key: hashmap.keySet()) {
            if(key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }

}
