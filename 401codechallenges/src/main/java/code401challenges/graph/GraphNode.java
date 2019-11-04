package code401challenges.graph;

import java.util.List;

public class GraphNode<T> {

    T value;
    List<GraphEdge<T>> neighbors;
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

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        visited = visited;
    }

}
