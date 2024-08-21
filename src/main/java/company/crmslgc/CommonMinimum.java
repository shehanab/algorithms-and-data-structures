package crmslgc;

import java.util.Arrays;

public class CommonMinimum {

    private static int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;

        Arrays.sort(A);
        Arrays.sort(B);

        int i = 0;
        for (int k = 0; k < A.length; k++) {
            if (i < m - 1 && B[i] < A[k]) {
                while (i < m - 1 && B[i] < A[k]) {
                    i += 1;
                }
            }
            if (A[k] == B[i]) {
                return A[k];
            }
        }

        return -1;
    }
}
