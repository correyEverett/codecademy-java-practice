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

    }
}
