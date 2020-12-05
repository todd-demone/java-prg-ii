import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageUnits;
    
    public StorageFacility() {
        this.storageUnits = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        // check if key (unit) exists; if so, add item to that list
        if(this.storageUnits.containsKey(unit)) {
            this.storageUnits.get(unit).add(item);
        // else create new hashmap entry with new ArrayList<String>
        // add item to ArrayList
        } else {
            ArrayList<String> items = new ArrayList<>();
            this.storageUnits.put(unit, items);
            this.storageUnits.get(unit).add(item);
        }
        
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return this.storageUnits.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item) {
        // removes the item from the given storageUnit
        // get the value (arraylist) of the key that's given
        // loop through the values, if find item, remove item
        // only removes one item
        for (String thingie: this.storageUnits.get(storageUnit)) {
            if(thingie.equals(item)) {
                this.storageUnits.get(storageUnit).remove(item);
                break;
            }
        }
        // if unit is empty after removal, remove the unit too
        if (this.storageUnits.get(storageUnit).size() == 0) {
            this.storageUnits.remove(storageUnit);
        }
        
        
        
        
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> namesOfStorageUnits = new ArrayList<>();
        for (String unit: this.storageUnits.keySet()) {
            namesOfStorageUnits.add(unit);
        }
        return namesOfStorageUnits;
    }
}
