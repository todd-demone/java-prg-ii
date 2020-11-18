
import java.util.Random;

public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int x = size / 2;
        int y = 0;
        int value = 1;
        // place first value in the middle of the top row of square
        square.placeValue(x, y, value);

        // while (array !populated)
        while (square.giveAllNumbers().contains(0)) {
            value += 1;

            // save original x and y values - just in case the 
            // square you try to move to is already populated
            int oldx = x;
            int oldy = y;

            // Try to go to next square, i.e.
            // try to move one up and one to the right.
            // If moving up one position makes us go over top edge 
            // then move to the bottom row
            if (y - 1 < 0) {
                y = square.getHeight() - 1;
            // otherwise move up one position
            } else {
                y -= 1;
            }
            // if move to the right position makes us go over the right edge
            // then move to the left-most row
            if (x + 1 > square.getWidth() - 1) {
                x = 0;
            } else {
                x += 1;
            }

            // does the square you're trying to move to already have a value?
            if (square.readValue(x, y) != 0) {
                // place square one level below the number you placed in the 
                // previous iteration of the loop
                square.placeValue(oldx, (oldy + 1), value);
            } else {
                square.placeValue(x, y, value);
            }
        }
        return square;
    }
}
