package sliding.window;

import java.util.HashSet;

public class LongestDistinctCharString {

    public static int lengthOfLongestSubstring(String s) {
        // Initialize the set to keep track of the characters in the current window.
        HashSet<Character> set = new HashSet<>();

        // Initialize two pointers for the sliding window, and the result variable.
        int left = 0, right = 0, maxLength = 0;

        // Iterate through the string with the right pointer.
        while (right < s.length()) {
            // If the character at 'right' is not in the set, add it and update the maxLength.
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                // If the character is already in the set, remove the character at 'left' and move left.
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }

}
