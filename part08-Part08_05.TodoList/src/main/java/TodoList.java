
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        this.list.add(task);
    }

    public void remove(int number) {
        int index = number - 1;
        if (index < 0 || index > this.list.size()) {
            return;
        }
        this.list.remove(index);
    }
    
    public void print() {
        int index = 0;
        while (index < list.size()) {
            System.out.println((index + 1) + ": " + list.get(index));
            index += 1;
        }
    }
}
