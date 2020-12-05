import java.util.List;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // test your method here
        List<String> books = new ArrayList<>();
        books.add("book1");
        books.add("book2");
        books.add("book3");
        System.out.println("This list has " + returnSize(books) + " books in it.");

    }

    // Implement here a method returnSize
    // which returns the size of the list given to it
    //as a parameter
    public static int returnSize(List list) {
        return list.size();
    }
}
