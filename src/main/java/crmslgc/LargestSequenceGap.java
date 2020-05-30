package crmslgc;

import java.util.Arrays;

public class LargestSequenceGap {


    public static void main(String[] args) {
        int [] input = {10, 0, 8, 2, -1, 12, 11, 3};

        System.out.println(largetSequenceGap(input));
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
