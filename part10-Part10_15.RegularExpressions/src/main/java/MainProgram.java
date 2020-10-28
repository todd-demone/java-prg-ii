

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Checker checker = new Checker();
        System.out.println(checker.isDayOfWeek("tue"));
        System.out.println(checker.isDayOfWeek("hha"));
        System.out.println(checker.allVowels("queue"));
        System.out.println(checker.allVowels("oe"));
        System.out.println(checker.timeOfDay("12:23:45"));
        System.out.println(checker.timeOfDay("123:1:99"));
    }
}
