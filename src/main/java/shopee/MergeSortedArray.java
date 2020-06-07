package shopee;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 3, 4, 5, 8, 9};
        int[] array2 = {2, 3, 6, 7, 10};


        int[] result = mergeArrays(array1, array2);
        int[] result2 = mergeArraysBetter(array1, array2);

        printArr(result);
        printArr(result2);

    }


    // Merge arr1[0..n1-1] and arr2[0..n2-1]
    // into arr3[0..n1+n2-1]
    public static int[] mergeArraysBetter(int[] arr1, int[] arr2) {

        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] arr3 = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        // Traverse both array
        while (i < n1 && j < n2) {
            // Check if current element of first
            // array is smaller than current element
            // of second array. If yes, store first
            // array element and increment first array
            // index. Otherwise do same with second array
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }

        return arr3;
    }

    private static int[] mergeArrays(int[] array1, int[] array2) {
        int[] resutl = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            resutl[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            resutl[i + array1.length] = array2[i];
        }

        Arrays.sort(resutl);
        return resutl;

    }

    private static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i);
            System.out.print(",");
        }
    }
}
