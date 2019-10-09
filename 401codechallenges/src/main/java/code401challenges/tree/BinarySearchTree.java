package code401challenges.tree;

// https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/

public class BinarySearchTree<T extends Comparable<T> >{

// Define a method named add that accepts a value, and adds a new node with that value in the correct location in the binary search tree.

    // Creates the root Node of the tree
    Node<T> root;
    private Node<T> current;
    private T value;

    public BinarySearchTree(T value) {
        this.root = new Node(value);
    }

    public BinarySearchTree() {
        this.root = null;
    }

    // Recursion method to insert new nodes to create a sorted tree
    private Node addRecursively (Node<T> current, T value) {

        // When current is null, a leaf node has been reached, insert new Node in that position
        if (current == null) {
            return new Node<T>(value);
        }

        // If the new node's value is lower than the current node's, move to the leftChild
        if (value.compareTo(current.value) < 0) {
            current.leftChild = addRecursively(current.leftChild, value);
        } else if (value.compareTo(current.value) > 0) { // If the new node's value is lower than the current node's, move to the rightChild
            current.rightChild = addRecursively(current.rightChild, value);
        } else {
            // the value already exists
            return current;
        }
        return current;
    }

    // Start recursion from the root node
    public void add (T value) {
        root = addRecursively(root, value);
    }

// Define a method named contains that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.

    public boolean contains (Node<T> current, T value) {
        this.current = current;
        this.value = value;
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return (value.compareTo(current.value) < 0)
                ? contains(current.leftChild, value)
                : contains(current.rightChild, value);
    }

    public boolean containsValue (T value) {
        return contains(root, value);
    }

}
