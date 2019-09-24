package linkedList;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

//I was a little stuck on how to test for an empty list so I did some research on testing LinkedLists
//https://javarevisited.blogspot.com/2015/02/simple-junit-example-unit-tests-for-linked-list-java.html

public class LinkedListTest {

    //LinkedList list;

    //@Before <-- annotations give extra info (metadata) to things like JUnit, can annotate classes, methods, variables
    //public void setup() {
        //LinkedList list = new LinkedList();
        //inserting values...
    //}

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
        LinkedList single = new LinkedList();
        single.insert(37);
        Node currentNode = single.head;

        assertEquals(
                "This linked list has one node added with a value of 37",
                37,
                currentNode.value);
    }

    // Can properly insert multiple nodes into the linked list
    @Test public void testMultipleNodes() {
        LinkedList multiple = new LinkedList();
        multiple.insert(1_207);
        multiple.insert(193);
        multiple.insert(29);
        multiple.insert(14);
        Node currentNode = multiple.head;

        assertEquals(14, currentNode.value);
        currentNode = currentNode.next;
        assertEquals(29, currentNode.value);
        currentNode = currentNode.next;
        assertEquals(193, currentNode.value);
        currentNode = currentNode.next;
        assertEquals(1_207, currentNode.value);
        currentNode = currentNode.next;
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
        LinkedList found = new LinkedList();

        found.insert(-4);
        found.insert(49);
        found.insert(73);
        found.insert(1);
        found.insert(8);

        assertTrue(found.includes(-4));
    }

    // Will return false when searching for a value in the linked list that does not exist
    @Test public void falseValueMissing() {
        LinkedList missing = new LinkedList();

        missing.insert(8);
        missing.insert(1);
        missing.insert(73);
        missing.insert(49);
        missing.insert(-4);

        assertFalse(missing.includes(26));
    }

    // Can properly return a string collection of all the values that exist in the linked list when there is only one node
    @Test public void returnsValue() {
        LinkedList one = new LinkedList();

        one.insert(8);

        assertEquals("LinkedList: 8", one.toString());
    }
    // Can properly return a string collection of all the values that exist in the linked list
    @Test public void returnsValues() {
        LinkedList many = new LinkedList();

        many.insert(-4);
        many.insert(49);
        many.insert(73);
        many.insert(1);
        many.insert(8);

        assertEquals("LinkedList: 8 1 73 49 -4", many.toString());
    }

    //Utilize Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts
    //Can successfully add a node to the end of the linked list when it already has nodes
    @Test public void testAppendWhenMultipleNodesExist() {
        LinkedList many = new LinkedList();

        many.insert(-4);
        many.insert(49);
        many.insert(73);
        many.insert(1);
        many.append(8);

        Node currentNode = many.head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        assertEquals(8, currentNode.value);
    }

    //Can successfully add a node to the end of the linked list when it has one node
    @Test public void testAppendWhenOneNodeExists() {
        LinkedList one = new LinkedList();

        one.insert(-4);
        one.append(73);

        Node currentNode = one.head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        assertEquals(73, currentNode.value);
    }

    //Can successfully add a node to the end when the list is empty
    @Test public void testAppendWhenEmpty() {
        LinkedList empty = new LinkedList();

        empty.append(73);

        Node currentNode = empty.head;

        assertEquals(73, currentNode.value);
    }

    //Can successfully insert multiple nodes to the end of a linked list
    @Test public void testInsertAtEnd() {
        LinkedList many = new LinkedList();
        Node currentNode = many.head;

        many.insert(-4);
        many.insert(49);
        many.insert(73);
        many.insert(1);
        many.insertBefore(currentNode.next.value = null, 8);
        many.insertBefore(currentNode.next.value = null, 92);

        assertEquals("Node(8) should be second to last in the list.",
                8,
                currentNode.next.next.next.next.value);
        assertEquals("Node(92) should be last in the list.",
                92,
                currentNode.next.next.next.next.next.value);
    }

    //Can successfully insert a node before node(value) in the middle of a linked list when there are multiple nodes
    @Test public void testInsertInMiddle() {
        LinkedList many = new LinkedList();

        many.insert(-4);
        many.insert(49);
        many.insert(73);
        many.insert(1);
        many.insertBefore(8, 73);

        Node currentNode = many.head;
        assertEquals("Node(8) should be inserted before Node(73) which would put it as the third item in the list.",
                8,
                currentNode.next.next.value);
    }
    //Can successfully insert a node before the first node of a linked list of multiple nodes
    @Test public void testInsertAtBeginning() {
        LinkedList many = new LinkedList();

        many.insert(-4);
        many.insert(49);
        many.insert(73);
        many.insert(1);
        many.insertBefore(8, many.head);

        Node currentNode = many.head;
        assertEquals("First thing in the list should now be 8",
                8,
                currentNode.value);
    }

    //Can successfully insert after a node in the middle of linked list with multiple nodes
    @Test public void testInsertAfterInMiddle() {
        LinkedList many = new LinkedList();

        many.insert(-4);
        many.insert(49);
        many.insert(73);
        many.insert(1);
        many.insertBefore(8, 49);

        Node currentNode = many.head;
        assertEquals("Node(8) should be third in the list.",
                8,
                currentNode.next.next.value);
    }

    //Can successfully insert a node after the last node of the linked list
    @Test public void testInsertAfterLastNode() {
        LinkedList many = new LinkedList();
        Node currentNode = many.head;

        many.insert(-4);
        many.insert(49);
        many.insert(73);
        many.insert(1);
        many.insertAfter(currentNode.next = null, 49);

        assertEquals("Node(49) should be after the forth value.",
                49,
                currentNode.next.next.next.next.value);
    }
}
