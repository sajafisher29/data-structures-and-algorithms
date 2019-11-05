package code401challenges.BreadthFirst;

import code401challenges.graph.GraphNode;
import code401challenges.stacksandqueues.Queue;

import java.util.Set;

public class BreadthFirst {

    // Write a breadth first traversal method which takes a starting node
    // Return a collection of nodes in the order they were visited

    public Set breadthFirstTraversal(GraphNode<T> startingNode) {
        Queue<GraphNode<T>> graphNodeQueue = new Queue<GraphNode<T>>();
        Set<GraphNode<T>> collectionOfSeenNodes = new Set<GraphNode<T>>();

        graphNodeQueue.enqueue(startingNode);
        collectionOfSeenNodes.add(startingNode);

        while (!graphNodeQueue.isEmpty()) {
            GraphNode nodeToCheckForNeighbors = graphNodeQueue.dequeue();

            if (nodeToCheckForNeighbors.getNeighbors() != null) {
                graphNodeQueue.enqueue(nodeToCheckForNeighbors.getNeighbors() )// Need to enqueue all the nodes in the List);
                collectionOfSeenNodes.add(nodeToCheckForNeighbors.getNeighbors()  )// Need to add all the nodes in the List);
            }
        }
        return collectionOfSeenNodes;
    }
}
