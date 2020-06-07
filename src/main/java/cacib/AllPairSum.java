package cacib;

import java.util.Date;

public class AllPairSum {


    static public void main(String[] arg) {
        int[] arr = new int[100000000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        int n = arr.length;

        System.out.println(new Date());
        System.out.println(sumPairs(arr, n));
        System.out.println(new Date());
    }

    // Function to return the sum of the elements of all possible pairs from the array
    static int sumPairs(int[] arr, int n) {

        // To store the required sum
        int sum = 0;

        // For every element of the array
        for (int i = 0; i < n; i++) {

            // It appears (2 * n) times
            sum = sum + (arr[i] * (2 * n));
        }

        return sum;
    }


}
