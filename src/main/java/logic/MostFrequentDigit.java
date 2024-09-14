package logic;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentDigit {

    // Method to find the most frequent digit using HashMap
    public static int findMostFrequentDigit(int number) {
        // Use a HashMap to store digit frequencies
        HashMap<Integer, Integer> digitCountMap = new HashMap<>();

        // Convert the number to a positive value in case it's negative
        number = Math.abs(number);

        // Count frequency of each digit
        while (number > 0) {
            int digit = number % 10;  // Get the last digit

            // Update the frequency of the digit in the map
            digitCountMap.put(digit, digitCountMap.getOrDefault(digit, 0) + 1);

            number /= 10;  // Remove the last digit
        }

        // Find the digit with the maximum frequency
        int maxFreq = 0;
        int mostFrequentDigit = 0;

        // Loop through the entries of the HashMap
        for (Map.Entry<Integer, Integer> entry : digitCountMap.entrySet()) {
            int digit = entry.getKey();
            int frequency = entry.getValue();

            // Check if the current digit has a higher frequency
            if (frequency > maxFreq) {
                maxFreq = frequency;
                mostFrequentDigit = digit;
            }
        }

        return mostFrequentDigit;
    }


    // Method to find the most frequent digit
    public static int findMostFrequentDigit2(int number) {
        // Array to store the frequency of digits (0-9)
        int[] digitCount = new int[10];

        // Convert the number to a positive value in case it's negative
        number = Math.abs(number);

        // Count frequency of each digit
        while (number > 0) {
            int digit = number % 10;  // Get the last digit
            digitCount[digit]++;      // Increment the frequency of that digit
            number /= 10;             // Remove the last digit
        }

        // Find the digit with the maximum frequency
        int maxFreq = 0;
        int mostFrequentDigit = 0;

        for (int i = 0; i < 10; i++) {
            if (digitCount[i] > maxFreq) {
                maxFreq = digitCount[i];
                mostFrequentDigit = i;
            }
        }

        return mostFrequentDigit;
    }

}
