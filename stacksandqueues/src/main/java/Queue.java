public class Queue {

// Create a Queue class that has a front property. It creates an empty Queue when instantiated.
    Node front;
    Node rear;

// This object should be aware of a default empty value assigned to front when the queue is created.
    public Queue() {
    this.front = null;
}

// Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
    public void enqueue(int newNodeValue) {
        Node newNode = new Node(newNodeValue, rear);
        rear.next = newNode;
        rear = newNode;
    }

// Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.
    Node dequeue() {
        Node dequeued = front;
        Node temp = front;
        peek();
        if (front == null) {
            System.out.println("The queue is empty.");
        } else {
            front = front.next;
            System.out.println("Returning node from front of the queue with a value of " + front + ".");
            temp.next = null;
            dequeued = temp;
        }
        return dequeued;
    }

// Define a method called peek that does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.
    Node peek() {
        System.out.println("Viewing the front of the queue which has a current value of: " + front + ".");
        return front;
    }

//At no time should an exception or stack trace be shown to the end user. Catch and handle any such exceptions and return a printed value or operation which cleanly represents the state and either stops execution cleanly, or provides the user with clear direction and output.

}
