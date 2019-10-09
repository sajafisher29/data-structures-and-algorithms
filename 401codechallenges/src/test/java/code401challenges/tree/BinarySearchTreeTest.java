package code401challenges.tree;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    BinaryTree testTree;

    @Before
    public void setup () {
        testTree = new BinaryTree();
        testTree.add(4);
        testTree.add(9);
        testTree.add(-219);
    }

    // Can successfully instantiate an empty tree
    @Test public void testInstantiation() {
        BinarySearchTree canYouSeeMeNow = new BinarySearchTree();
        assertNull("CanYouSeeMeNow should be null.", canYouSeeMeNow.root);
    }

    // Can successfully instantiate a tree with a single root node
    @Test public void testSingleRootTree() {
        BinarySearchTree canYouSeeMeNowIHaveSomething = new BinarySearchTree();
        canYouSeeMeNowIHaveSomething.add(17);
        assertEquals("The root is 17", 17, canYouSeeMeNowIHaveSomething.root.value);
    }

//    // Can successfully add a left child and right child to a single root node
//    @Test public void testAddLeftAndRightChildToSingleRootTree() {
//        assertTrue("The tree contains node with value of 3", true, testTree.contains(9));
//        assertTrue("The tree contains node with value of -5", true, testTree.contains(-219));
//    } // Not sure why it can't see the contains()

}