package logic;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MergeSortedArraysUsingSet {

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        // Use TreeSet to store elements in sorted order and avoid duplicates
        Set<Integer> set = new TreeSet<>();

        // Add elements of arr1 and arr2 to the set
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }

        // Convert the set back to an array
        int[] mergedArray = new int[set.size()];
        int i = 0;
        for (int num : set) {
            mergedArray[i++] = num;
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 6};

        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        // Print the merged array
        System.out.println(Arrays.toString(mergedArray));
    }
}
