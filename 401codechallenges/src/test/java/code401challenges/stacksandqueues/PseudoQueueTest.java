package code401challenges.stacksandqueues.src.test.java;

import org.junit.Before;
import org.junit.Test;
import code401challenges.stacksandqueues.src.main.java.PseudoQueue;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class PseudoQueueTest {
    PseudoQueue testPseudoQueue;

    @Before public void setup() {
        testPseudoQueue = new PseudoQueue();
        testPseudoQueue.enqueue(15);
        testPseudoQueue.enqueue(4);
        testPseudoQueue.enqueue(7);
    }

// Happy Path: Expected outcome

    @Test public void testEnqueueHappyPathWhenEmpty() {
        assertEquals("Enqueue can add to the PseudoQueue.",
                15,
                testPseudoQueue.dequeue());
    }

//Expected failure

    @Test(expected = NoSuchElementException.class) public void testDequeueWhenStacksAreEmpty() {
        // Throws exception that queue is empty
        PseudoQueue empty = new PseudoQueue();
        empty.dequeue();
    }

//Edge Case (if applicable/obvious)

    @Test public void testEdgeCase() {
        // None brainstormed yet
    }

}

//I would want to test 'Happy Paths' for when the stacks are empty, Stack1 has nodes, Stack2 has nodes