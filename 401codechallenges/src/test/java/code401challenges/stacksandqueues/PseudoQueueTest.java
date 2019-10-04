package code401challenges.stacksandqueues;

import org.junit.Before;
import org.junit.Test;
import java.util.NoSuchElementException;

import static junit.framework.TestCase.assertEquals;

public class PseudoQueueTest {
    PseudoQueue<Integer> testPseudoQueue;

    @Before public void setup() {
        testPseudoQueue = new PseudoQueue<Integer>();
        testPseudoQueue.enqueue(15);
        testPseudoQueue.enqueue(4);
        testPseudoQueue.enqueue(7);
    }

// Happy Path: Expected outcome

    @Test public void testEnqueueHappyPathWhenEmpty() {
        assertEquals(15, testPseudoQueue.dequeue().intValue());
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