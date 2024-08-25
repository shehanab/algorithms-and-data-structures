package queue;

public class Queue {
    private Node head;
    private Node tail;


    public Queue() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }


    public void enqueue(int data) {
        Node node = new Node(data);
        if (tail != null) {
            tail.setNext(node);
        }
        tail = node;
        if (head == null) {
            head = node;
        }

    }


    public int dequeue() {
        if (isEmpty()) {
            return -1;
        }

        int data = head.getData();
        head = head.getNext();

        if (head == null) {
            tail = null;
        }

        return data;
    }

    public int peek() {
        return head.getData();
    }



    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
}
