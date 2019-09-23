package linkedList;

//To refresh my memory I did some extra research to look at different ways the code is laid out
//https://codefellows.github.io/common_curriculum/data_structures_and_algorithms/Code_401/class-05/resources/singly_linked_list.html
//https://beginnersbook.com/2013/12/linkedlist-in-java-with-example/
//https://www.geeksforgeeks.org/linked-list-in-java/
//https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/

class LinkedList {

    //Within LinkedList class include head property. Instantiation should create empty Linked List.

    Node head; //This is the head of the list

    //Create Node class with properties for value stored, and a pointer to the next Node.
    //Node constructor
    static class Node{
        int value; //The value held by the node
        Node next; //This will hold where the node points

        Node(int val) {value = val; next = null;}
    }

    //Define method called insert, takes any value as an argument, adds a new node with that value to the head of the list with an O(1) Time performance.
    public static LinkedList insert(LinkedList list, int value) {
        Node currentNode = list.head;

        //Creates new node with input value
        Node newNode = new Node(value);
        newNode.next = null;

        //If the list is empty make the new node the head
        if (list.head == null) {
            list.head = newNode;
        } else { //Insert new node, assign it as head, and assign the old head as its next
            newNode.next = list.head;
            list.head = newNode;
            currentNode = newNode;
        }
    }

    //Define method called includes, takes any value as an argument, returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
    static boolean includes(int desiredValue) {
        Node currentNode = list.head;

        while (currentNode != null) {
            if (currentNode.value == desiredValue) {
                return true;
            }
            currentNode = currentNode.next;
        }
    }

    //Define method called toString, takes in no arguments, returns a string representing all the values in the Linked List.
    public String toString() {
        Node currentNode = list.head;

        StringBuilder listValues = new StringBuilder(String.format("LinkedList: "));

        //Traverse through the LinkedList
        while (currentNode != null) {
            //Print out current node value
            listValues.append(String.format(currentNode.value + ", "));
            //Move to next node
            currentNode = currentNode.next;
        }
    }

}

//No exception or stack trace be shown to end user. Catch and handle any exceptions and return a printed value or operation which cleanly represents the state and either stops execution cleanly, or provides the user with clear direction and output.

//Stretch Goal: Create a new branch called doubly-linked-list, and, using the resources available to you online, implement a doubly linked list (completely separate from your singly linked list).