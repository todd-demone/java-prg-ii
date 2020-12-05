import java.util.List;
import java.util.ArrayList;

public class Herd implements Movable {
    private List<Movable> herd;
    
    public Herd() {
        this.herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable movable: herd) {
            movable.move(dx, dy);
        }
    }
    
    public String toString() {
        String returnStr = "";
        for(Movable movable: herd) {
            returnStr += movable + "\n";
        }
        return returnStr;
    }
}
