package linkedList;

import org.junit.Test;

import static org.junit.Assert.assertNull;

//I was a little stuck on how to test for an empty list so I did some research on testing LinkedLists
//https://javarevisited.blogspot.com/2015/02/simple-junit-example-unit-tests-for-linked-list-java.html

public class LinkedListTest {

    // Can successfully instantiate an empty linked list
    @Test public void testLinkedList_emptyList() {
        LinkedList empty = new LinkedList();

        assertNull(
                "Instantiation of the head Node creates an empty linked list.",
                test.head
        );
    }
    // Can properly insert into the linked list
    @Test public void testBinarySearch_keyNotFound() {
        assertEquals(
                "This array of more than one keys does not contain the key.",
                -1,
                LinkedList.insert(37,37)
        );
    }
    // The head property will properly point to the first node in the linked list

    // Can properly insert multiple nodes into the linked list

    // Will return true when finding a value within the linked list that exists

    // Will return false when searching for a value in the linked list that does not exist

    // Can properly return a collection of all the values that exist in the linked list
}

