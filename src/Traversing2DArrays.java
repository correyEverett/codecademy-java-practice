public class Traversing2DArrays {
    public static void main(String[] args) {
        //Given the provided 2d array
        int[][] intMatrix = {
                { 4,  6,  8, 10, 12, 14, 16},
                {18, 20, 22, 24, 26, 28, 30},
                {32, 34, 36, 38, 40, 42, 44},
                {46, 48, 50, 52, 54, 56, 58},
                {60, 62, 64, 66, 68, 70, 79}
        };
        // Store the number of subarrays of intMatrix into a variable called 'numSubArrays'
        int numSubArrays = intMatrix.length;

        // Store the length of the subarrays using the first subarray in intMatrix. Store it in a variable called subArrayLength.
        int subArrayLength = intMatrix[0].length;

        // Store the number of columns in intMatrix into a variable called 'columns'
        int columns = intMatrix[0].length;

        // Store the number of rows in intMatrix into a variable called 'rows'
        int rows = intMatrix.length;

        // iterate through the entire 2D array. Print the sum of the indeces.
        int sum = 0;
        for(int i=0; i < intMatrix.length; i++) {
            for(int j = 0; j < intMatrix[i].length; j++) {
                sum += intMatrix[i][j];
            }
        }
        System.out.println(sum);
    }
}
