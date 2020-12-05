
public class Container {

    private int level;
    private final int limit;

    public Container() {
        this.level = 0;
        this.limit = 100;
    }

    public int contains() {
        return this.level;
    }
    
    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        this.level += amount;
        if (this.level > 100) {
            this.level = 100;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        this.level -= amount;
        if(this.level < 0) {
            this.level = 0;
        }
    }
    
    public String toString() {
        return this.level + "/100";
    }
}
