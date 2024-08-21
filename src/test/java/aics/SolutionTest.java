package aics;

import company.aics.Solution;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testCalculateMaxSubArraySum() {
        int[] nums = {-2, 1, -3, 4};

        Solution solution = new Solution();

        assertEquals(4, solution.calculateMaxSubArraySum(nums));

    }

    @Test
    public void testCalculateMaxSubArraySum3() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        Solution solution = new Solution();

        assertEquals(6, solution.calculateMaxSubArraySum(nums));

    }

    @Test
    public void testCalculateMaxSubArraySum2() {
        int[] nums = {-2, 1, -3, 4};

        Solution solution = new Solution();

        assertEquals(4, solution.calculateMaxSubArraySum(nums));

    }
}