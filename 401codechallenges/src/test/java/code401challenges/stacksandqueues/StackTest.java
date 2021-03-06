package code401challenges.stacksandqueues;

import org.junit.Before;
import org.junit.Test;
import java.util.Stack;

import static junit.framework.TestCase.assertEquals;

public class StackTest {

//Write tests to prove the following functionality:

    @Before public void setup() {
        Stack<Integer> testStack = new Stack<Integer>();
        testStack.push(4);
        testStack.push(7);
        testStack.push(12);
        testStack.push(16);
        testStack.push(21);
        testStack.push(-3);
    }

//Can successfully push onto a stack

    @Test public void testPushToStack() {
        Stack<Integer> testPush = new Stack<>();
        testPush.push(5);

        assertEquals("The stack's first value will be 5.",
                5,
                testPush.pop().intValue());
    }

//Can successfully push multiple values onto a stack

    @Test public void testPushMultipleValuesOntoStack() {

    }

//Can successfully pop off the stack

    @Test public void testPopOffOfStack() {

    }

//Can successfully empty a stack after multiple pops

    @Test public void testEmptyStackAfterMultiplePops() {

    }

//Can successfully peek the next item on the stack

    @Test public void testPeekStack() {

    }

//Can successfully instantiate an empty stack

    @Test public void testInstantiateEmptyStack() {

    }

}