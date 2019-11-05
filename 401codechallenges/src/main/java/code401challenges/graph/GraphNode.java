package code401challenges.graph;

import java.util.LinkedList;
import java.util.List;

public class GraphNode<T> {

    public T value;
    public List<GraphEdge<T>> neighbors;

    public GraphNode(T value) {
        this.value = value;
        this.neighbors = new LinkedList<>();
    }

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

    public void addNeighbor(GraphEdge<T> neighbor) {
        this.neighbors.add(neighbor);
    }



}
