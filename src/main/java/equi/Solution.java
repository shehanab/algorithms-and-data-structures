package equi;

/**
 * Created by Shehan on 5/17/16.
 * <p>
 * YOu are good with logics than you think so be confident
 */
public class Solution {
    public static void main(String[] args) {

        int[] arrr = {1, 2, 3};

    }

    int equi(int A[], int n) {
        int k, m, lsum, rsum;
        for (k = 0; k < n; ++k) {
            lsum = 0;
            rsum = 0;
            for (m = 0; m < k; ++m) lsum += A[m];
            for (m = k + 1; m < n; ++m) rsum += A[m];
            if (lsum == rsum) return k;
        }
        return -1;
    }

    int equi2(int arr[], int n) {
        if (n == 0) return -1;
        long sum = 0;
        int i;
        for (i = 0; i < n; i++) sum += (long) arr[i];
//        int sum = IntStream.of(arr).sum();

        long sum_left = 0;
        for (i = 0; i < n; i++) {
            long sum_right = sum - sum_left - (long) arr[i];
            if (sum_left == sum_right) return i;
            sum_left += (long) arr[i];
        }
        return -1;
    }


    //http://blog.codility.com/2011/03/solutions-for-task-equi.html

}
