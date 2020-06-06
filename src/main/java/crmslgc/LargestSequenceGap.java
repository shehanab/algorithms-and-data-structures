package crmslgc;

import javax.swing.*;
import java.util.Arrays;

public class LargestSequenceGap {


    public static void main(String[] args) {
        int [] input = {10, 0, 8, 2, -1, 12, 11, 3};

        System.out.println(largetSequenceGap(input));

    }

    private static int solution(int[] A) {
        int max = 0;
        int distence = 0;
        Arrays.sort(A);
        for (int i = 0; i < A.length - 1; i++) {
            distence = A[i + 1] - A[i];
            if (Math.abs(distence) > max) {
                max = Math.abs(distence);
            }
        }
        return max / 2;
    }

    private static int largetSequenceGap(int[] input) {
        Arrays.sort(input);
        int maxDiff = 0;

        for(int i = 0; i < input.length - 1; i++){
            maxDiff = Math.max(maxDiff, input[i + 1] - input[i]);
        }

        return maxDiff == 1 ? maxDiff : maxDiff/2;

    }
}
