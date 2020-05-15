package cacib;

import java.util.Arrays;

public class MinimumDistance {

    public static void main(String[] args) {

        int[] input = {8, 24, 3, 20, 1, 17};
        int[] input2 = {7, 21, 3, 42, 3, 7};

        System.out.println(minimumDistance(input));
        System.out.println(minimumDistance(input2));

        System.out.println(minDist(input));
        System.out.println(minDist(input2));
    }

    private static int minimumDistance(int[] arr) {
        int minimumDistance = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int x = Math.abs((arr[i] - arr[j]));
                if (x < minimumDistance) {
                    minimumDistance = x;
                }
            }
        }

        return minimumDistance;

    }

    private static int minDist(int[] arr) {
        // Apply merge sort (takes O(nlogn))
        Arrays.sort(arr);

        // Loop will take O(n) hence total time  in O(nlogn)
        int min_dist = Integer.MAX_VALUE;
        int dist = 0;
        for (int i = 1; i < arr.length; i++) {
            dist = arr[i] - arr[i - 1];
            if (min_dist > dist) {
                min_dist = dist;
            }
        }

        return min_dist;

    }
}
