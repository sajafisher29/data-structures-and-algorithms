package linkedList;

import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

//I was a little stuck on how to test for an empty list so I did some research on testing LinkedLists
//https://javarevisited.blogspot.com/2015/02/simple-junit-example-unit-tests-for-linked-list-java.html

//Same shout out to James for the help!

public class LinkedListTest {

    LinkedList list = new LinkedList();
    LinkedList secondList = new LinkedList();
    private Object IllegalAccessException;

    @Before public void setup(){
        //@Before <-- annotations give extra info (metadata) to things like JUnit, can annotate classes, methods, variables
        list.insert(29);
        list.insert(13);
        list.insert(1);
        list.insert(93);
        list.insert(723);

        secondList.insert(71);
        secondList.insert(46);
        secondList.insert(60);
        secondList.insert(14);
        secondList.insert(5);
        secondList.insert(112);
    }
    //There is an @After for after the tests to break down further, we won't be using it

    // Can successfully instantiate an empty linked list
    @Test public void testEmptyList() {
        LinkedList empty = new LinkedList();
        assertNull(
                "Instantiation of the head Node creates an empty linked list.",
                empty.head
        );
    }

    // Can properly insert single node into the linked list
    @Test public void testSingleNode() {
        list.insert(37);
        assertEquals(
                "This linked list has one node added with a value of 37",
                37,
                list.head.value);
    }

    // Can properly insert multiple nodes into the linked list
    @Test public void testMultipleNodes() {
        list.insert(1_207);
        list.insert(14);

        assertEquals("This list will now include 14 and 1,207 at the beginning of the list.",
                "LinkedList: 14 1207 723 93 1 13 29",
                list.toString());
    }

//    // The head property will properly point to the first node in the linked list
//    @Test public void findsFirstNode() {
//
//    }
//
//    // The head property will properly point to null when there are no inserted nodes
//    @Test public void findsFirstNode() {
//
//    }

    // Will return true when finding a value within the linked list that exists
    @Test public void trueValueFound() {
        assertTrue(list.includes(93));
    }

    // Will return false when searching for a value in the linked list that does not exist
    @Test public void falseValueMissing() {
        assertFalse(list.includes(26));
    }

    // Can properly return a string collection of all the values that exist in the linked list when there is only one node
    @Test public void returnsValue() {
        LinkedList one = new LinkedList();
        one.insert(8);
        assertEquals("LinkedList: 8", one.toString());
    }
    // Can properly return a string collection of all the values that exist in the linked list
    @Test public void returnsValues() {
        assertEquals("This list should contain 723, 93, 1, 13, and 29",
                "LinkedList: 723 93 1 13 29",
                list.toString());
    }

    //Utilize Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts
    //Can successfully add a node to the end of the linked list when it already has nodes
    @Test public void testAppendWhenMultipleNodesExist() {
        list.append(8);
        assertEquals("Node(8) was added to the end of the list.",
                "LinkedList: 723 93 1 13 29 8",
                list.toString());
    }

    //Can successfully add a node to the end of the linked list when it has one node
    @Test public void testAppendWhenOneNodeExists() {
        LinkedList one = new LinkedList();
        one.insert(-4);
        one.append(73);
        assertEquals("LinkedList: -4 73",
                one.toString());
    }

    //Can successfully add a node to the end when the list is empty
    @Test public void testAppendWhenEmpty() {
        LinkedList empty = new LinkedList();
        empty.append(73);

        assertEquals("LinkedList: 73", empty.toString());
    }

    //Can successfully insert multiple nodes to the end of a linked list
//    @Test public void testInsertAtEnd() {
//        LinkedList many = new LinkedList();
//        Node currentNode = many.head;
//
//        many.insert(-4);
//        many.insert(49);
//        many.insert(73);
//        many.insert(1);
//        many.insertBefore(currentNode.next.value, 8);
//        many.insertBefore(currentNode.next.value, 92);
//
//        assertEquals("Node(8) should be second to last in the list.",
//                8,
//                currentNode.next.next.next.next.value);
//        assertEquals("Node(92) should be last in the list.",
//                92,
//                currentNode.next.next.next.next.next.value);
//    }

    //Can successfully insert a node before node(value) in the middle of a linked list when there are multiple nodes
    @Test public void testInsertInMiddle() {
        list.insertBefore(93, 8);
        assertEquals("Node(8) should be inserted before Node(93).",
                "LinkedList: 723 8 93 1 13 29",
                list.toString());
    }
    //Can successfully insert a node before the first value node of a linked list of multiple nodes
    @Test public void testInsertAtBeginning() {
        list.insertBefore(93, 11);
        assertEquals("The list should now be 723, 11, 93, 1, 13, and 29",
                "LinkedList: 723 11 93 1 13 29",
                list.toString());
    }

    //Can successfully insert after a node in the middle of linked list with multiple nodes
    @Test public void testInsertAfterInMiddle() {
        list.insertBefore(1, 49);
        assertEquals("Node(49) should be fourth in the list.",
                "LinkedList: 723 93 49 1 13 29",
                list.toString());
    }

    //Can successfully insert a node after the last node of the linked list
    @Test public void testInsertAfterLastNode() {
        list.insertAfter(29, 49);

        assertEquals("Node(49) should be the last value.",
                "LinkedList: 723 93 1 13 29 49",
                list.toString());
    }

    //Where k is greater than the length of the linked list
    @Test public void testKGreaterThanLength() {
        assertEquals("Input k is greater than the length of the LinkedList.",
                IllegalAccessException,
                list.runningBackwards(7));
    }

    //Where k and the length of the list are the same
    @Test public void testKEqualToLength() {
        LinkedList equal = new LinkedList();
        equal.insert(-4);
        equal.insert(49);
        equal.insert(73);
        equal.insert(1);
        equal.insert(27);
        equal.insert(91);

        assertEquals("Input k is equal to the length of the LinkedList.",
                91,
                equal.runningBackwards(6));
    }

    //Where k is not a positive integer
    @Test public void testNegativeK() {
        LinkedList crazy = new LinkedList();
        crazy.insert(-4);
        crazy.insert(49);
        crazy.insert(73);
        crazy.insert(1);
        crazy.insert(27);

        assertEquals("Input k is a negative number and should throw error.",
                IllegalAccessException.class,
                crazy.runningBackwards(-2));
    }

    //Where the linked list is of a size 1
    @Test public void testKOfOne() {
        LinkedList one = new LinkedList();
        one.insert(27);

        assertEquals("Input k is less than the LinkedList length.",
                27,
                one.runningBackwards(0));
    }

    //Happy Path where k is not at the end, but somewhere in the middle of the linked list
    @Test public void testKInMiddle() {
        LinkedList happy = new LinkedList();
        happy.insert(-4);
        happy.insert(49);
        happy.insert(73);
        happy.insert(1);
        happy.insert(27);

        assertEquals("This should work and then we all get to snuggle kittens.",
                73,
                happy.runningBackwards(2));
    }

    //Test to see if lists have merged
    @Test public void mergedLists() {
        assertEquals("The lists have been merged.",
                secondList.toString(),
                LinkedList.mergeLists(secondList, list).toString());
    }
}