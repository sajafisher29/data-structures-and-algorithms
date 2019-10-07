package code401challenges.tree;

// https://www.baeldung.com/java-binary-tree

public class Node {

//    Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.

    //value stored
    int value;
    //left child node
    Node leftChild;
    //right child node
    Node rightChild;

    Node(int value) {
        this.value = value;
        rightChild = null;
        leftChild = null;
    }

}
