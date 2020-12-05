import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> changes;
    
    public ChangeHistory() {
        this.changes = new ArrayList<>();
    }
    
    public void add(double status) {
        this.changes.add(status);
    }
    
    public void clear() {
        this.changes = new ArrayList<>();
    }
    
    public double maxValue() {
        if (this.changes.isEmpty()) {
            return 0.0;
        }
        double max = this.changes.get(0);
        for (double status: this.changes) {
            if (status > max) {
                max = status;
            }
        }
        return max;
    }
    
    public double minValue() {
        if (this.changes.isEmpty()) {
            return 0.0;
        }
        double min = this.changes.get(0);
        for (double status: changes) {
            if (status < min) {
                min = status;
            }
        }
        return min;
    }
    
    public double average() {
        if (this.changes.isEmpty()) {
            return 0.0;
        }
        double total = 0.0;
        for (double status: this.changes) {
            total += status;
        }
        return total / this.changes.size();
    }
    
    public String toString() {
        return this.changes.toString();
    }
}
