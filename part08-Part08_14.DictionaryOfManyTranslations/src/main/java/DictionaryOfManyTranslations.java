
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> wordMap;

    public DictionaryOfManyTranslations() {
        this.wordMap = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        // if word (key) is already on the list
        if(this.wordMap.containsKey(word)) {
            this.wordMap.get(word).add(translation);
            return;
        }
        // if word (key) isn't on list
        ArrayList<String> translations = new ArrayList<>();
        this.wordMap.put(word, translations);
        this.wordMap.get(word).add(translation);
        
    }
    
    public ArrayList<String> translate(String word) {
        return this.wordMap.getOrDefault(word, new ArrayList<String>());
    }
    
    public void remove(String word) {
        this.wordMap.remove(word);
    }
}
