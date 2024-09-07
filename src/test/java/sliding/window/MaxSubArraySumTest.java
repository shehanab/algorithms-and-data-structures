package sliding.window;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSubArraySumTest {

    MaxSubArraySum solution = new MaxSubArraySum();

    @Before
    public void setUp() throws Exception {
        solution = new MaxSubArraySum();
    }

    @Test
    public void testCalculateMaxSubArraySum() {
        int[] nums = {-2, 1, -3, 4};



        assertEquals(4, solution.calculateMaxSubArraySumBruteForce(nums));
        assertEquals(4, solution.maxSubArraySum(nums));

    }

    @Test
    public void testCalculateMaxSubArraySum3() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, solution.calculateMaxSubArraySumBruteForce(nums));
        assertEquals(6, solution.maxSubArraySum(nums));

    }

    @Test
    public void testCalculateMaxSubArraySum2() {
        int[] nums = {-2, 1, -3, 4};
        assertEquals(4, solution.calculateMaxSubArraySumBruteForce(nums));
        assertEquals(4, solution.maxSubArraySum(nums));

    }
}