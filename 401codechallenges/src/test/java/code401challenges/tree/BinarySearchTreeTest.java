package code401challenges.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    BinaryTree testTree;

    @Before
    public void setup () {
        testTree = new BinaryTree();

    }

    //    Can successfully instantiate an empty tree
    @Test
    public void testEmptyTree() {

    }

    //    Can successfully instantiate a tree with a single root node
    @Test public void testSingleRootTree() {
//        assertTrue("Root Tree exists", testTree // Look for root;)
    }

    //    Can successfully add a left child and right child to a single root node
    @Test public void testAddLeftAndRightChildToSingleRootTree() {
        testTree.add(3);
        assertTrue("The tree should contain nodes with values of 3", testTree.containsValue(3));

        testTree.add(-5);
        assertTrue("The tree should contain nodes with values of -5", testTree.containsValue(-5));

    }
//    Can successfully return a collection from a preorder traversal


//    Can successfully return a collection from an inorder traversal


//    Can successfully return a collection from a postorder traversal


}