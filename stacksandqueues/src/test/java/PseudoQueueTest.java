import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

//“Happy Path” - Expected outcome

    @Test public void testEnqueueHappyPathWhenEmpty() {

    }

//Expected failure

    @Test() public void testDequeueWhenStacksAreEmpty() {
        // Throws exception that queue is empty
    }

//Edge Case (if applicable/obvious)

    @Test public void testEdgeCase() {
        // None brainstormed yet
    }



}

//I would want to test 'Happy Paths' for when the stacks are empty, Stack1 has nodes, Stack2 has nodes,