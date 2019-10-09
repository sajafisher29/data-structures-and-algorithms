package code401challenges.tree;

// https://www.baeldung.com/java-binary-tree

public class Node<T> {

//    Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.

    //value stored
    T value;
    //left child node
    Node leftChild;
    //right child node
    Node rightChild;

    public Node(T value) {
        this.value = value;
        rightChild = null;
        leftChild = null;
    }

    public Node(T value, Node rightChild, Node leftChild) {
        this.value = value;
        this.rightChild = rightChild;
        this.leftChild = leftChild;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<T> left) {
        this.leftChild = leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<T> right) {
        this.rightChild = rightChild;
    }

    @Override public String toString() {
        return String.format("%d", this.value);
    }
}
