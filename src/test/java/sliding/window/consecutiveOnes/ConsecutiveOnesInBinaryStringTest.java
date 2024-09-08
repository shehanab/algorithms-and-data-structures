package sliding.window.consecutiveOnes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveOnesInBinaryStringTest {

    ConsecutiveOnesInBinaryString consecutiveOnesInBinaryString;

    @Before
    public void setUp() throws Exception {
        consecutiveOnesInBinaryString = new ConsecutiveOnesInBinaryString();

    }

    @Test
    public void longSubseg() {
        assertEquals(3, consecutiveOnesInBinaryString.longSubseg("1010101", 1));
        assertEquals(1, consecutiveOnesInBinaryString.longSubseg("101011100", 2));
        assertEquals(1, consecutiveOnesInBinaryString.longSubseg("01010", 3));
        assertEquals(2, consecutiveOnesInBinaryString.longSubseg("11011011", 1));
    }



}