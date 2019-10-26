package code401challenges.hashtable;

public class HashNode<Key, Value> {

    Key key;
    Value value;

    // Reference to next node
    HashNode<Key, Value> next;

    //Constructor
    public HashNode(Key key, Value value) {
        this.key = key;
        this.value = value;
    }
}
