package linkedlist;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public LinkedList(Node head) {
        this.head = head;
    }

    public void prepend(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            node.setNext(head);
            head = node;
        }
    }

    public void append(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
    }

    public void insertBefore(Node node, int data) {

    }

    public void insertAfter(Node node, int data) {

    }

    public void remove(int data) {
        if (head == null) {
            return;
        }

        if (head.getData() == data) {
            head = head.getNext();
        } else {
            Node current = head;
            while (current.getNext() != null) {
                if (current.getNext().getData() == data) {
                    current.setNext(current.getNext().getNext());
                    return;
                }
                current = current.getNext();
            }
        }
    }

    public void reverse() {}


    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}
