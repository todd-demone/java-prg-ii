
public class Program {

    public static void main(String[] args) {
        // Test your method here
        int[][] myArray = new int[5][6];
        int index = 1;
        for (int row = 0; row < myArray.length; row++) {
            
            for (int column = 0; column < myArray[row].length; column++) {
                
                myArray[row][column] = index;
                index++;
            }
        }
        System.out.println(arrayAsString(myArray));
    }
    
    public static String arrayAsString(int[][] array) {
        StringBuilder str = new StringBuilder();
        for(int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                str.append(array[row][column]);
            }
            str.append("\n");
        }
        return str.toString();
    }

}
