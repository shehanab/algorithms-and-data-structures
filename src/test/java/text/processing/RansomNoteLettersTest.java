package text.processing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RansomNoteLettersTest {

    RansomNoteLetters ransomNoteLetters;

    @Before
    public void setUp() throws Exception {
        ransomNoteLetters = new RansomNoteLetters();
    }

    @Test
    public void canConstruct() {
        assertFalse(ransomNoteLetters.canConstruct("a", "b"));
        assertFalse(ransomNoteLetters.canConstruct("aa", "ab"));
        assertTrue(ransomNoteLetters.canConstruct("aa", "aab"));
    }
}