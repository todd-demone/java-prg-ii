
public class Teacher extends Person {
    private int monthlySalary;
    
    public Teacher(String name, String address, int monthlySalary) {
        super(name, address);
        this.monthlySalary = monthlySalary;
    }
    
    public String toString() {
        return super.toString() + "\n  salary " + this.monthlySalary + " euro/month";
    }
}
