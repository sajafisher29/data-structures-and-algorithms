package code401challenges.tree;

// https://www.baeldung.com/java-binary-tree

import code401challenges.stacksandqueues.Queue;

import java.util.ArrayList;

public class BinaryTree<T> {

    // Creates the root Node of the tree
    Node<T> root;

    public BinaryTree(T value) {
        this.root = new Node<>(value);
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
        values.add((T) currentNode.value);
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
        values.add((T) currentNode.value);
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
        values.add((T) currentNode.value);
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

    // Write a breadth first traversal method which takes a Binary Tree as its unique input. Without utilizing any of the built-in methods available to your language, traverse the input tree using a Breadth-first approach; print every visited node’s value.
    public void breadthFirstTraversal() {
        Queue<Node> treeNodeQueue = new Queue<Node>();

        if (root != null) {
            treeNodeQueue.enqueue(root);
        } else {
            System.out.println("Empty tree");
        }

        while (!treeNodeQueue.isEmpty()) {
            Node holdForChildren = treeNodeQueue.dequeue();
            System.out.println(holdForChildren.value);
            if (holdForChildren.leftChild != null) {
                treeNodeQueue.enqueue(holdForChildren.leftChild);
            }
            if (holdForChildren.rightChild != null) {
                treeNodeQueue.enqueue(holdForChildren.rightChild);
            }
        }
    }

    // Write an instance method called find-maximum-value. Without utilizing any of the built-in methods available to your language, return the maximum value stored in the tree. You can assume that the values stored in the Binary Tree will be numeric.

    public int findMaximumValue() {
        Node<Integer> maxValue = null;
        if (root == null) {
            System.out.println("This is an empty tree. There is no maximum value.");
        } else {
            Queue<Node> treeNodeQueue = new Queue<>();
            maxValue = (Node<Integer>) root;
            treeNodeQueue.enqueue(root);
            while (treeNodeQueue.front != null) {
                Node<Integer> temp;
                temp = treeNodeQueue.dequeue();
                if (temp.getValue() > maxValue.getValue()) {
                    maxValue = temp;
                }
                if (temp.getLeftChild() != null) {
                    treeNodeQueue.enqueue(temp.getLeftChild());
                }
                if (temp.getRightChild() != null) {
                    treeNodeQueue.enqueue(temp.getRightChild());
                }
            }
        }
        assert maxValue != null;
        return maxValue.getValue();
    }
}

// Any exceptions or errors that come from your code should be semantic, capturable errors. For example, rather than a default error thrown by your language, your code should raise/throw a custom, semantic error that describes what went wrong in calling the methods you wrote for this lab.