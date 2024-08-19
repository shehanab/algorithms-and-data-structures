package binary.tree;

public class Node {
    Node right;
    Node left;
    int data;

    public Node(int data) {
        this.data = data;
    }

    public void insert(int data) {
        if (data > 0) {
            if (data <= this.data) {
                if (left == null) {
                    left = new Node(data);
                } else {
                    left.insert(data);
                }
            } else {
                if (right == null) {
                    right = new Node(data);
                } else {
                    right.insert(data);
                }
            }
        }
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public int getData() {
        return data;
    }


    public String getPreOrderTraversalString() {
        StringBuilder sb = new StringBuilder();
        if (left != null) {
            sb.append(left.data);
        }
        sb.append(this.data);
        if (right != null) {
            sb.append(right.data);
        }

        return sb.toString();
    }
}
