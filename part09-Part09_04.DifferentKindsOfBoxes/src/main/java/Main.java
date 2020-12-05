

public class Main {

    public static void main(String[] args) {
        // You can test your program here
        BoxWithMaxWeight maxBox = new BoxWithMaxWeight(10);
        maxBox.add(new Item("Five1", 5));
        maxBox.add(new Item("Five2", 5));
        maxBox.add(new Item("Five3", 5));
        
        System.out.println(maxBox.isInBox(new Item("Five1")));
        System.out.println(maxBox.isInBox(new Item("Five2")));
        System.out.println(maxBox.isInBox(new Item("Five3")));
        
        System.out.println("---");
        
        Box oneBox = new OneItemBox();
//        System.out.println(oneBox.getSoleItem());
        System.out.println(oneBox.isInBox(new Item("Five1")));
        oneBox.add(new Item("Five1", 5));
        oneBox.add(new Item("Five2", 5));
        oneBox.add(new Item("Five3", 5));
        
        System.out.println(oneBox.isInBox(new Item("Five1")));
        System.out.println(oneBox.isInBox(new Item("Five2")));
        System.out.println(oneBox.isInBox(new Item("Five3")));
        System.out.println("---");
        
        Box mpb = new MisplacingBox();
        mpb.add(new Item("Test1", 5));
        mpb.add(new Item("Test2", 5));
        System.out.println(mpb.isInBox(new Item("Test1")));
        System.out.println(mpb.isInBox(new Item("Test2")));
        
        

                
    }
}
