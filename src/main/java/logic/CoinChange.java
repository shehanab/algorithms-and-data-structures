package logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinChange {

    public static int findMinCoins1(int[] denominations, int amount) {
        // Sort denominations in descending order
        Arrays.sort(denominations);

        int count = 0;

        // Traverse in reverse order to start with the largest coin
        for (int i = denominations.length - 1; i >= 0; i--) {
            int deno = denominations[i];

            // Add how many coins of this denomination are needed
            count = count + amount / deno;

            // Update the remaining amount to be made
            amount = amount % deno;

            // If the remaining amount becomes 0, we're done
            if (amount == 0) {
                return count;
            }
        }

        return count;
    }





    // Function to calculate the minimum number of coins required
    public static void findMinCoins(int[] denominations, int amount) {
        // Sort denominations in descending order for the greedy algorithm
        Arrays.sort(denominations);
        int coinCount = 0;
        List<Integer> coinsUsed = new ArrayList<>();

        // Traverse the sorted denominations array from the largest to smallest
        for (int i = denominations.length - 1; i >= 0; i--) {
            // While the current denomination is less than or equal to the amount
            while (amount >= denominations[i]) {
                amount -= denominations[i]; // Reduce the amount by that denomination
                coinsUsed.add(denominations[i]); // Keep track of the coins used
                coinCount++; // Increment the number of coins used
            }
        }

        // Output the result
        if (amount == 0) {
            System.out.println("Minimum number of coins required: " + coinCount);
            System.out.println("Coins used: " + coinsUsed);
        } else {
            System.out.println("Cannot make the exact amount with the given denominations.");
        }
    }
}
