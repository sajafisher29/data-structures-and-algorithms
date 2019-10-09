package code401challenges.tree;

import org.junit.Before;
import org.junit.Test;

import static code401challenges.tree.BinaryTree.*;
import static org.junit.Assert.*;

public class BinaryTreeTest {

    BinaryTree testTree;

    @Before
    public void setup () {
        testTree = new BinaryTree();
        testTree.add(4);
        testTree.add(9);
        testTree.add(-219);
    }

    // Can return correct array for inOrder traversal
    @Test public void testTraverseInOrder() {
        assertEquals("The linked list should be 4 9 -219",
                "[9, 4, -219]",
                testTree.inOrder().toString());
    }

    // Can return correct array for preOrder traversal
    @Test public void testTraversePreOrder() {
        assertEquals("The linked list should be 4 9 -219",
                "[4, 9, -219]",
                testTree.preOrder().toString());
    }

    // Can return correct array for postOrder traversal
    @Test public void testTraversePostOrder() {
        assertEquals("The linked list should be 4 9 -219",
                "[9, -219, 4]",
                testTree.postOrder().toString());
    }

    // Can return the correct print out of values for breadth first traversal
    @Test public void testBreadthFirstTraversal(BinaryTree testTree) {
        assertEquals("4 9 -219", new StringBuilder().append("4").append("9").append("-219").toString(), breadthFirstTraversal(testTree));
    }
}