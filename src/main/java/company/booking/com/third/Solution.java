package booking.com.third;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Shehan on 6/8/16.
 */
public class Solution {


    public static void main(String[] args) {
        ArrayList numList = new ArrayList<>(Arrays.asList(25626, 25757, 24367, 24267, 16, 100, 2, 7277));
        System.out.println(numList);
        printDeltaEncoding(numList);
        printNewEncoding(numList);
    }

    public static void printDeltaEncoding(ArrayList<Integer> numList) {
        List<Integer> outList = new ArrayList<>();
        int sum = 0;

        outList.add(numList.get(0));
        for (int i = 0; i < numList.size() - 1; i++) {
            sum = numList.get(i + 1) - numList.get(i);
            outList.add(sum);
        }

        System.out.println(outList);
    }

    public static void printNewEncoding(ArrayList<Integer> numList) {
        List<Integer> outList = new ArrayList<>();
        int sum = 0;

        outList.add(numList.get(0));
        for (int i = 0; i < numList.size() - 1; i++) {
            sum = numList.get(i + 1) - numList.get(i);
            // -127 <= sum <= 127
            if (!(sum >= -127 && sum <= 127)) {
                outList.add(-128);
            }
            outList.add(sum);
        }

        System.out.println(outList);
    }

}
