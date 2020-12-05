
public class MisplacingBox extends Box {
    private Item item;
    
    public MisplacingBox() {
        this.item = new Item("Placeholder Item");
    }
    
    @Override
    public void add(Item item) {
        return;
    }
    
    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
