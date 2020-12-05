
import java.util.ArrayList;

public class Box implements Packable {

    private ArrayList<Packable> items = new ArrayList<>();
    private double capacity;

    public Box(double capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add(Packable item) {
        if (item.weight() + this.weight() <= this.capacity) {
            this.items.add(item);
        }
        
    }

    @Override
    public double weight() {
        double weight = 0.0;
        for (Packable item : items) {
            weight += item.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }
}
