package crmslgc;

import java.util.HashSet;
import java.util.Set;

public class RemoveHalf {

    public static void main(String[] args) {

        int[] input = {3, 4, 7, 7, 6, 6};
        int[] input2 = {8, 8, 10, 8, 8, 8, 8, 8, 8, 12};
        System.out.println(varietyForHalf(input));
        System.out.println(varietyForHalf(input));


    }

    private static int solution(int[] T) {

        int allCandy = T.length;

        Set<Integer> types = new HashSet<>();

        for (int i = 0; i < allCandy; i++) {
            types.add(T[i]);
        }

        if (types.size() < allCandy / 2)
            return types.size();
        else return allCandy / 2;

    }

    private static int varietyForHalf(int[] input) {

        Set<Integer> variety = new HashSet<>();

        for (int i : input) {
            variety.add(i);
        }

        return Math.min(variety.size(), input.length / 2);


    }
}
