package queue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import queue.Queue;

class QueueTest {

    private Queue queue;

    @BeforeEach
    void setUp() {
        queue = new Queue();
    }

    @Test
    void testIsEmptyOnNewQueue() {
        assertTrue(queue.isEmpty(), "Queue should be empty when initialized");
    }

    @Test
    void testEnqueueOnEmptyQueue() {
        queue.enqueue(10);
        assertFalse(queue.isEmpty(), "Queue should not be empty after enqueue");
        assertEquals(10, queue.peek(), "Peek should return the first element enqueued");
    }

    @Test
    void testEnqueueAndDequeueSingleElement() {
        queue.enqueue(20);
        int dequeued = queue.dequeue();
        assertEquals(20, dequeued, "Dequeued element should be the same as the enqueued element");
        assertTrue(queue.isEmpty(), "Queue should be empty after dequeueing the only element");
    }

    @Test
    void testEnqueueAndDequeueMultipleElements() {
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        assertEquals(10, queue.dequeue(), "First dequeued element should be the first enqueued element");
        assertEquals(20, queue.dequeue(), "Second dequeued element should be the second enqueued element");
        assertEquals(30, queue.dequeue(), "Third dequeued element should be the third enqueued element");
        assertTrue(queue.isEmpty(), "Queue should be empty after all elements are dequeued");
    }

    @Test
    void testPeek() {
        queue.enqueue(40);
        queue.enqueue(50);
        assertEquals(40, queue.peek(), "Peek should return the first element enqueued without dequeuing it");
        queue.dequeue();
        assertEquals(50, queue.peek(), "Peek should return the next element after the first is dequeued");
    }

    @Test
    void testDequeueOnEmptyQueue() {
        int dequeued = queue.dequeue();
        assertEquals(-1, dequeued, "Dequeue on an empty queue should return -1");
    }

    @Test
    void testPeekOnEmptyQueue() {
        assertThrows(NullPointerException.class, () -> {
            queue.peek();
        }, "Peek on an empty queue should throw a NullPointerException");
    }

    @Test
    void testQueueAfterDequeueAndEnqueue() {
        queue.enqueue(60);
        queue.enqueue(70);
        queue.dequeue();
        queue.enqueue(80);
        assertEquals(70, queue.peek(), "Peek should return the next element after dequeue");
        assertEquals(70, queue.dequeue(), "Dequeued element should be 70");
        assertEquals(80, queue.dequeue(), "Dequeued element should be 80");
        assertTrue(queue.isEmpty(), "Queue should be empty after all operations");
    }
}