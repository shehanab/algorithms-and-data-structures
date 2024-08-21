package booking.com.sum.of.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Shehan on 6/9/16.
 */
public class Solution {

//
//        int keyVal = 66;
//        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(10, 18, 11, 21, 28, 31, 38, 40, 55, 60, 62));
//

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            int e = sc.nextInt();
            numberList.add(e);
        }
        System.out.println(getPairCount(numberList, n));

    }

    public static int getPairCount(List<Integer> numList, int sum) {
        for (int i = 0; i < numList.size() - 1; i++) {
            for (int j = i + 1; j < numList.size(); j++) {
                if (numList.get(i) + numList.get(j) == sum) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
