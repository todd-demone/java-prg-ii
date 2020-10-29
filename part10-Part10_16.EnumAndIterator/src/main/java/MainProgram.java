import java.util.List;
import java.util.ArrayList;

public class MainProgram {

    public static void main(String[] args) {
        // test your classes here
        Employees employees = new Employees();
        employees.add(new Person("Todd", Education.HS));
        List<Person> listOfEmployees = new ArrayList<>();
        employees.add(new Person("Barb", Education.BA));
        employees.add(new Person("Carter", Education.PHD));
        employees.add(new Person("Austin", Education.PHD));
        listOfEmployees.add(new Person("Joe", Education.MA));
        listOfEmployees.add(new Person("Sally", Education.HS));
        employees.add(listOfEmployees);
        employees.print();
        System.out.println("----");
        employees.print(Education.HS);
        
        employees.fire(Education.MA);
        employees.print();
        
    }
}
