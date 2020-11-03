package dictionary;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.PrintWriter;

public class SaveableDictionary {

    private Map<String, String> finnishToOther;
    private Map<String, String> otherToFinnish;
    private String file;

    public SaveableDictionary() {
        finnishToOther = new HashMap<>();
        otherToFinnish = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.file = file;
        finnishToOther = new HashMap<>();
        otherToFinnish = new HashMap<>();
    }

    public void add(String finnish, String other) {
        if (finnishToOther.get(finnish) != null) {
            return;
        }
        finnishToOther.put(finnish, other);
//        for (String key : finnishToOther.keySet()) {
//            System.out.println(key + ": " + finnishToOther.get(key));
//
//        }
//
//        System.out.println("----");
        if (otherToFinnish.get(other) != null) {
            return;
        }
        otherToFinnish.put(other, finnish);
//        for(String key : otherToFinnish.keySet()) {
//            System.out.println(key + ": " + otherToFinnish.get(key));
//            
//        }
//        
//        System.out.println("----");
    }

    public String translate(String word) {
        String translation = "";
        translation = finnishToOther.get(word);
        if (translation == null) {
            translation = otherToFinnish.get(word);
        }
        return translation;
    }

    public void delete(String word) {
        if (finnishToOther.containsKey(word)) {
            String translation = finnishToOther.get(word);
            finnishToOther.remove(word);
            otherToFinnish.remove(translation);
        } else if (otherToFinnish.containsKey(word)) {
            String translation = otherToFinnish.get(word);
            otherToFinnish.remove(word);
            finnishToOther.remove(translation);
        }
    }

    public boolean load() {
        try (Scanner fileReader = new Scanner(Paths.get(file))) {

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");

                finnishToOther.put(parts[0], parts[1]);

                otherToFinnish.put(parts[1], parts[0]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(file);
            for(String word : finnishToOther.keySet()) {
                writer.println(word + ":" + finnishToOther.get(word));
            }
            writer.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
