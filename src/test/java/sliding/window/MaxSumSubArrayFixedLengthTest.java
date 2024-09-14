package sliding.window;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSumSubArrayFixedLengthTest {

    MaxSumSubArrayFixedLength maxSumSubArrayFixedLength;

    @Before
    public void setUp() throws Exception {
        maxSumSubArrayFixedLength = new MaxSumSubArrayFixedLength();
    }

    @Test
    public void maxSumSubarray() {
        assertEquals(9, maxSumSubArrayFixedLength.maxSumSubarray(new int[]{2, 1, 5, 1, 3, 2}, 3));
    }
}