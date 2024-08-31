package company.aics;

public class Solution {

    // int[] nums = {-2, 1, -3, 4};

    public int calculateMaxSubArraySum(int[] num) {
        int maxSum = num[0];
        for (int i = 0; i <= num.length - 1; i++) {
            for (int j = i; j <= num.length - 1; j++) {
                maxSum = Math.max(maxSum, calculateSum(num,i, j));
            }

        }
        return maxSum;
    }

    int calculateSum (int [] num, int startIndex, int endIndex) {
        int sum = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            sum += num[i];
        }
        return sum;
    }

}
