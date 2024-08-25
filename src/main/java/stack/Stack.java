package stack;

import java.util.EmptyStackException;

public class Stack {

    private Node top;
    private int size = 0;

    public Stack() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node node = new Node(data);
        if (top == null) {
            top = node;
        } else {
            top = node;
            top.setNext(node);
        }
        size += 1;

    }

    public int pop() {
        if (top == null) {
            throw new EmptyStackException();
        }

        int data = top.getData();
        top = top.getNext();
        size -= 1;
        return data;
    }

    public int peek() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.getData();
    }

    public int size() {
        return size;
    }


}
