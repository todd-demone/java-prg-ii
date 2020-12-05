
import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {

    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void add(String product, int price) {
        if (this.items.get(product) == null) {
            this.items.put(product, new Item(product, 1, price));
        } else {
            this.items.get(product).increaseQuantity();
        }
        
    }

    public int price() {
        int total = 0;
        for (Item item : items.values()) {
            total += item.price();
        }
        return total;
    }

    public void print() {
        for (Item item : items.values()) {
            System.out.println(item);
        }
    }
}
