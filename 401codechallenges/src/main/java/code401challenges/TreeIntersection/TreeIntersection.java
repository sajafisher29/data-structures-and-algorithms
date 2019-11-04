package code401challenges.TreeIntersection;

import code401challenges.tree.Node;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class TreeIntersection {

    // Algorithm: Iterate through the first tree and store all values in a hashtable. Then iterate through the second tree, any values from the second tree that are also in the hashtable are added to a hashset. The hashset is returned containing all shared values between the two trees.

    // Adjusted based on Michelle Ferreirae's code review on Oct 30, 2019 in Java401

    public static Set<Integer> treeIntersection(Node binaryTree1, Node binaryTree2) {
        HashSet<Integer> commonValues = new HashSet<>();

        // Hashtable valuesFromBinaryTree1 = new Hashtable();
        HashMap<Integer, Boolean> valuesFromBinaryTree1 = new HashMap<>();
        LinkedList<Node> nodesToProcess = new LinkedList<>();

        nodesToProcess.add(binaryTree1);

        while(!nodesToProcess.isEmpty()) {
            // Set current to the first node removed from nodesToProcess:
            Node current = nodesToProcess.removeFirst();
            valuesFromBinaryTree1.put((Integer) current.getValue(), null);

            // Add node's children to the list of nodes to process
            // Use breadth-first traversal (Adds to end of linked list, removes from start -> acts like a queue
            if (current.getLeftChild() != null) {
                nodesToProcess.add(current.getLeftChild());
            }
            if (current.getRightChild() != null) {
                nodesToProcess.add(current.getRightChild());
            }
        }

        // Start assessing second binary tree
        nodesToProcess.add(binaryTree2);

        while(!nodesToProcess.isEmpty()) {
            Node current = nodesToProcess.removeFirst();
            if(valuesFromBinaryTree1.containsKey(current.getValue())) {
                commonValues.add((Integer) current.getValue());
            }
            // Traverse through the second tree
            if (current.getLeftChild() != null) {
                nodesToProcess.add(current.getLeftChild());
            }
            if (current.getRightChild() != null) {
                nodesToProcess.add(current.getRightChild());
            }
        }
        return commonValues;
    }

}
