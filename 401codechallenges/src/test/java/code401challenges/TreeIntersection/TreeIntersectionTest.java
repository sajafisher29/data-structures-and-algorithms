package code401challenges.TreeIntersection;

import code401challenges.tree.Node;
import org.junit.Test;
import java.util.HashSet;

public class TreeIntersectionTest {

    // Test shared values
    @Test
    public void treeIntersectionTestSharedValues () {
        //           18
        //          /  \
        //         5    23
        //        / \   / \
        //       2  7  19  24
        Node<Integer> binaryTree1 = new Node<>(18,
                new Node<>(5, new Node<>(2), new Node<>(7)),
                new Node<>(23, new Node<>(19), new Node<>(24)));

        //            5
        //           / \
        //          0  2
        Node<Integer> binaryTree2 = new Node<>(5,
                new Node<>(0), new Node<>(2));

    }

    // Test no shared values
    @Test
    public void treeIntersectionTestNoSharedValues (){
        //           18
        //          /  \
        //         5    23
        //        / \   / \
        //       2  7  19  24
        Node<Integer> binaryTree1 = new Node<>(18,
                new Node<>(5, new Node<>(2), new Node<>(7)),
                new Node<>(23, new Node<>(19), new Node<>(24)));

        //            9
        //           / \
        //          0  6
        Node<Integer> binaryTree2 = new Node<>(9,
                new Node<>(0), new Node<>(6));

    }

    // Test tree with one node
    @Test
    public void treeIntersectionTestOneNode () {
        //           18
        //          /  \
        //         5    23
        //        / \   / \
        //       2  7  19  24
        Node<Integer> binaryTree1 = new Node<>(18,
                new Node<>(5, new Node<>(2), new Node<>(7)),
                new Node<>(23, new Node<>(19), new Node<>(24)));

        //            5
        //           / \
        //          0  2
        //         /\
        //       12 17
        Node<Integer> binaryTree2 = new Node<>(5,
                new Node<>(0, new Node<>(12), new Node<>(17)),
                new Node<>(2));

    }

    // Test trees with one node each
    @Test
    public void treeIntersectionTestBothOneNode () {
        // 10
        Node binaryTree1 = new Node<>(10);

        // 5
        Node binaryTree2 = new Node<>(5);

    }

}