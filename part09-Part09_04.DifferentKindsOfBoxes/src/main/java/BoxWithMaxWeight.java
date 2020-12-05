import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private ArrayList<Item> items;
    private int capacity;
    
    
    public BoxWithMaxWeight(int capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;
        
    }

    @Override
    public void add(Item item) {
        if(item.getWeight() > this.capacity) {
            return;
        }
        this.items.add(item);
        this.capacity -= item.getWeight();
    }
    
    @Override 
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
    
    
    
}
