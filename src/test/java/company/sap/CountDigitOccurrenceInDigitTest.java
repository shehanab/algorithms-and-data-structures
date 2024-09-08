package company.sap;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountDigitOccurrenceInDigitTest {



    @Test
    public void countDigitOccurrences1() {
        CountDigitOccurrenceInDigit countDigitOccurrenceInDigit = new CountDigitOccurrenceInDigit();
        assertEquals(3, countDigitOccurrenceInDigit.countDigitOccurrences1(214215421, 2));
    }

    @Test
    public void countOccurrences2() {
        CountDigitOccurrenceInDigit countDigitOccurrenceInDigit = new CountDigitOccurrenceInDigit();
        assertEquals(3, countDigitOccurrenceInDigit.countOccurrences2(214215421, 2));
    }

    @Test
    public void countOccurrences3() {
        CountDigitOccurrenceInDigit countDigitOccurrenceInDigit = new CountDigitOccurrenceInDigit();
//        assertEquals(3, countDigitOccurrenceInDigit.countOccurrences3(214215421, 2));
    }
}