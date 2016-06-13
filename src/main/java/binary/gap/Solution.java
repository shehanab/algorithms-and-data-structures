package binary.gap;


/**
 * Created by Shehan on 5/18/16.
 */
public class Solution {

    public static void main(String[] args) {
//        System.out.println(longestBinaryGap(15));
        System.out.println(longestBinaryGap(1041));
//        System.out.println(longestBinaryGap(20));

        System.out.println(solution(1041));

    }

    public static int longestBinaryGap(int num) {
        String binaryString = Integer.toBinaryString(num);
        System.out.println(binaryString);
        char[] binaries = binaryString.toCharArray();

        int longestGap = 0;
        int count = 0;

        for (char i : binaries) {

            if ("1".equals(Character.toString(i))) {
                if (count > longestGap) longestGap = count;
                count = 0;
            } else {
                count++;
            }

        }

        return longestGap;
    }

    public static int solution(int N) {
        // write your code in Java SE 8
        int numberOfGapes = 0;
        int maxGapLength = 0;
        boolean isStartWithOne = false;
        boolean isEndWithOne = false;
        while (N > 0) {
            if (N % 2 == 0) {
                if (isStartWithOne) {
                    numberOfGapes++;
                }
            } else {
                if (!isStartWithOne) {
                    isStartWithOne = true;
                } else {
                    maxGapLength = Math.max(maxGapLength, numberOfGapes);
                    numberOfGapes = 0;
                }
            }
            N = N / 2;
        }
        return maxGapLength;
    }
}



