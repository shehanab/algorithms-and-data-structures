package sliding.window.consecutiveOnes;

public class ConsecutiveOnesInBinaryString {


    /**
     * You can maintain a sliding window over the string and track how many zeros are in the current window.
     * You increase the window size as long as the number of zeros is within the allowed changes K.
     * If it exceeds K, you slide the window forward by shrinking it from the left side.
     *
     * Explanation:
     * 	•	Left and Right Pointers: This is a standard sliding window technique, where left and right denote the boundaries of the window.
     * 	•	Zero Counting: We keep a count of how many 0s are within the window. If this count exceeds K, we move the left pointer to the right until we have zeroCount <= K.
     * 	•	Max Length Calculation: As we adjust the window, we check the length of the window and update the maxLen and ways (number of ways to achieve this max length).
     */
    public static int longSubseg(String strS, int changeK) {
        int left = 0; // Left boundary of the sliding window
        int zeroCount = 0; // Number of zeros in the current window
        int maxLen = 0; // Maximum length of consecutive 1s we can achieve
        int ways = 0; // Number of ways to achieve the maximum length

        for (int right = 0; right < strS.length(); right++) {
            // If we encounter a '0', we increment the zeroCount
            if (strS.charAt(right) == '0') {
                zeroCount++;
            }

            // If zeroCount exceeds allowed changes, move the left boundary
            while (zeroCount > changeK) {
                if (strS.charAt(left) == '0') {
                    zeroCount--;
                }
                left++; // Shrink the window
            }

            // Calculate current window length
            int currentLen = right - left + 1;

            // If current length is longer than maxLen, update maxLen and reset ways
            if (currentLen > maxLen) {
                maxLen = currentLen;
                ways = 1; // Reset the count to 1 since this is a new max
            } else if (currentLen == maxLen) {
                ways++; // If same as maxLen, increment the count of ways
            }
        }

        return ways;
    }

}
