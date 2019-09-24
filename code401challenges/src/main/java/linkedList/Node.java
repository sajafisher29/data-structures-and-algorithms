package linkedList;

class Node<T> {
    //Create Node class with properties for value stored, and a pointer to the next Node.
    //Node constructor
     T value; //The value held by the node
     Node next; //This will hold where the node points

     Node(T value) {this(value, null);}
     Node(T value, Node next) {this.value = value; this.next = next;}

    public Node() {

    }
}
