package sliding.window;

public class MaxSubArraySum {


    // Function to find the maximum sum of a subarray using brute-force
    public  int calculateMaxSubArraySumBruteForce(int[] arr) {
        int maxSum = Integer.MIN_VALUE; // Initialize to the smallest possible value

        // Iterate over each subarray starting point
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            // Iterate over each subarray ending point
            for (int j = i; j < arr.length; j++) {
                // Add the current element to the current subarray sum
                currentSum += arr[j];
                // Update maxSum if the current subarray sum is greater
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }

    public int maxSubArraySum(int[] arr) {
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // Update maxEndingHere to include the current element
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            // Update maxSoFar if maxEndingHere is greater
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }


}
