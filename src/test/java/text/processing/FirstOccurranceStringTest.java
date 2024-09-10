package text.processing;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstOccurranceStringTest {

    @Test
    public void strStr() {
        FirstOccurranceString foc = new FirstOccurranceString();

        assertEquals(0 , foc.strStr("sadbutsad", "sad"));
        assertEquals(-1 , foc.strStr("leetcode", "leeto"));
        assertEquals(4 , foc.strStr("leetcode", "code"));
    }



    @Test
    public void strStrOriginal() {
        FirstOccurranceString foc = new FirstOccurranceString();
        assertEquals(0 , foc.strStrOriginal("sadbutsad", "sad"));
        assertEquals(-1 , foc.strStrOriginal("leetcode", "leeto"));
        assertEquals(4 , foc.strStrOriginal("leetcode", "code"));
    }
}