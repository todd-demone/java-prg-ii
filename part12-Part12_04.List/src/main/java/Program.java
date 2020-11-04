
public class Program {

    public static void main(String[] args) {
        
        // test your class here
        List<String> myList = new List<>();
//        for (int i = 0; i < 12; i++) {
//            myList.add(Integer.toString(i));
//        }
//        System.out.println(myList.value(5));
//        
//        System.out.println(myList.contains("hello"));
//        myList.add("hello");
//        System.out.println(myList.contains("hello"));
//        myList.remove("hello");

        myList.add("hello");
        myList.add("world");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.value(i));
        }
        
        

    }

}
