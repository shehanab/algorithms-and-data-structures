package stack;

public class Queue {

    Stack stack1;
    Stack stack2;

    public Queue() {
        stack1 = new Stack();
        stack2 = new Stack();
    }

    public void enqueue(int x) {
        stack1.push(x);
    }

    // Dequeue operation
    public int dequeue() {
        // If both stacks are empty, then the queue is empty
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // Return an invalid value or throw an exception as needed
        }

        // If stack2 is empty, move all elements from stack1 to stack2
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        // Return the top item from stack2
        return stack2.pop();
    }


}
