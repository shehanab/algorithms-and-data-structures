package Crimson.city;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 2, 3, 3}, new int[]{2, 3, 1, 4}, 4));
        System.out.println(new Solution().solution(new int[]{2, 3, 5, 6}, new int[]{1, 2, 4, 5}, 4));
    }

    public int solution2(int[] A, int[] B, int N) {
        int[] results = new int[N + 1];
        int m = A.length;
        for (int i = 0; i < m; i++) {
            results[A[i]] += 1;
            results[B[i]] += 1;
        }

        int max = 0;
        for (int i = 0; i < m; i++) {
            max = Math.max(results[A[i]] + results[B[i]] - 1, max);
        }
        return max;
    }


    public int solution(int[] A, int[] B, int N) {
        int[] results = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int c1 = A[i];
            int c2 = B[i];
            int rank = 1;

            for (int j = i + 1; j < A.length; j++) {
                if (c1 == A[j] || c1 == B[j] || c2 == A[j] || c2 == B[j]) {
                    rank++;
                }
            }
            for (int j = i - 1; j >= 0; j--) {
                if (c1 == A[j] || c1 == B[j] || c2 == A[j] || c2 == B[j]) {
                    rank++;
                }
            }
            results[i] = rank;
        }

        int max = 0;
        for (int i = 0; i < results.length; i++) {
            max = Math.max(results[i], max);
        }
        return max;
    }


}
