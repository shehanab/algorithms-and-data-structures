package stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

public class StackTest {

    Stack stack;

    @Before
    public void setUp() throws Exception {
        stack = new Stack();
    }

    @Test
    public void testIsEmpty() {
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void testPush() {
        stack.push(1);
        Assert.assertFalse(stack.isEmpty());
    }

    @Test
    public void testPop() {
        Assert.assertThrows(EmptyStackException.class, () -> stack.pop());
        stack.push(1);
        Assert.assertFalse(stack.isEmpty());
        Assert.assertEquals(1, stack.pop());
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void testPeek() {
        Assert.assertThrows(EmptyStackException.class, () -> stack.peek());
        stack.push(1);
        Assert.assertEquals(1, stack.peek());
    }
}