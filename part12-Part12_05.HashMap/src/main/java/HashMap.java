
import java.util.ArrayList;

public class HashMap<K, V> {

    private ArrayList<Pair<K, V>>[] values;
    private int firstFreeIndex;

    public HashMap() {
        this.values = new ArrayList[32];
        this.firstFreeIndex = 0;
    }

    public V get(K key) {
        // calculate hash value of key
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            return null;
        }
        // declare an ArrayList variable to the ArrayList with key
        ArrayList<Pair<K, V>> arrayListInsideArray = this.values[hashValue];
        // loop through array to find index of array that you want
        for (int i = 0; i < arrayListInsideArray.size(); i++) {
            if (arrayListInsideArray.get(i).getKey().equals(key)) {
                return arrayListInsideArray.get(i).getValue();
            }
        }
        return null;
    }

    public void add(K key, V value) {

        ArrayList<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);

        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        } else {
            valuesAtIndex.get(index).setValue(value);
        }

        if (1.0 * this.firstFreeIndex / this.values.length > 0.75) {
            grow();
        }
    }

    public ArrayList<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % values.length);
        if (values[hashValue] == null) {
            values[hashValue] = new ArrayList<Pair<K, V>>();
        }
        return values[hashValue];
    }

    public int getIndexOfKey(ArrayList<Pair<K, V>> myList, K key) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getKey().equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public void grow() {
        // create a new array
        ArrayList<Pair<K, V>>[] newArray = new ArrayList[this.values.length * 2];

        for (int i = 0; i < this.values.length; i++) {
            copy(newArray, i);
        }

        this.values = newArray;
    }

    public void copy(ArrayList<Pair<K, V>>[] newArray, int fromIdx) {
        for (int i = 0; i < this.values[fromIdx].size(); i++) {
            Pair<K, V> value = this.values[fromIdx].get(i);

            int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);
            if (newArray[hashValue] == null) {
                newArray[hashValue] = new ArrayList<>();
            }

            newArray[hashValue].add(value);
        }
    }
    
    

    public V remove(K key) {
        ArrayList<Pair<K, V>> arrayListInsideArray = getListBasedOnKey(key);
        if(arrayListInsideArray.size() == 0) {
            return null;
        }
        
        int index = getIndexOfKey(arrayListInsideArray, key);
        if (index < 0) {
            return null;
        }
        
        Pair<K, V> pair = arrayListInsideArray.get(index);
        arrayListInsideArray.remove(pair);
        return pair.getValue();
    }

}
