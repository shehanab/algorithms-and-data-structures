package sliding.window;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSumSubArrayTest {

    MaxSumSubArray maxSumSubArray;

    @Before
    public void setUp() throws Exception {
        maxSumSubArray = new MaxSumSubArray();
    }

    @Test
    public void maxSumSubarray() {
        assertEquals(9, maxSumSubArray.maxSumSubarray(new int[]{2, 1, 5, 1, 3, 2}, 3));
    }
}