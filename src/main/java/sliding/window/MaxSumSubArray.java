package sliding.window;


/**
 * Problem: Find the maximum sum of a subarray of length k.
 * <p>
 * 1.	Use a window of size k.
 * 2.	Start by calculating the sum of the first k elements.
 * 3.	Then, slide the window one element at a time, subtracting the element that is going out of the window and adding the element that is coming into the window.
 */
public class MaxSumSubArray {

    public static int maxSumSubarray(int[] arr, int k) {
        int n = arr.length;
        if (n < k) {
            return -1; // If the array length is less than k, return an error value
        }

        // Compute the sum of the first window of size k
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        // Now slide the window
        int maxSum = windowSum;
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];  // Slide the window to the right
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
