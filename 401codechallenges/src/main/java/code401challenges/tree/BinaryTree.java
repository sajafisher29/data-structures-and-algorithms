package code401challenges.tree;

// https://www.baeldung.com/java-binary-tree

import java.util.ArrayList;

public class BinaryTree<T> {

    // Creates the root Node of the tree
    Node<T> root;

    public BinaryTree(T value) {
        this.root = new Node(value);
    }

    public BinaryTree() {
        this.root = null;
    }

// Define a method for each of the depth first traversals called preOrder, inOrder, and postOrder which returns an array of the values, ordered appropriately.

    // Method preOrder returns ordered array
    public ArrayList<T> preOrder() {
        ArrayList<T> values = new ArrayList<>();
        return preOrder(this.root, values);
    }

    // Helper method for preOrder traversal
    private ArrayList<T> preOrder(Node currentNode, ArrayList<T> values) {
        if (currentNode == null) {
            return values;
        }
        values.add((T)currentNode.value);
        values = preOrder(currentNode.leftChild, values);
        values = preOrder(currentNode.rightChild, values);
        return values;
    }

    // Method inOrder returns ordered array
    public ArrayList<T> inOrder() {
        ArrayList<T> values = new ArrayList<>();
        return inOrder(this.root, values);
    }

    // Helper method for inOrder traversal
    private ArrayList<T> inOrder(Node currentNode, ArrayList<T> values) {
        if (currentNode == null) {
            return values;
        }
        values = inOrder(currentNode.leftChild, values);
        values.add((T)currentNode.value);
        values = inOrder(currentNode.rightChild, values);
        return values;
    }

    // Method postOrder returns ordered array
    public ArrayList<T> postOrder() {
        ArrayList<T> values = new ArrayList<>();
        return postOrder(this.root, values);
    }

    // Helper method for post-order traversal
    private ArrayList<T> postOrder(Node currentNode, ArrayList<T> values) {
        if (currentNode == null) {
            return values;
        }

        values = postOrder(currentNode.leftChild, values);
        values = postOrder(currentNode.rightChild, values);
        values.add((T)currentNode.value);
        return values;
    }

    // Add new value to binary tree and inserting the node in an empty spot
    public void add(T value) {
        this.root = add(this.root, value);
    }

    // Helper method to add new value to binary tree using recursion
    private Node add(Node currentNode, T value) {

        if (currentNode == null) {
            currentNode = new Node(value);
            return currentNode;
        }

        double randomNum = Math.random();

        if (randomNum >= 0.5) {
            currentNode.rightChild = add(currentNode.rightChild, value);
        } else {
            currentNode.leftChild = add(currentNode.leftChild, value);
        }
        return currentNode;
    }
}

// Any exceptions or errors that come from your code should be semantic, capturable errors. For example, rather than a default error thrown by your language, your code should raise/throw a custom, semantic error that describes what went wrong in calling the methods you wrote for this lab.