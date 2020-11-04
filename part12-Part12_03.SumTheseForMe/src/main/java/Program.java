
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here
        int[] numbers = {3, -1, 8, 4};
        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 2, 2, 0, 10));
        System.out.println(sum(numbers, -1, 2, 0, 10));
        System.out.println(sum(numbers, 0, numbers.length, -2, 10));

    }
    
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        int sum = 0;
        if(fromWhere < 0) {
            fromWhere = 0;
        }
        if(toWhere > array.length) {
            toWhere = array.length;
        }
        while(fromWhere < toWhere) {
            if ((array[fromWhere] >= smallest) && (array[fromWhere] <= largest)) {
                sum += array[fromWhere];
            }
            fromWhere += 1;
        }
        return sum;
    }

}
