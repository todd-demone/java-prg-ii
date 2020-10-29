
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Employees {

    private List<Person> employees;

    public Employees() {
        employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        for (Person person : peopleToAdd) {
            employees.add(person);
        }
    }

    public void print() {
        Iterator<Person> iterator = employees.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
    }

    public void print(Education education) {
        Iterator<Person> iterator = employees.iterator();
        while(iterator.hasNext()) {
            Person currentPerson = iterator.next();
            if(currentPerson.getEducation() == education) {
                System.out.println(currentPerson);
            }
        }
        
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();
        
        while(iterator.hasNext()) {
            if(iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
