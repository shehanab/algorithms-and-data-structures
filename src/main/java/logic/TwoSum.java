package logic;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    /**
     *    Two sum problem: Find two numbers in an array that add up to a specific target number.
     * @param nums
     * @param target
     * @return
     */
    public static int[] findTwoSum(int[] nums, int target) {
        // Create a HashMap to store the complement and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Loop through each number in the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If the complement exists in the map, return the numbers
            if (map.containsKey(complement)) {
                return new int[] { nums[map.get(complement)], nums[i] }; // Returning numbers
            }

            // Otherwise, add the current number and its index to the map
            map.put(nums[i], i);
        }

        // Return an empty array if no solution exists
        throw new IllegalArgumentException("No two sum solution");
    }
    public static int[] findTwoSumO2(int[] nums, int target) {
        int left = 0;
        int right = 1;

        while (left < nums.length - 1) {
            // Check if current pair adds up to the target
            if (nums[left] + nums[right] == target) {
                return new int[] {nums[left], nums[right]};
            }

            // Increment right pointer
            right++;

            // If right pointer reaches end, reset it and increment left
            if (right == nums.length) {
                left++;
                right = left + 1;
            }
        }

        // Return empty array if no solution found
        return new int[] {};
    }
}
