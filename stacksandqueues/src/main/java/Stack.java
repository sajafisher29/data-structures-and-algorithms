import java.util.EmptyStackException;

public class Stack {

    // Referenced: https://www.geeksforgeeks.org/stack-class-in-java/

// Create a Stack class that has a top property. It creates an empty Stack when instantiated.
    Node top;

// This object should be aware of a default empty value assigned to top when the stack is created.
    public Stack() {
        this.top = null;
    }

// Define a method called push which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.
    public void push(int value) {
        Node newNode = new Node(value);

        if (this.top == null) {
            this.top = newNode;
        } else {
            this.top.next = newNode;
            this.top = this.top.next;
            System.out.println("Inserting " + newNode + " onto stack.");
        }
    }

// Define a method called pop that does not take any argument, removes the node from the top of the stack, and returns the node’s value.
    int pop() {
        Node temp = top;
        peek();
        if (top == null) {
            System.out.println("The stack is empty.");
        } else {
            top = top.next;
            System.out.println("Returning node from top of the stack with a value of " + top + ".");
            temp.next = null;
        }
        return temp.value;
    }

// Define a method called peek that does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.
    public int peek() {
        if (this.top == null) {
            throw new EmptyStackException();
        } else {
            System.out.println("Viewing the top of the stack which has a current value of: " + top + ".");
            return this.top.value;
        }
    }

//At no time should an exception or stack trace be shown to the end user. Catch and handle any such exceptions and return a printed value or operation which cleanly represents the state and either stops execution cleanly, or provides the user with clear direction and output.

}
