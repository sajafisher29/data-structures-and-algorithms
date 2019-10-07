package code401challenges.tree;

// https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/

public class BinarySearchTree {

// Define a method named add that accepts a value, and adds a new node with that value in the correct location in the binary search tree.

    // Creates the root Node of the tree
    Node root;

    // Recursion method to insert new nodes to create a sorted tree
    private Node addRecursively (Node current, int value) {

        // When current is null, a leaf node has been reached, insert new Node in that position
        if (current == null) {
            return new Node(value);
        }

        // If the new node's value is lower than the current node's, move to the leftChild
        if (value < current.value) {
            current.leftChild = addRecursively(current.leftChild, value);
        } else if (value > current.value) { // If the new node's value is lower than the current node's, move to the rightChild
            current.rightChild = addRecursively(current.rightChild, value);
        } else {
            // the value already exists
            return current;
        }
        return current;
    }

    // Start recursion from the root node
    public void add (int value) {
        root = addRecursively(root, value);
    }

// Define a method named contains that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.

    private boolean containsRecursive (Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? containsRecursive(current.leftChild, value)
                : containsRecursive(current.rightChild, value);
    }

    public boolean containsValue (int value) {
        return containsRecursive(root, value);
    }

}
