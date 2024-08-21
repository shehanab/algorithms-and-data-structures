package rakuten.standard.deviation;

/**
 * Created by Shehan on 6/12/16.
 */
public class Solution {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        double ave = getAverage(arr);
        System.out.println(ave);

        System.out.println(getStandardDeviation(arr, ave));
    }

    public static double getAverage(int[] a) {
        int sum = 0;
        for (int i : a) sum += i;
        return sum / a.length;
    }

    public static double getStandardDeviation(int[] a, double average) {
        double sd = 0;
        for (int i : a) sd += Math.pow(i - average, 2);
        return sd;
    }
}
