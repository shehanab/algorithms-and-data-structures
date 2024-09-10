package logic;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElementsCounter {


    public static int countCommonElements(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        int count = 0;

        // Traverse both arrays using two pointers
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                count++; // Increment count if both elements are the same
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++; // Move the pointer in the first array
            } else {
                j++; // Move the pointer in the second array
            }
        }

        return count;
    }

    public static int countCommonElements2(int[] arr1, int[] arr2) {
        Set<Integer> distinctElem = new HashSet<>();
        distinctElem.addAll(Arrays.stream(arr1).boxed().collect(Collectors.toList()));
        distinctElem.addAll(Arrays.stream(arr2).boxed().collect(Collectors.toList()));
        return (arr1.length + arr2.length - distinctElem.size());
    }

    public static int countCommonElements3(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> commonElements = new HashSet<>();

        // Add elements of arr1 to the set1
        for (int num : arr1) {
            set1.add(num);
        }

        // Check arr2 elements, if they are present in set1, add them to commonElements
        for (int num : arr2) {
            if (set1.contains(num)) {
                commonElements.add(num);
            }
        }

        // Return the size of commonElements which holds the common elements
        return commonElements.size();
    }


}
