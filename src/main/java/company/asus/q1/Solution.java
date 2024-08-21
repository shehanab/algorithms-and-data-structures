package company.asus.q1;

public class Solution {

    public static void main(String[] args) {

    }



    public int[] solution(int[] A, int F, int M) {
        int N = A.length;
        int totalRolls = N + F;
        int totalSumRequired = M * totalRolls;
        int sumKnownRolls = 0;

        for (int roll : A) {
            sumKnownRolls += roll;
        }

        int sumMissingRolls = totalSumRequired - sumKnownRolls;

        // Check feasibility
        int minPossibleSum = F * 1;
        int maxPossibleSum = F * 6;

        if (sumMissingRolls < minPossibleSum || sumMissingRolls > maxPossibleSum) {
            return new int[]{0}; // Not possible to achieve the mean M
        }

        int[] result = new int[F];
//        Arrays.fill(result, 1); // Start with the minimum possible values
        int remaining = sumMissingRolls - F; // Adjust this to match sumMissingRolls

        for (int i = 0; i < F && remaining > 0; i++) {
            int add = Math.min(5, remaining); // We can add at most 5 to each roll (since it's already 1)
            result[i] += add;
            remaining -= add;
        }

        return result;
    }

}




