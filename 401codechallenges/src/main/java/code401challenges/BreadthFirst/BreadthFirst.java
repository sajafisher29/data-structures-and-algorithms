package code401challenges.BreadthFirst;

import code401challenges.graph.GraphNode;
import code401challenges.stacksandqueues.Queue;

public class BreadthFirst {

    // Write a breadth first traversal method which takes a starting node
    // Return a collection of nodes in the order they were visited

    public void breadthFirstTraversal(GraphNode<T> startingNode) {
        Queue<GraphNode<T>> graphNodeQueue = new Queue<GraphNode<T>>();
        Set<GraphNode<T>> seenGraphNodes = new Set<GraphNode<T>>();

        graphNodeQueue.enqueue(startingNode);

        while (!graphNodeQueue.isEmpty()) {
            GraphNode nodeToCheckForNeighbors = graphNodeQueue.dequeue();

            if (nodeToCheckForNeighbors.getNeighbors() != null) {
                graphNodeQueue.enqueue(nodeToCheckForNeighbors.getNeighbors());
            }
        }
    }
}

// Need to change the getNeighbors in graph to return the Nodes not the Edges