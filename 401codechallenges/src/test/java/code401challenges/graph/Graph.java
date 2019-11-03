package code401challenges.graph;

import java.util.Set;

public class Graph {

    // AddNode() ==================================================
        //Adds a new node to the graph
        //Takes in the value of that node
        //Returns the added node

    public GraphNode addNode(GraphNode value) {


        return addedGraphNode;
    }

    //AddEdge() ==================================================
        //Adds a new edge between two nodes in the graph
        //Include the ability to have a “weight”
        //Takes in the two nodes to be connected by the edge
        //Both nodes should already be in the Graph

    public void addEdge(GraphNode graphNode1, GraphNode graphNode2) {

    }

    //GetNodes() ==================================================
        //Returns all of the nodes in the graph as a collection (set, list, or similar)

    public Set<GraphNode> getNodes() {


        return setOfGraphNodes;
    }

    //GetNeighbors() ==============================================
        //Returns a collection of nodes connected to the given node
        //Takes in a given node
        //Include the weight of the connection in the returned collection

    public Set<GraphNode> getNeighbors(GraphNode graphNode) {


        return setOfNeighbors;
    }

    //Size() ======================================================
        //Returns the total number of nodes in the graph

    public int size() {
        
        return sizeOfGraph;
    }

}
