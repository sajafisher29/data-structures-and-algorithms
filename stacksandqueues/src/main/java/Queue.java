import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.StringJoiner;

public class Queue {

// Create a Queue class that has a front property. It creates an empty Queue when instantiated.
    Node front;
    Node rear;

// This object should be aware of a default empty value assigned to front when the queue is created.
    public Queue() { this.front = null; this.rear = null; }

// Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
    public void enqueue(int value) {
        Node newNode = new Node(value);

        if (this.rear == null) {
            this.front = this.rear = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = this.rear.next;
        }
    }

// Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.
    int dequeue() {
        int dequeued = 0;
        Node temp = null;
        peek();
        if (front == null) {
            throw new NoSuchElementException();
        } else {
            front = front.next;
            System.out.println("Returning node from front of the queue with a value of " + front + ".");
            temp.next = null;
            dequeued = temp.value;
        }
        return dequeued;
    }

// Define a method called peek that does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.
    public int peek() {
        if (this.front == null) {
            throw new NoSuchElementException();
        } else {
            System.out.println("Viewing the front of the queue which has a current value of: " + front + ".");
            return this.front.value;
        }
    }

//Writing a toString method to read the queue
    @Override public String toString() {
        StringJoiner queueToString = new StringJoiner(" ");
        queueToString.add("Queue contains:");
        Node currentNode = this.front;

        //Read the queue
        while (currentNode.next != null) {
            queueToString.add("" + currentNode.value);
            currentNode = currentNode.next;
        }
        return queueToString.toString();
    }

//At no time should an exception or stack trace be shown to the end user. Catch and handle any such exceptions and return a printed value or operation which cleanly represents the state and either stops execution cleanly, or provides the user with clear direction and output.

}
