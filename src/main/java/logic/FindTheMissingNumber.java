package logic;

public class FindTheMissingNumber {

    /**
     *  Given an array containing n - 1 numbers ranging from 1 to n, find the missing number.
     * @param arr
     * @return
     */
    public static int findMissingNumber(int[] arr, int n) {
        // Step 1: Calculate the expected sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;

        // Step 2: Calculate the actual sum of the numbers in the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // Step 3: The missing number is the difference between expectedSum and actualSum
        return expectedSum - actualSum;
    }


    public static int findMissingNumber(int[] arr) {
        // Traverse through the array to find the first mismatch
        for (int i = 0; i < arr.length; i++) {
            // If the current element is not equal to index + 1
            if (arr[i] != i + 1) {
                return i + 1;  // The missing number is index + 1
            }
        }

        // If all elements are correct, the missing number is n (the largest one)
        return arr.length + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Example array, missing number is 3
        int n = 6; // Since the numbers range from 1 to n, n is 6 in this case
        int missingNumber = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missingNumber);
    }

}
