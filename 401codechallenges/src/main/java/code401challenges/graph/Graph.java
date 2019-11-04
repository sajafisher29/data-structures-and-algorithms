package code401challenges.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Graph<T> {

    private List<GraphNode<T>> adjacencyList = new ArrayList<>();
    public GraphNode rootNode;
    public Set<GraphNode> setOfGraphNodes;

    public Graph(List<GraphNode<T>> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    public void setRootNode(GraphNode rootNode) {
        this.rootNode = rootNode;
    }

    public GraphNode getRootNode() {
        return this.rootNode;
    }

    // AddNode() ==================================================
        // Adds a new node to the graph
        // Takes in the value of that node
        // Returns the added node

    public GraphNode addNode(GraphNode newNode) {
        adjacencyList.add(new GraphNode<T>(newNode));
        return newNode;
    }

    // AddEdge() ==================================================
        // Adds a new edge between two nodes in the graph
        // Include the ability to have a “weight”
        // Takes in the two nodes to be connected by the edge
        // Both nodes should already be in the Graph

    public void addEdge(GraphNode graphNode1, GraphNode graphNode2, int weight) {
        if (setOfGraphNodes.containsGraphNode(graphNode1) && setOfGraphNodes.containsGraphNode(graphNode2)) {// Add the edge
            GraphNode<T> node1 = getGraphNode(graphNode1);
            GraphNode<T> node2 = getGraphNode(graphNode2);
            return node1.addEdge(node2, weight);
        } else {
            throw new RuntimeException("GraphNode does not exist");
        }

    }

    // GetNodes() ==================================================
        // Returns all of the nodes in the graph as a collection (set, list, or similar)

    public Set<GraphNode> getNodes() {
        Set<GraphNode> setOfGraphNodes = null;

        return setOfGraphNodes;
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
