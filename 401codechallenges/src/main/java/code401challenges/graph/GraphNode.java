package code401challenges.graph;

import java.util.List;
import java.util.Set;

public class GraphNode<T> {

    private T value;
    private List<GraphEdge<T>> neighbors;
    private boolean visited = false;

    public GraphNode() {}

    public GraphNode(T value, List<GraphEdge<T>> neighbors) {
        this.value = value;
        this.neighbors = neighbors;
    }

    GraphNode(GraphNode newNode) {}

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public List<GraphEdge<T>> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<GraphEdge<T>> neighbors) {
        this.neighbors = neighbors;
    }

    public void addNeighbor(GraphEdge edge) {
        if (this.neighbors.contains(edge)) {
            System.out.println("This edge has already been used for this node.");
        } else {
            System.out.println("Successfully added " + edge);
            this.neighbors.add(edge);
        }
    }

    // GetNeighbors() ==============================================
        // Returns a collection of nodes connected to the given node
        // Takes in a given node
        // Include the weight of the connection in the returned collection

    public Set<GraphNode> getNeighbors(GraphNode graphNode) {
        Set<GraphNode> setOfNeighbors = null;

        for (int i = 0; i < this.neighbors.size(); i++ ){
            setOfNeighbors.add(neighbors.get(i).getConnectedNode());
        }

        return setOfNeighbors;
    }

    boolean isVisited() {
        return visited;
    }

}
