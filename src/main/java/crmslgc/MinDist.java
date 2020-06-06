package crmslgc;

import java.util.Arrays;

public class MinDist {

    public static void main(String[] args) {

        int [] input1 = {8, 24, 3, 20, 1, 17};
        int [] input2 = {7, 21, 3, 42, 3, 7};
        System.out.println(solution(input1));
        System.out.println(solution(input2));
    }

    private static int solution(int[] A) {
        Arrays.sort(A);
        int distance = A[1] - A[0];
        for (int i = 0; i < A.length - 1; i++) {

            int i1 = A[i + 1] - A[i];
            if (i1 < distance) {
                distance = i1;
            }
        }
        return distance;
    }

}
