package code401challenges.stacksandqueues.src.main.java;

import java.util.NoSuchElementException;

// Refactored with Michelle's code review suggestions

public class PseudoQueue<T> {

    // Create a PseudoQueue class
    private Stack<T> enStack = new Stack<>();
    private Stack<T> deStack = new Stack<>();

    // This object should be aware of a default empty value assigned to front when the queue is created.

    // Method enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
    // Enqueue will always add the value to the top of stack1

    public void enqueue(T value) {
        this.enStack.push(value);
        }

    // Method dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.
    // Dequeue will always returns the top of stack2

    public T dequeue() {
    // If the deStack is empty, flip the enStack into deStack
        if (this.deStack.top == null) {
            while (this.enStack.top != null) {
                this.deStack.push(this.enStack.pop());
            }
            // If there is still nothing on the deStack
            if (this.deStack.top == null) {
                throw new NoSuchElementException();
            }
        }
        // There is now values in deStack that we can pop and return
        return this.deStack.pop();
    }
}