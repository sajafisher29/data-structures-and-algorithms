package linkedList;

//To refresh my memory I did some extra research to look at different ways the code is laid out
//https://codefellows.github.io/common_curriculum/data_structures_and_algorithms/Code_401/class-05/resources/singly_linked_list.html
//https://beginnersbook.com/2013/12/linkedlist-in-java-with-example/
//https://www.geeksforgeeks.org/linked-list-in-java/
//https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/

//Thank you to James for helping me refactor my code when I got stuck!

import java.util.StringJoiner;

public class LinkedList { //T for type, use a single character for the variable

    //Within LinkedList class include head property. Instantiation should create empty Linked List.

    Node head; //This is the head of the list

    class Node {
        int value;
        Node next;

        //Node constructor
        Node(int value) {
            this(value, null);
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    //Define method called insert, takes any value as an argument, adds a new node with that value to the head of the list with an O(1) Time performance.
    //Refactored to Michelle's recommendation (see past commit version)
    public void insert(int value) {
        this.head = new Node(value, this.head);
    }

    //Define method called includes, takes any value as an argument, returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
    public boolean includes(int desiredValue) {
        Node currentNode = this.head;

        while (currentNode != null) {
            if (currentNode.value == desiredValue) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    //Define method called toString, takes in no arguments, returns a string representing all the values in the Linked List.
    public String toString() {
        Node currentNode = this.head;

        StringJoiner listValues = new StringJoiner(" ");
        listValues.add("LinkedList:");

        //Traverse through the LinkedList
        while (currentNode != null) {
            //Print out current node value
            listValues.add("" + currentNode.value);
            //Move to next node
            currentNode = currentNode.next;
        }
        return listValues.toString();
    }

    //Check for a value in the list
    public boolean contains(int key) {
        Node currentNode = this.head;

        while (currentNode != null) {
            if (currentNode.value == key) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    // Write the following methods for the Linked List class:
    // .append(value) which adds a new node with the given value to the end of the list
    public void append(int value) {
        Node newNode = new Node(value);

        //If there are no nodes in the list
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node currentNode = this.head;

            //Traverse to the end of the list and then append
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(value);
        }
    }

    //Adds a node at the beginning of the LinkedList
    public void insertHead(int value){
        this.head = new Node(value, this.head);
    }

    // .insertBefore(value, newVal) which add a new node with the given newValue immediately before the first value node
    // The boolean will let us know if we found the value in the list or not
    public boolean insertBefore(int key, int newValue) {
        boolean success = false;
        Node newNode = new Node(newValue);

        //Is the list long enough to run
        if (head == null || head.next == null) {
            System.out.println("List is too short.");
        } else if (head.value == key){
            insertHead(newValue);
        } else {
            Node previousNode = head;
            Node currentNode = head.next;

            //If the loop finds the end or the key
            while (currentNode != null && currentNode.value != key) {
                previousNode = previousNode.next;
                currentNode = currentNode.next;
            }

            //If we get to the end of the list and don't find the key
            if (currentNode == null) {
                System.out.println(String.format("Did not find the value %d", key));
            } else {
                //Add the new node
                newNode.next = currentNode;
                previousNode.next = newNode;
                success = true;
            }
        }
        return success;
    }

    // .insertAfter(value, newVal) which add a new node with the given newValue immediately after the first value node
    // The boolean will let us know if we found the value in the list or not
    public boolean insertAfter(int key, int newValue) {
        boolean success = false;
        Node newNode = new Node(newValue);

        //Is the list long enough to run
        if (head == null || head.next == null) {
            System.out.println("List is too short.");
        } else {
            Node previousNode = head;
            Node currentNode = head.next;

            //If the loop finds the end or the key
            while (currentNode != null && currentNode.value != key) {
                previousNode = previousNode.next;
                currentNode = currentNode.next;
            }

            //If we get to the end of the list and don't find the key
            if (currentNode == null) {
                System.out.println(String.format("Did not find the value %d", key));
            } else {
                //Add the new node
                currentNode.next = newNode;
                newNode.next = null;
                success = true;
            }
        }
        return success;
    }

    public int runningBackwards(int k) {
        Node currentNode = this.head;
        int listLength = 0;

        while (currentNode.next != null) {
            listLength++;
            currentNode = currentNode.next;
        }

        int stepsToTake = listLength - k;

        if (stepsToTake < 0 || stepsToTake > listLength) {
            throw new IllegalArgumentException("Input value k must be less than the length of the LinkedList.");
        }

        currentNode = this.head;
        int counter = 0;

        while (currentNode.next != null && counter != stepsToTake) {
            counter++;
            currentNode = currentNode.next;
        }
        return (int) currentNode.value;
    }
}

//No exception or stack trace be shown to end user. Catch and handle any exceptions and return a printed value or operation which cleanly represents the state and either stops execution cleanly, or provides the user with clear direction and output.

//Stretch Goal: Create a new branch called doubly-linked-list, using the resources online, implement a doubly linked list (completely separate from your singly linked list).
//Stretch Goal: Write an additional method to delete a node with the given value from the linked list.