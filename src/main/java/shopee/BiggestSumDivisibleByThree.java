package shopee;


/**
 * Given an array nums of integers, we need to find the maximum possible sum of elements of the array such that it is divisible by three.
 */
public class BiggestSumDivisibleByThree {

    public static void main(String[] args) {
        int[] input1 = {3, 6, 5, 1, 8};
        int[] input2 = {4};
        int[] input3 = {1, 2, 3, 4, 4};

        System.out.println(maxSumDivThree(input1));
        System.out.println(maxSumDivThree(input2));
        System.out.println(maxSumDivThree(input3));

    }


    /**
     * Add all together, if sum%3==0, return sum.
     * if sum%3==1, remove the smallest number which has n%3==1.
     * if sum%3==2, remove the smallest number which has n%3==2.
     *
     * one pass, and we need to keep the smallest two numbers that have n1%3==1 and n2%3==2.
     * @param nums
     * @return
     */
    public static int maxSumDivThree(int[] nums) {
        int res = 0, leftOne = 20000, leftTwo = 20000;
        for (int n : nums) {
            res += n;
            if (n % 3 == 1) {
                leftTwo = Math.min(leftTwo, leftOne + n);
                leftOne = Math.min(leftOne, n);
            }
            if (n % 3 == 2) {
                leftOne = Math.min(leftOne, leftTwo + n);
                leftTwo = Math.min(leftTwo, n);
            }
        }
        if (res % 3 == 0) return res;
        if (res % 3 == 1) return res - leftOne;
        return res - leftTwo;

}


}
