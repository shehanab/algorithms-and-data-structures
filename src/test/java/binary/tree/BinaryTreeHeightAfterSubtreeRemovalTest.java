package binary.tree;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BinaryTreeHeightAfterSubtreeRemovalTest {

    @Test
    public void testSingleNodeTree() {
        Node root = new Node(1);
        BinaryTreeHeightAfterSubtreeRemoval solution = new BinaryTreeHeightAfterSubtreeRemoval();
        int[] queries = {1};
        int[] expected = {0};
        assertArrayEquals(expected, solution.heightAfterSubtreeRemoval(root, queries));
    }

    @Test
    public void testSimpleBalancedTree() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        BinaryTreeHeightAfterSubtreeRemoval solution = new BinaryTreeHeightAfterSubtreeRemoval();
        int[] queries = {2, 3};
        int[] expected = {1, 1};
        assertArrayEquals(expected, solution.heightAfterSubtreeRemoval(root, queries));
    }

    @Test
    public void testUnbalancedTree() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        BinaryTreeHeightAfterSubtreeRemoval solution = new BinaryTreeHeightAfterSubtreeRemoval();
        int[] queries = {2, 4};
        int[] expected = {1, 2};
        assertArrayEquals(expected, solution.heightAfterSubtreeRemoval(root, queries));
    }

    // Add more test cases here following the same pattern

}