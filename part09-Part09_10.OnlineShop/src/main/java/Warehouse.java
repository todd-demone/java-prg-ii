
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Warehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stocks.put(product, stock);

    }
    
    public int price(String product) {
        if (this.prices.get(product) == null) {
            return -99;
        }
        return this.prices.get(product);
    }
    
    public int stock(String product) {
        if (this.stocks.get(product) == null) {
            return 0;
        }
        return this.stocks.get(product);
    }
    
    public boolean take(String product) {
        if ((this.stocks.get(product) == null) || this.stocks.get(product) <= 0) {
            return false;
        }
        this.stocks.put(product, (this.stocks.get(product) - 1));
        return true;
    }
    
    public Set<String> products() {
        return this.prices.keySet();
    }

}
