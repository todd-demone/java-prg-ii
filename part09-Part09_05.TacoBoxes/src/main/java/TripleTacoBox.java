
import java.util.ArrayList;

public class TripleTacoBox implements TacoBox {

    int tacos;

    public TripleTacoBox() {
        this.tacos = 3;
    }
    
    public int tacosRemaining() {
        return this.tacos;
    }
    
    public void eat() {
        if (this.tacos <= 0) {
            this.tacos = 0;
            return;
        }
        this.tacos -= 1;
    }
    
    
}
