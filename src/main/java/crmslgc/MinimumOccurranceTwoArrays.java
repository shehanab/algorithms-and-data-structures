package crmslgc;

import java.util.Arrays;

public class MinimumOccurranceTwoArrays {

    public static void main(String[] args) {

//        int[] a = {1, 3, 2, 1};
//        int[] b = {4, 2, 5, 3, 2};
//        System.out.println(solution(a, b));

        int[] a = {2, 1};
        int[] b = {3, 3};
        System.out.println(solution(a, b));
    }

    private static int solution(int[] a, int[] b) {

        int n = a.length;
        int m = b.length;
        Arrays.sort(a);
        Arrays.sort(b);


        int i = 0;

        for (int k = 0; k < n; k++) {
            if (i < m - 1 && b[i] < a[k]) {
                i += 1;
            }
            if (a[k] == b[i]) {
                return a[k];
            }
        }
        return -1;
    }


}
