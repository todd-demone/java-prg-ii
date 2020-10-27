
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<LitRecord> records = new ArrayList<LitRecord>();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> LiteracyComparison.createArrayRecord(row))
                    // [0] Adult literacy rate, [1] population 15+ years, [2] female (%),[3] United Republic of Tanzania,[4] 2015, [5] 76.08978
                    .forEach(arrayRecord -> records.add(new LitRecord(arrayRecord[3], arrayRecord[2], Integer.valueOf(arrayRecord[4]) , Double.valueOf(arrayRecord[5]))) );
                       
//            for(LitRecord record: records) {
//                System.out.println(record);
//            }

            records.stream()
                    .sorted((record1, record2) -> { 
                        if (record1.getLiteracyRate() > record2.getLiteracyRate()) {
                            return 1;
                        } 
                        if (record1.getLiteracyRate() < record2.getLiteracyRate()) {
                            return -1;
                        }
                        return 0;
                    })                           
                    .forEach(record -> System.out.println(record));
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
        
    }
    
    public static String[] createArrayRecord(String row) {
        String[] myArray = row.split(",");
        String[] genderArray;
        genderArray = myArray[2].split("\\(");
        myArray[2] = genderArray[0].trim();
        return myArray;
    }
}
