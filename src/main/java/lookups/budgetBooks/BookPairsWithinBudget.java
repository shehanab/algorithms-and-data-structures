package lookups.budgetBooks;

import java.util.HashSet;
import java.util.Set;

public class BookPairsWithinBudget {

    int findPairs(float [] prices, float budget) {
        Set<Float> seenPrices = new HashSet<>();
        int pairCount = 0;

        for (float price : prices) {
            float remainingBudge = budget - price;
            if (seenPrices.contains(remainingBudge)) {
                pairCount++;
            }
            seenPrices.add(price);
        }
        return pairCount;
    }

}
