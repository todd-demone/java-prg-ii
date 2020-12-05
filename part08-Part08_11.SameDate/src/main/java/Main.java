
public class Main {

    public static void main(String[] args) {
        // make test programs here
        SimpleDate date = new SimpleDate(1, 2, 2000);
        System.out.println(date.equals("heh"));
        System.out.println(date.equals(new SimpleDate(5, 2, 2012)));
        System.out.println(date.equals(new SimpleDate(1, 2, 2000)));
    }
}
