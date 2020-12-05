
import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviation = sanitizedString(abbreviation);
        if (this.abbreviations.containsKey(abbreviation)) {
            System.out.println("Key has already been added!");
            return;
        }
        this.abbreviations.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        abbreviation = sanitizedString(abbreviation);
        return this.abbreviations.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        abbreviation = sanitizedString(abbreviation);
        return this.abbreviations.get(abbreviation);
    }
    
    public static String sanitizedString(String string) {
        if(string == null) {
            return "";
        }
        
        string = string.toLowerCase();
        return string.trim();
    }
}
