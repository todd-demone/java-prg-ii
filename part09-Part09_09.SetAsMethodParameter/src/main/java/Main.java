import java.util.Set;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        // You can test your method here
        Set<String> names = new HashSet<>();
        names.add("Joe");
        names.add("Joe");
        names.add("Jim");
        System.out.println(returnSize(names));

    }

    // implement the method returnSize here, which returns
    // the number of elements in the set that it receives as a parameter.
    public static int returnSize(Set set) {
        return set.size();
    }

}
