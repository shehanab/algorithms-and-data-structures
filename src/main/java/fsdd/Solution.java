package fsdd;

public class Solution {

    public static int countConsecutiveSum(long num) {
        int sumCount = 0;
        for (long i = 1; i <= (num / 2); i++) {
            long temp = num;
            long j = i;
            if (j < temp) {
                temp = temp - j;
                j++;
            }
            if (j == temp) {
                sumCount++;
            }
        }
        return sumCount;
    }

    // Driver code to test above function 
    public static void main(String[] args) {
        int N = 15;
        System.out.println(countConsecutiveSum(N));
        N = 10;
        System.out.println(countConsecutiveSum(N));
        N = 21;
        System.out.println(countConsecutiveSum(N));
    }
}
