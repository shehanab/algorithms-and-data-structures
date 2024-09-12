package logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void findTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = TwoSum.findTwoSumO2(nums, target);
        int[] result2 = TwoSum.findTwoSum(nums, target);

        assertArrayEquals(new int [] {2, 7}, result);
        assertArrayEquals(new int [] {2, 7}, result2);

    }

}