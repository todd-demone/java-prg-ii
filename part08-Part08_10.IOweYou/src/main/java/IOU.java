import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> directoryOfCreditors;
    
    public IOU() {
        directoryOfCreditors = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        this.directoryOfCreditors.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return this.directoryOfCreditors.getOrDefault(toWhom, 0.0);
    }
}
