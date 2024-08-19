package binary.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private Node insertRecursive(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (data < node.data) {
            node.left = insertRecursive(node.left, data);
        } else if (data > node.data) {
            node.right = insertRecursive(node.right, data);
        }

        return node;
    }

    public Node search(int data) {
        return searchRecursive(root, data);
    }

    private Node searchRecursive(Node node, int data) {
        if (node == null || node.data == data) {
            return node;
        }

        if (data < node.data) {
            return searchRecursive(node.left, data);
        }

        return searchRecursive(node.right, data);
    }

    public List<Integer> inOrderTraversal() {
        List<Integer> traversal = new ArrayList<>();
        inOrderTraversalRecursive(root, traversal);
        return traversal;
    }

    private void inOrderTraversalRecursive(Node node, List<Integer> traversal) {
        if (node != null) {
            inOrderTraversalRecursive(node.left, traversal);
            traversal.add(node.data);
            inOrderTraversalRecursive(node.right, traversal);
        }
    }
}