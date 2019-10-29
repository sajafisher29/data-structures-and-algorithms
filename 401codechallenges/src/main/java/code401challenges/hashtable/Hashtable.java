package code401challenges.hashtable;

import java.util.Arrays;
import java.util.LinkedList;

public class Hashtable<Key, Value> {

    // Array of buckets with LinkedLists at each index
    private LinkedList<HashNode<Key, Value>>[] bucketArray;

    // Current capacity of array
    public int bucketArrayNumberOfBuckets = 50;

    // Current size of LinkedList
    private static final int bucketListSize = 0;

    // Constructor for hashtable array of defined length with linkedlists
    public Hashtable() {
        this.bucketArray = new LinkedList[bucketArrayNumberOfBuckets];
    }

    // **************** Get Size ***************

    public int getSize() {return bucketListSize;}

    // **************** Check if Empty ***************

    public boolean isEmpty() { return getSize() == 0; }

    // **************** Hash Method ***************

    // This implements the hash function to calculate the index for the key
    protected int hash(Key key) {

        String keyAsString = key.toString();
        int keySumOfASCIIValues = 0;

        for (int i = 0; i < keyAsString.length(); i++) {
            keySumOfASCIIValues += keyAsString.charAt(i);
        }

        int index = ((keySumOfASCIIValues * 599) % bucketArrayNumberOfBuckets);

        return index;
    }

    // **************** Add Method ***************

    // Adds a key value pair to hashtable
    public boolean add(Key key, Value value) {

        if (contains(key)) {
            throw new IllegalArgumentException("Must be unique key. This key already exists in the array.");
        }

        HashNode dataToStore = new HashNode(key, value);
        int index = hash(key);
        if (this.bucketArray[index] == null) {
            this.bucketArray[index] = new LinkedList<>();
        }
        this.bucketArray[index].add(dataToStore);

        return true;
    }

//        // If the load factor goes beyond the set threshold, double the hash table size
//        if ((1.0 * bucketArraySize)/bucketArrayNumberOfBuckets >= 0.7) {
//            LinkedList<HashNode> temp = bucketArray;
//            bucketArray = new LinkedList<>();
//            bucketArrayNumberOfBuckets = 2 * bucketArrayNumberOfBuckets;
//            bucketArraySize = 0;
//
//            for (int i = 0; i < bucketArrayNumberOfBuckets; i++) {
//                bucketArray.add(null);
//            }
//
//            for (HashNode headNode : temp) {
//                while (headNode != null) {
//                    add(headNode.key, headNode.value);
//                    headNode = headNode.next;
//                }
//            }
//        }
//    }


    // **************** Get Method ***************

    // Returns value for a key
    public Value get(Key key) {

        int index = hash(key);
        if (bucketArray[hashCode()] == null) {
            return null;
        }

        LinkedList<HashNode<Key, Value>> indexsLinkedList = this.bucketArray[index];

        for(HashNode storedData : indexsLinkedList){
            if(key.equals(storedData.getKey())){
                return (Value)storedData.getValue();
            }
        }
        return null;
    }

    // **************** Contains Method ***************

    // Assess whether the specified key is stored in the table.

    public boolean contains(Key key){
        int index = hash(key);

        if (bucketArray[hashCode()] == null) {
            return false;
        }

        LinkedList<HashNode<Key, Value>> indexsLinkedList = this.bucketArray[index];

        for(HashNode storedThing : indexsLinkedList){
            if(key.equals(storedThing.getKey())){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Hashtable{ LinkedList = " + Arrays.toString(bucketArray) + "}";
    }
}
