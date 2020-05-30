package crmslgc;

import java.util.HashSet;
import java.util.Set;

public class VariousCandies {

    public static void main(String[] args) {

        int[] input = {3, 4, 7, 7, 6, 6};
        int[] input2 = {8, 8, 10, 8, 8, 8, 8, 8, 8, 12};
        System.out.println(varietyForHalf(input));
        System.out.println(varietyForHalf(input));


    }

    private static int varietyForHalf(int[] input) {

        Set<Integer> varity = new HashSet<>();

        for (int i : input) {
            varity.add(i);
        }

        return Math.min(varity.size(), input.length / 2);


    }


}
