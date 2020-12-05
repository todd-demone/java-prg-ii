
public class Main {

    public static void main(String[] args) {
        // test your classes here
        Book book1 = new Book("Dostoyevsky", "Crime and Punishment", 2);
        Book book2 = new Book("Martin", "Clean Code", 1);
        Book book3 = new Book("Beck", "Test Driven Development", 0.5);
        
        CD cd1 = new CD("Pink Floyd", "Dark side of the Moon", 1973);
        CD cd2 = new CD("Some band", "Self-titled", 1997);
        CD cd3 = new CD("Weezer", "Buddy Holly", 1995);
//        
//        System.out.println(book1);
//        System.out.println(book2);
//        System.out.println(book3);
//        System.out.println(cd1);
//        System.out.println(cd2);
//        System.out.println(cd3);

        Box box = new Box(10);
        box.add(book1);
        box.add(book2);
        box.add(book3);
        box.add(cd1);
        box.add(cd2);
        box.add(cd3);
        
        System.out.println(box);
        
        Box box2 = new Box(10);
        box2.add(box);
        System.out.println(box2);
        
    }

}
