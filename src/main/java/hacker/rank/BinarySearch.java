package hacker.rank;

import java.util.Arrays;

/**
 * Created by Shehan on 6/8/16.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int [] d = {3,5,6,7,8,4,2};
        System.out.println(binarySearch(d, 8));

        // initializing unsorted int array
        int intArr[] = {30,20,5,12,55};

        // sorting array
        Arrays.sort(intArr);

        // entering the value to be searched
        int searchVal = 12;

        int retVal = Arrays.binarySearch(intArr,searchVal);
    }

    public static boolean binarySearch(int [] data, int key) {
        int low = 0;
        int high = data.length - 1;

        while (high >= low) {
            int middle = (low + high) / 2;
            if (data[middle] == key) {
                return true;
            }
            if (data[middle] < key) {
                low = middle + 1;
            }
            if (data[middle] > key) {
                high = middle - 1;
            }
        }
        return false;
    }

}
