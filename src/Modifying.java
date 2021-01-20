import java.util.Arrays;
public class Modifying {
    public static void main(String[] args) {
        // Using the provided 2D array
        int[][] intMatrix = {
                {1, 1, 1, 1, 1},
                {2, 4, 6, 8, 0},
                {9, 8, 7, 6, 5}
        };

        // Replace the number 4 in the 2D array with the number 0
        intMatrix[1][1] = 0;
        System.out.println(Arrays.deepToString(intMatrix));

        // Declare and initialize a new empty 2x2 integer 2D array called subMatrix
        int[][] subMatrix = new int[2][2];

    }
}