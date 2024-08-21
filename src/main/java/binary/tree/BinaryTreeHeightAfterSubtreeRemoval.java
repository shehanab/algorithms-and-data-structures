package binary.tree;

import java.util.HashMap;
import java.util.Map;

public class BinaryTreeHeightAfterSubtreeRemoval {
    private Map<Integer, Integer> maxHeightExcludingSubtree;

    public BinaryTreeHeightAfterSubtreeRemoval() {
        this.maxHeightExcludingSubtree = new HashMap<>();
    }

    public int calculateSubtreeHeights(Node node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = calculateSubtreeHeights(node.left);
        int rightHeight = calculateSubtreeHeights(node.right);
        node.height = 1 + Math.max(leftHeight, rightHeight);
        return node.height;
    }

    public void calculateMaxHeightExcludingSubtree(Node node, int maxHeightExcludingParent) {
        if (node == null) {
            return;
        }

        // Calculate maximum height excluding the current node's subtree
        if (node.left != null) {
            maxHeightExcludingSubtree.put(node.left.data, Math.max(maxHeightExcludingParent, node.right != null ? node.right.height : 0) + 1);
        }
        if (node.right != null) {
            maxHeightExcludingSubtree.put(node.right.data, Math.max(maxHeightExcludingParent, node.left != null ? node.left.height : 0) + 1);
        }

        // Recur for children
        calculateMaxHeightExcludingSubtree(node.left, maxHeightExcludingSubtree.getOrDefault(node.data, 0));
        calculateMaxHeightExcludingSubtree(node.right, maxHeightExcludingSubtree.getOrDefault(node.data, 0));
    }

    public int[] heightAfterSubtreeRemoval(Node root, int[] queries) {
        if (root == null) {
            return new int[0];
        }

        // Step 1: Compute heights of all nodes
        calculateSubtreeHeights(root);

        // Step 2: Compute maximum heights excluding the subtree rooted at each node
        maxHeightExcludingSubtree.put(root.data, 0);
        calculateMaxHeightExcludingSubtree(root, 0);

        // Step 3: Answer the queries
        int[] results = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            results[i] = maxHeightExcludingSubtree.getOrDefault(queries[i], 0);
        }

        return results;
    }

    public static void main(String[] args) {
        // Constructing a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        // Queries
        int[] queries = {2, 3, 4};

        // Solution instance
        BinaryTreeHeightAfterSubtreeRemoval solution = new BinaryTreeHeightAfterSubtreeRemoval();
        int[] result = solution.heightAfterSubtreeRemoval(root, queries);

        // Output results
        for (int height : result) {
            System.out.println(height);  // Outputs the height of the tree after each query's subtree removal
        }
    }
}