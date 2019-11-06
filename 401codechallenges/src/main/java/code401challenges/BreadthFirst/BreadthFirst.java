package code401challenges.BreadthFirst;

import code401challenges.graph.GraphEdge;
import code401challenges.graph.GraphNode;
import code401challenges.stacksandqueues.Queue;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class BreadthFirst {

    // Write a breadth first traversal method which takes a starting node
    // Return a collection of nodes in the order they were visited

    public List<GraphNode> breadthFirstTraversal(GraphNode startingNode) {
        Queue<GraphNode> graphNodeQueue = new Queue<GraphNode>();
        Set<GraphNode> collectionOfSeenNodes = new HashSet<>();
        LinkedList<GraphNode> linkedList = new LinkedList<>();

        graphNodeQueue.enqueue(startingNode);
        collectionOfSeenNodes.add(startingNode);
        linkedList.add(startingNode);

        while (!graphNodeQueue.isEmpty()) {
            GraphNode nodeToCheckForNeighbors = graphNodeQueue.peek();
            for (GraphEdge<T> neighbor : nodeToCheckForNeighbors.getNeighbors()) {
                GraphNode connectedNode = neighbor.connectedNode;
                if (!collectionOfSeenNodes.contains(neighbor)) {
                    graphNodeQueue.enqueue(connectedNode);
                    collectionOfSeenNodes.add(connectedNode);
                    collectionOfSeenNodes.add(connectedNode);
                }
            }
            graphNodeQueue.dequeue();
        }
        return linkedList;
    }
}
