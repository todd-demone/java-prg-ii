import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author toddd
 */
public class Pipe<T> {
    private ArrayList<T> items;
    
    public Pipe() {
        items = new ArrayList<>();
    }
    
    public void putIntoPipe(T item) {
        items.add(item);
    }
    
    public T takeFromPipe() {
        if(this.items.isEmpty()) {
            return null;
        }
            
        T item = items.get(0);
        items.remove(0);
        return item;
    }
    
    public boolean isInPipe() {
        return !items.isEmpty();
    }
}
