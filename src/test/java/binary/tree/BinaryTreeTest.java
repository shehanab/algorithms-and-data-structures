package binary.tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {

    @Test
    public void testInsertNode() {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);

        Node root = tree.getRoot();
        assertNotNull(root);
        assertEquals(5, root.data);
        assertEquals(3, root.left.data);
        assertEquals(7, root.right.data);
    }

    @Test
    public void testSearchNodeFound() {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);

        Node result = tree.search(7);
        assertNotNull(result);
        assertEquals(7, result.data);
    }

    @Test
    public void testSearchNodeNotFound() {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);

        Node result = tree.search(10);
        assertNull(result);
    }

    @Test
    public void testInOrderTraversal() {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);

        List<Integer> traversal = tree.inOrderTraversal();
        assertArrayEquals(new Integer[]{2, 3, 4, 5, 7}, traversal.toArray(new Integer[0]));
    }
}