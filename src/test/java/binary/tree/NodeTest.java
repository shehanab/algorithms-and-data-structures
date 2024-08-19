package binary.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

    Node root = null;

    @Before
    public void setUp() throws Exception {
        root = new Node(5);
    }

    @Test
    public void testInsertImmediateLeft() {
        root.insert(2);
        assertEquals(5, root.getData());
        assertEquals(2, root.getLeft().getData());
        assertNull(root.getRight());
    }

    @Test
    public void testInsertImmediateRight() {
        root.insert(7);
        assertEquals(5, root.getData());
        assertEquals(7, root.getRight().getData());
        assertNull(root.getLeft());
    }


    @Test
    public void testPreOrderTraversal() {
        root.insert(2);
        root.insert(7);
        assertEquals("257", root.getPreOrderTraversalString());
    }



}