
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your test code here
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Joe", "2334 Driveway Drive"));
        persons.add(new Student("Ollie", "123 Main Street"));
        persons.add(new Teacher("Esko", "444 Mill St.", 2400));
        printPersons(persons);
    }

    public static void printPersons(ArrayList<Person> persons) {
        int index = 0;
        while (index < persons.size()) {
            System.out.println(persons.get(index));
            index += 1;
        }
    }

}
