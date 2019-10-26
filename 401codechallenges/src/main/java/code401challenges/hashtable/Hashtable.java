package code401challenges.hashtable;

import java.util.ArrayList;

public class Hashtable<Key, Value> {

// Implement a Hashtable with the following methods:
    // add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
    // get: takes in the key and returns the value from the table.
    // contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
    // hash: takes in an arbitrary key and returns an index in the collection.

    // Array of buckets with LinkedLists at each index
    private  ArrayList<HashNode<Key, Value>> bucketArray;

    // Current capacity of arrayList
    private int arrayListNumberOfBuckets;

    // Current size of arrayList
    private int arrayListSize;

    // Constructor initializes capacity, size, and empty LinkedLists
    public Hashtable() {
        bucketArray = new ArrayList<>();
        arrayListNumberOfBuckets = 50;
        arrayListSize = 0;

        // Create empty LinkedLists
        for (int i = 0; i < arrayListNumberOfBuckets; i++) {
            bucketArray.add(null);
        }
    }

    public int getSize() {return arrayListSize;}
    public boolean isEmpty() {return getSize() == 0}

    // This implements the hash function to calculate the index for the key
    private int getBucketIndex(Key key) {
        int hashCode = key.hashCode();
        int index = hashCode % arrayListNumberOfBuckets;
        return index;
    }

    // **************** Add Method ***************

    // Adds a key value pair to hash
    public void add(Key key, Value value) {

        // Find head of LinkedList for given key
        int bucketIndex = getBucketIndex(key);
        HashNode<Key, Value> head = bucketArray.get(bucketIndex);

        // Check if key is already present
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // Insert key in LL
        arrayListSize++;
        head = bucketArray.get(bucketIndex);
        HashNode<Key, Value> newNode = new HashNode<Key, Value>(key, value);
        newNode.next = head;
        bucketArray.set(bucketIndex, newNode);

        // If the load factor goes beyond the set threshold, double the hash table size
        if ((1.0 * arrayListSize)/arrayListNumberOfBuckets >= 0.7) {
            ArrayList<HashNode<Key, Value>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            arrayListNumberOfBuckets = 2 * arrayListNumberOfBuckets;
            arrayListSize = 0;

            for (int i = 0; i < arrayListNumberOfBuckets; i++) {
                bucketArray.add(null);
            }

            for (HashNode<Key, Value> headNode : temp) {
                while (headNode != null) {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }


    // **************** Get Method ***************

    // Returns value for a key
    public Value get(Key key) {
        // Find head of LinkedList for given key
        int bucketIndex = getBucketIndex(key);
        HashNode<Key, Value> head = bucketArray.get(bucketIndex);

        // Search key in LL
        while (head != null) {
            if (head.key.equals(key))
                return head.value;
            head = head.next;
        }

        // If key was not found
        return null;
    }

}
