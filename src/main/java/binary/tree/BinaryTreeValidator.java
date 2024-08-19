package binary.tree;

public class BinaryTreeValidator {

    private boolean checkBST(Node root, int min, int max) {
        if (root == null) {
            return true;
        }

        if (min > root.data || max < root.data) {
            return false;
        }

        return checkBST(root.left, min, root.data - 1) && checkBST(root.right, root.data + 1, max);

    }


    public boolean checkBST(Node root) {
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

}
