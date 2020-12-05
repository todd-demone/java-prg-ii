
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, Book> bookDirectory = new HashMap<>();
        Book hobbit = new Book("Hobbit", 1934, "...");
        Book lotr = new Book("Lord of the Rings", 1956, "...");
        bookDirectory.put(hobbit.getName(), hobbit);
        bookDirectory.put(lotr.getName(), lotr);
        printValues(bookDirectory);
        System.out.println("---");
        printValueIfNameContains(bookDirectory, "obb");
        printValueIfNameContains(bookDirectory, "d of t");
    }
    
    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book book: hashmap.values()) {
            System.out.println(book);
        }
    }
    
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book book: hashmap.values()) {
            if (book.getName().contains(text)) {
                System.out.println(book);
            }
        }
    }
}
