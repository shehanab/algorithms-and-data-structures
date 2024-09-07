package sliding.window;

public class SmallestSubArray {


    /**
     * Problem: Find the smallest subarray with a sum greater than or equal to a target number.
     *
     * Approach:
     * 	1.	Use a window that can expand and shrink dynamically based on the current sum of elements.
     * 	2.	Expand the window by adding elements to the right until the sum of the elements is greater than or equal to the target.
     * 	3.	Then, try to shrink the window from the left side to find the smallest subarray that meets the condition.
     *
     */

    public static int minSubArrayLen(int target, int[] nums) {
        // Edge case: if the array is empty or target is less than or equal to 0
        if (nums == null || nums.length == 0 || target <= 0) {
            return 0;
        }

        int minLength = Integer.MAX_VALUE;
        int windowSum = 0;
        int left = 0;

        // Iterate through the array
        for (int right = 0; right < nums.length; right++) {
            // Early exit if any single element is >= target
            if (nums[right] >= target) {
                return 1;
            }

            windowSum += nums[right];

            // Shrink the window from the left until the windowSum is smaller than target
            while (windowSum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                windowSum -= nums[left];
                left++;
            }
        }

        // If no valid subarray was found, return 0
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

}
