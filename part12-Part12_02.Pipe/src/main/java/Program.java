
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // you may try out your class here
        Pipe<String> pipe = new Pipe();
        pipe.putIntoPipe("dibi");
        pipe.putIntoPipe("dab");
        pipe.putIntoPipe("dab");
        pipe.putIntoPipe("daa");
        
        while(pipe.isInPipe()) {
            System.out.println(pipe.takeFromPipe());
        }
        System.out.println(pipe.takeFromPipe());

    }
}
