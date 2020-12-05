
public class Main {

    public static void main(String[] args) {
        // make test programs here
        SimpleDate date1 = new SimpleDate(1, 2, 2000);
        SimpleDate date2 = new SimpleDate(1, 2, 2000);
        SimpleDate date3 = new SimpleDate(12, 12, 2020);
        SimpleDate date4 = new SimpleDate(1, 2, 2000);
        SimpleDate date5 = new SimpleDate(12, 12, 2000);
        
        System.out.println(date1.hashCode());
        System.out.println(date2.hashCode());
        System.out.println(date3.hashCode());
        System.out.println(date4.hashCode());
        System.out.println(date5.hashCode());

    }
}
