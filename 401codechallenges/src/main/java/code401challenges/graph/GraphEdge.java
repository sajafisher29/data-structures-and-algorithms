package code401challenges.graph;

public class GraphEdge<T> {

    public GraphNode<T> connectedNode;
    int weight;

    public GraphEdge(GraphNode<T> connectedNode) {
        this.connectedNode = connectedNode;
        this.weight = 0;
    }

    public GraphEdge(GraphNode<T> connectedNode, int weight) {
        this.connectedNode = connectedNode;
        this.weight = weight;
    }

    public GraphNode<T> getConnectedNode() {
        return connectedNode;
    }

    public void setConnectedNode(GraphNode<T> connectedNode) {
        this.connectedNode = connectedNode;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
