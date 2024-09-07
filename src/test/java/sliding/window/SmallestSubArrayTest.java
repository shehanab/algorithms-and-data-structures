package sliding.window;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SmallestSubArrayTest {

    private SmallestSubArray smallestSubArray;

    @Before
    public void setUp() throws Exception {
        smallestSubArray = new SmallestSubArray();

    }

    @Test
    public void minSubArrayLen() {
        assertEquals(1, smallestSubArray.minSubArrayLen(7, new int[]{1, 3, -1, -3, 5, 3, 6, 7}));
        assertEquals(2, smallestSubArray.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }
}