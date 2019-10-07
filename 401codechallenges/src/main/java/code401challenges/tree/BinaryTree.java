package code401challenges.tree;

// https://www.baeldung.com/java-binary-tree

public class BinaryTree {

    // Creates the root Node of the tree
    Node root;

// Define a method for each of the depth first traversals called preOrder, inOrder, and postOrder which returns an array of the values, ordered appropriately.

    //method preOrder returns ordered array
    public void preOrder() {
        this.preOrder(this.root);
    }

    private void preOrder(Node node) {
        if (node != null) {
            preOrder(node.leftChild);
            preOrder(node.rightChild);
        }
    }

    //method inOrder returns ordered array
    public void inOrder() {
        this.inOrder(this.root);
    }

    private void inOrder(Node node) {
        if (node != null) {
            inOrder(node.leftChild);
            inOrder(node.rightChild);
        }
    }

    //method postOrder returns ordered array
    public void postOrder() {
        this.postOrder(this.root);
    }

    private void postOrder(Node node) {
        if (node != null) {
            postOrder(node.leftChild);
            postOrder(node.rightChild);
        }
    }
}

// Any exceptions or errors that come from your code should be semantic, capturable errors. For example, rather than a default error thrown by your language, your code should raise/throw a custom, semantic error that describes what went wrong in calling the methods you wrote for this lab.