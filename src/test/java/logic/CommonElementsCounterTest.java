package logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommonElementsCounterTest {

    @Test
    public void countCommonElements() {
        int[] arr1 = {1, 3, 4, 6, 7, 9};
        int[] arr2 = {1, 2, 4, 5, 9, 10};

        assertEquals(3, CommonElementsCounter.countCommonElements(arr1, arr2));
    }

    @Test
    public void testNoCommonElements() {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        assertEquals(0, CommonElementsCounter.countCommonElements(arr1, arr2));
    }

    @Test
    public void testAllCommonElements() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        assertEquals(3, CommonElementsCounter.countCommonElements(arr1, arr2));
    }

    @Test
    public void testOneArrayIsEmpty() {
        int[] arr1 = {};
        int[] arr2 = {1, 2, 3};

        assertEquals(0, CommonElementsCounter.countCommonElements(arr1, arr2));
    }

    @Test
    public void testBothArraysAreEmpty() {
        int[] arr1 = {};
        int[] arr2 = {};

        assertEquals(0, CommonElementsCounter.countCommonElements(arr1, arr2));
    }

    @Test
    public void testOneElementInCommon() {
        int[] arr1 = {1, 5, 7, 9};
        int[] arr2 = {2, 4, 7, 10};

        assertEquals(1, CommonElementsCounter.countCommonElements(arr1, arr2));
    }

    @Test
    public void testArraysWithDifferentSizes() {
        int[] arr1 = {1, 3, 5, 7, 9, 11};
        int[] arr2 = {2, 3, 4, 5, 6};

        assertEquals(2, CommonElementsCounter.countCommonElements(arr1, arr2));
    }

    @Test
    public void testArraysWithNegativeNumbers() {
        int[] arr1 = {-5, -3, 0, 2, 4};
        int[] arr2 = {-7, -3, 2, 8};

        assertEquals(2, CommonElementsCounter.countCommonElements(arr1, arr2));
    }

    @Test
    public void testSingleElementArraysCommon() {
        int[] arr1 = {5};
        int[] arr2 = {5};

        assertEquals(1, CommonElementsCounter.countCommonElements(arr1, arr2));
    }

    @Test
    public void testSingleElementArraysNoCommon() {
        int[] arr1 = {3};
        int[] arr2 = {5};

        assertEquals(0, CommonElementsCounter.countCommonElements(arr1, arr2));
    }
}
