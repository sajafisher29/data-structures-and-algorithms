package code401challenges.hashtable;

import java.util.Arrays;
import java.util.LinkedList;

public class Hashtable {

    // Array of buckets with LinkedLists at each index
    protected LinkedList[] bucketArray = new LinkedList[50];

    // Current capacity of arrayList
    private int bucketArrayNumberOfBuckets;

    // Current size of arrayList
    private int bucketArraySize;

    // Constructor initializes capacity, size, and empty LinkedLists
    public Hashtable() {
        bucketArrayNumberOfBuckets = 50;
        bucketArraySize = 0;
    }

    // **************** Get Size ***************

    public int getSize() {return bucketArraySize;}

    // **************** Check if Empty ***************

    public boolean isEmpty() { return getSize() == 0; }

    // **************** Hash Method ***************

    // This implements the hash function to calculate the index for the key
    public int hash(String key) {
        int index = Math.abs((key.hashCode()) % bucketArrayNumberOfBuckets);
        return index;
    }

    private int hashCode(String key) {
        String keyAsString = key.toString();
        int keySumOfASCIIValues = 0;

        for (int i = 0; i < keyAsString.length(); i++) {
            keySumOfASCIIValues += (int) keyAsString.charAt(i);
        }

        int hashCode = (keySumOfASCIIValues * 599);
        return hashCode;
    }

    // **************** Add Method ***************

    // Adds a key value pair to hashtable
    public boolean add(String key, String value) {

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
    public String get(String key) {

        int index = hash(key);

        LinkedList<HashNode> indexsLinkedList = this.bucketArray[index];

        String result = "Not found";

        for(HashNode storedData : indexsLinkedList){
            if(key.equals(storedData.getKey())){
                result = storedData.getValue();
            }
        }
        return result;
    }

    // **************** Contains Method ***************

    // Assess whether the specified key is stored in the table.

    public boolean contains(String key){
        int index = hash(key);
        LinkedList<HashNode> indexsLinkedList = this.bucketArray[index];

        boolean result = false;

        if(indexsLinkedList != null){
            for(HashNode storedThing : indexsLinkedList){
                if(key.equals(storedThing.getKey())){
                    result = true;
                }
            }
        }

        // Key does not exist at this point
        return result;
    }

    @Override
    public String toString() {
        return "Hashtable{ LinkedList = " + Arrays.toString(bucketArray) + "}";
    }
}
