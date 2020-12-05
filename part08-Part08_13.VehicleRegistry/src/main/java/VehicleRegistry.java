
import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {

    // hashmap because each record is a key (LicensePlate) and value (owner)
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        registry = new HashMap<>();
    }

    // add - add a new licence plate and owner
    public boolean add(LicensePlate licensePlate, String owner) {
        // check the hashmap for a record containing this key value pair
        // use get method; if it returns null then add record to hashmap
        // and return true
        // else return false
        if (this.get(licensePlate) == null) {
            this.registry.put(licensePlate, owner);
            return true;
        }

        return false;
    }

    // get - get owner based on license plate
    public String get(LicensePlate licensePlate) {
        // search the hashmap for a particular record
        // if found, return owner name
        // if not found, return null
        return this.registry.getOrDefault(licensePlate, null);
    }

    // remove - remove a record (license plate and owner)
    public boolean remove(LicensePlate licensePlate) {
        if (this.get(licensePlate) != null) {
            this.registry.remove(licensePlate);
            return true;
        }

        return false;
    }

    public void printLicensePlates() {
        //System.out.println("");
        //System.out.println("print license plates");
        for (LicensePlate plate : this.registry.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {

        ArrayList<String> namesList = new ArrayList<>();

        for (String owner : this.registry.values()) {

            boolean isNameInList = false;

            for (int index = 0; index < namesList.size(); index++) {

                if (namesList.get(index).equals(owner)) {
                    isNameInList = true;

                    break;
                }

            }

            // if found then continue
            // else print owner and add owner to list
            if (!isNameInList) {

                System.out.println(owner);
                namesList.add(owner);

            }

        }

    }
}
