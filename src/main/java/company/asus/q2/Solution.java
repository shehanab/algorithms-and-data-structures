package company.asus.q2;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] A, int F, int M) {
        int knownRollsSum = calculateSum(A);
        int totalRequiredSum = calculateTotalRequiredSum(A.length, F, M);
        int missingRollsSum = calculateMissingRollsSum(totalRequiredSum, knownRollsSum);

        if (!isFeasible(F, missingRollsSum)) {
            return new int[]{0};
        }

        return distributeMissingRolls(F, missingRollsSum);
    }

    private int calculateSum(int[] rolls) {
        return Arrays.stream(rolls).sum();
    }

    private int calculateTotalRequiredSum(int knownRollsCount, int missingRollsCount, int targetMean) {
        return targetMean * (knownRollsCount + missingRollsCount);
    }

    private int calculateMissingRollsSum(int totalRequiredSum, int knownRollsSum) {
        return totalRequiredSum - knownRollsSum;
    }

    private boolean isFeasible(int missingRollsCount, int missingRollsSum) {
        int minPossibleSum = missingRollsCount * 1;
        int maxPossibleSum = missingRollsCount * 6;
        return missingRollsSum >= minPossibleSum && missingRollsSum <= maxPossibleSum;
    }

    private int[] distributeMissingRolls(int missingRollsCount, int missingRollsSum) {
        int[] result = new int[missingRollsCount];

        for (int i = 0; i < missingRollsCount; i++) {
            result[i] = Math.min(6, missingRollsSum - (missingRollsCount - 1 - i));
            missingRollsSum -= result[i];
        }

        return result;
    }
}