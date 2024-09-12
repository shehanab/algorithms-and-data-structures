package logic;

import org.junit.Test;
import sliding.window.LongestDistinctCharString;

import static org.junit.Assert.*;

public class LongestDistinctCharStringTest {

    @Test
    public void lengthOfLongestSubstring() {

        assertEquals(4, LongestDistinctCharString.lengthOfLongestSubstring("shehan"));
        assertEquals(3, LongestDistinctCharString.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(0, LongestDistinctCharString.lengthOfLongestSubstring(""));
        assertEquals(8, LongestDistinctCharString.lengthOfLongestSubstring("abcdsfgw"));
        assertEquals(1, LongestDistinctCharString.lengthOfLongestSubstring("aaaaaaaa"));
    }
}