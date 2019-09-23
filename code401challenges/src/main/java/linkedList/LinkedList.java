package linkedList;

//To refresh my memory I did some extra research to look at different ways the code is laid out
//https://codefellows.github.io/common_curriculum/data_structures_and_algorithms/Code_401/class-05/resources/singly_linked_list.html
//https://beginnersbook.com/2013/12/linkedlist-in-java-with-example/
//https://www.geeksforgeeks.org/linked-list-in-java/
//https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/

import java.util.StringJoiner;

public class LinkedList<T> { //T for type, use a single character for the variable

    //Within LinkedList class include head property. Instantiation should create empty Linked List.

    public Node<T> head = null; //This is the head of the list

    //Define method called insert, takes any value as an argument, adds a new node with that value to the head of the list with an O(1) Time performance.
    //Refactored to Michelle's recommendation (see past commit version)
    public void insert(T value) {
        this.head = new Node<T>(value, this.head);
    }

    //Define method called includes, takes any value as an argument, returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
    public boolean includes(T desiredValue) {
        Node<T> currentNode = this.head;

        while (currentNode != null) {
            if (currentNode.value.equals(desiredValue)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    //Define method called toString, takes in no arguments, returns a string representing all the values in the Linked List.
    public String toString() {
        Node<T> currentNode = this.head;

        StringJoiner listValues = new StringJoiner(" ");
        listValues.add("LinkedList:");

        //Traverse through the LinkedList
        while (currentNode != null) {
            //Print out current node value
            listValues.add("" + currentNode.value);
            //Move to next node
            currentNode = currentNode.next;
        }
        return String.valueOf(listValues);
    }

    //Helper function getHead
    //getHead
    //Helper function getHeadValue
    //getHeadValue
}

//No exception or stack trace be shown to end user. Catch and handle any exceptions and return a printed value or operation which cleanly represents the state and either stops execution cleanly, or provides the user with clear direction and output.

//Stretch Goal: Create a new branch called doubly-linked-list, and, using the resources available to you online, implement a doubly linked list (completely separate from your singly linked list).