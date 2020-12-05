
public class OneItemBox extends Box {
    private Item soleItem;
    
    
    public OneItemBox() {
        this.soleItem = null;
    }
    
    @Override
    public void add(Item item) {
        if(this.soleItem != null) {
            return;
        }
        this.soleItem= item;
    }
    
    @Override
    public boolean isInBox(Item item) {
        if (this.soleItem == null) {
            return false;
        } else if (this.soleItem.equals(item)) {
            return true;
        } else {
            return false;
        }
    }
    
    public Item getSoleItem() {
        return this.soleItem;
    }
}
