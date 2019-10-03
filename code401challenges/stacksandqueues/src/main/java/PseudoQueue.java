import java.util.NoSuchElementException;

public class PseudoQueue {

    // Create a PseudoQueue class
    private Stack stack1 = new Stack();
    private Stack stack2 = new Stack();

    // This object should be aware of a default empty value assigned to front when the queue is created.

    // Method enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
    // Enqueue will always add the value to the top of stack1

    public void enqueue(int value) {

        //Stack2.pop() and Stack1.push() until Stack2 is empty
        while (this.stack2.top != null) {
            this.stack1.push(this.stack2.pop());
        }
        // Add the node to the top of stack1
        this.stack1.push(value);
        }
    }

    // Method dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.
    // Dequeue will always returns the top of stack2

    public int dequeue() {
        int dequeued = 0;
        if (this.stack2.top != null) {
            // If stack2 is holding the values pop from the stack
            dequeued = this.stack2.pop();
        } else if (this.stack1.top != null) {
            // If there are values in stack1 flip the stacks
            while (this.stack1.top != null) {
                int temp = 0;
                // Move stack1.top to stack2
                this.stack1.peek();
                temp = this.stack1.pop();
                this.stack2.push(temp);
            }
            dequeued = this.stack2.pop();
        } else {
            throw new NoSuchElementException();
        }
        return dequeued;
    }
}
