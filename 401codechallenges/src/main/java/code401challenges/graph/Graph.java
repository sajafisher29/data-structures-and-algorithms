package code401challenges.graph;

import java.util.HashMap;
import java.util.Set;

public class Graph<T> {

    private HashMap<T, GraphNode<T>> adjacencyList;
    public GraphNode rootNode;

    public Graph(HashMap<T, GraphNode<T>> adjacencyList, GraphNode rootNode) {
        this.adjacencyList = adjacencyList;
        this.rootNode = rootNode;
    }

    public void setRootNode(GraphNode rootNode) {
        this.rootNode = rootNode;
    }

    public GraphNode getRootNode() {
        return this.rootNode;
    }

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    // AddNode() ==================================================
        // Adds a new node to the graph
        // Takes in the value of that node
        // Returns the added node

    public GraphNode addNode(GraphNode newNode) {
        adjacencyList.put((T) newNode, new GraphNode<T>(newNode));
        return newNode;
    }

    // AddEdge() ==================================================
        // Adds a new edge between two nodes in the graph
        // Include the ability to have a “weight”
        // Takes in the two nodes to be connected by the edge
        // Both nodes should already be in the Graph

    public void addEdge(GraphNode graphNode1, GraphNode graphNode2, int weight) {
        if (!containsGraphNode(graphNode1) || !containsGraphNode(graphNode2)) {
            throw new RuntimeException("Vertex does not exist");
        }

        // Add the edge
        GraphNode<T> node1 = getGraphNode(graphNode1);
        GraphNode<T> node2 = getGraphNode(graphNode2);
        return node1.addEdge(node2, weight);
    }

    // GetNodes() ==================================================
        // Returns all of the nodes in the graph as a collection (set, list, or similar)

    public Set<GraphNode> getNodes() {
        Set<GraphNode> setOfGraphNodes = null;

        return setOfGraphNodes;
    }

    // GetNeighbors() ==============================================
        // Returns a collection of nodes connected to the given node
        // Takes in a given node
        // Include the weight of the connection in the returned collection

    public Set<GraphNode> getNeighbors(GraphNode graphNode) {
        Set<GraphNode> setOfNeighbors = null;

        return setOfNeighbors;
    }

    // Size() ======================================================
        // Returns the total number of nodes in the graph

    public int size() {
        int count = 0;

        if (head == null) {
            return 0;
        } else {
            count = countNodes(head);
        }

        clearVisited();
        return count;
    }

    private int countNodes(GraphNode startingNode) {
        int result = 1;

        startingNode.setVisited(true);
        for (GraphEdge edge: startingNode.getOutEdges()) {
            if (! edge.connectedNode.isVisited()) {
                result += countNodes(edge.connectedNode);
            }
        }
        return result;
    }

    private void clearVisited() {
        if (head != null) {
            clearNode(head);
        }
    }

    private void clearNode(GraphNode startingNode) {
        startingNode.setVisited(false);
        for (GraphEdge edge : startingNode.getOutEdges()) {
            if (edge.connectedNode.isVisited()) {
                clearNode(edge.connectedNode);
            }
        }
    }
    
}
