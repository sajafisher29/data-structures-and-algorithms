package code401challenges.graph;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Graph<T> {

    private Set<GraphNode<T>> setOfGraphNodes;

    public Graph() {
        this.setOfGraphNodes = new HashSet<>();
    }

    // AddNode() ==================================================
        // Adds a new node to the graph
        // Takes in the value of that node
        // Returns the added node

    public GraphNode<T> addNode(T value) {
        GraphNode newNode = new GraphNode(value);
        this.setOfGraphNodes.add(newNode);
        return newNode;
    }

    // AddEdge() ==================================================
        // Adds a new edge between two nodes in the graph
        // Include the ability to have weight
        // Takes in the two nodes to be connected by the edge
        // Both nodes should already be in the Graph

    public GraphEdge<T> addEdge(GraphNode graphNode1, GraphNode graphNode2) {
        if (this.setOfGraphNodes.contains(graphNode1) && this.setOfGraphNodes.contains(graphNode2)) {
            GraphEdge newEdge = new GraphEdge(graphNode2);
            graphNode1.addNeighbor(newEdge);
            return newEdge;
        } else {
            throw new IllegalArgumentException("GraphNode does not exist in the graph");
        }
    }

    public GraphEdge<T>  addEdge(GraphNode graphNode1, GraphNode graphNode2, int weight) {
        if (this.setOfGraphNodes.contains(graphNode1) && this.setOfGraphNodes.contains(graphNode2)) {
            GraphEdge newEdge = new GraphEdge(graphNode2, weight);
            graphNode1.addNeighbor(newEdge);
            return newEdge;
        } else {
            throw new IllegalArgumentException("GraphNode does not exist in the graph");
        }
    }

    // GetNodes() ==================================================
        // Returns all of the nodes in the graph as a collection (set, list, or similar)

    public Set<GraphNode<T>> getNodes() {
        if (size() == 0) {
            return null;
        }
        return this.setOfGraphNodes;
    }

    // GetNeighbors() ==============================================
        // Returns a collection of nodes connected to the given node
        // Takes in a given node
        // Include the weight of the connection in the returned collection

    public Set<GraphNode<T>> getNeighbors(GraphNode<T> graphNode) {
        Set<GraphNode<T>> SetOfNeighbors = new HashSet<GraphNode<T>>();
        for (GraphEdge<T> knownNeighbor : graphNode.neighbors) {
            if (!SetOfNeighbors.contains(knownNeighbor.connectedNode)) {
                SetOfNeighbors.add(knownNeighbor.connectedNode);
            }
        }
        return SetOfNeighbors;

    }

    // Size() ======================================================
        // Returns the total number of nodes in the graph

    public int size() {
        return this.setOfGraphNodes.size();
    }

}
