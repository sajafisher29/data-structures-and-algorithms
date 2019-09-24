package linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {
    @Test public void testNodeExists() {
        Node exists = new Node();

        assertTrue(
                "The class Node exists.",
                true
        );
    }
}