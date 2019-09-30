import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {

//Write tests to prove the following functionality:
    Queue testQueue;

    @Before public void setup() {
        testQueue = new Queue();
        testQueue.enqueue(4);
        testQueue.enqueue(7);
        testQueue.enqueue(12);
        testQueue.enqueue(16);
        testQueue.enqueue(21);
        testQueue.enqueue(-3);
    }

//Can successfully enqueue into a queue

    @Test public void testEnqueue() {
        assertEquals("The first node in the queue is 4.",
                4,
                        testQueue.peek());
    }

//Can successfully enqueue multiple values into a queue

    @Test public void testEnqueueMultipleValues() {
        assertEquals("The queue contains 4 7 12 16 21 -3.",
                "Queue contains: 4 7 12 16 21 -3",
                testQueue.toString());
    }

//Can successfully dequeue out of a queue the expected value

    @Test public void testDequeueExpectedValue() {

    }

//Can successfully peek into a queue, seeing the expected value

    @Test public void testPeekExpectedValue() {

    }

//Can successfully empty a queue after multiple dequeues

    @Test public void testEmptyAfterDequeues() {

    }

//Can successfully instantiate an empty queue

    @Test public void testInstantiateEmptyQueue() {

    }

}