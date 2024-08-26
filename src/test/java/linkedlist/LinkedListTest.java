package linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class LinkedListTest {
    private LinkedList linkedList;

    @Before
    public void setUp() throws Exception {
        linkedList = new LinkedList();
    }

    @Test
    public void testPrependToEmptyList() {
        linkedList.prepend(10);
        assertEquals(10, linkedList.getHead().getData());
    }

    @Test
    public void testPrependToNonEmptyList() {
        linkedList.prepend(10);
        linkedList.prepend(20);
        assertEquals(20, linkedList.getHead().getData());
        assertEquals(10, linkedList.getHead().getNext().getData());
    }

    @Test
    public void  testAppendToEmptyList() {
        linkedList.append(10);
        assertEquals(10, linkedList.getHead().getData());
    }

    @Test
    public void testAppendToNonEmptyList() {
        linkedList.append(10);
        linkedList.append(20);
        assertEquals(10, linkedList.getHead().getData());
        assertEquals(20, linkedList.getHead().getNext().getData());
    }

    @Test
    public void insertBefore() {
    }

    @Test
    public void insertAfter() {
    }

    @Test
    public void testRemove() {

        linkedList.append(10);
        linkedList.append(60);
        linkedList.append(20);
        linkedList.append(30);
        linkedList.append(40);
        linkedList.append(50);


        assertEquals(20, linkedList.getHead().getNext().getNext().getData());
        linkedList.remove(20);
//        assertNotEquals(20, linkedList.getHead().getNext().getNext().getData());
    }

    @Test
    public void reverse() {
    }
}