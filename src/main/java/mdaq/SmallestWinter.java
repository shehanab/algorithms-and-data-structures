package mdaq;

import java.util.Random;

public class SmallestWinter {


    static int[] randomTemperatures(int n) {
        int[] ts = new int[n];
        for (int i = 0; i < ts.length; ++i) {
            ts[i] = i;
        }
        Random random = new Random(10);
        for (int i = 0; i < ts.length; ++i) {
            int j = i + random.nextInt(ts.length - i);
            int t = ts[i];
            ts[i] = ts[j];
            ts[j] = t;
        }
        return ts;
    }

    public static void main(String[] args) {
//        for (int i = 0; i < 100; ++i) {
//            int[] ts = randomTemperatures(64);
//            Solution s = new Solution();
//            int s1 = s.solution1(ts);
//            int s2 = s.solution2(ts);
//            if (s1 != s2) {
//                System.out.println("!!!");
//                System.out.println(Arrays.toString(ts));
//                System.out.println(s1);
//                System.out.println(s2);
//                return;
//            }
//        }


        Solution s = new Solution();

        int[] input = {5, -2, 3, 8, 6};
        int s1 = s.solution1(input);
        int s2 = s.solution2(input);
        System.out.println(s1);
        System.out.println(s2);

        int[] input2 = {-5, -5, -5, -42, 6, 12};
        System.out.println(s.solution1(input2));
        System.out.println(s.solution2(input2));
    }

    static class Solution {
        int solution1(int[] T) {
            int counter = 1;
            int winterMax = T[0];
            int summerMax = Integer.MIN_VALUE;
            boolean isWinter = true;
            for (int i = 1; i < T.length; i++) {
                int elem = T[i];
                if (isWinter) {
                    if (elem > winterMax) {
                        isWinter = false;
                        counter = i;
                    }
                } else {
                    if (elem <= winterMax) {
                        isWinter = true;
                        winterMax = summerMax;
                    }
                }
                summerMax = Math.max(summerMax, elem);
            }
            if (isWinter) {
                counter = T.length;
            }
            return counter;
        }

        int solution2(int[] T) {
            int counter = 1;
            int summerCounter = 0;
            int winterMax = T[0];
            int summerMax = Integer.MIN_VALUE;
            for (int i = 1; i < T.length; i++) {
                int elem = T[i];
                if (elem <= winterMax) {
                    if (summerCounter > 0) {
                        counter += summerCounter;
                        summerCounter = 0;
                        winterMax = summerMax;
                    }
                    counter++;
                } else {
                    summerMax = Math.max(summerMax, elem);
                    summerCounter++;
                }
            }
            return counter;
        }
    }
}
