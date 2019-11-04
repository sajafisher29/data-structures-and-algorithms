package code401challenges.graph;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class GraphTest {

    Graph<String> graph;

    @Before
    public void setUp() throws Exception {
        graph = new Graph<>();
    }

    // Test Node successfully added to graph
    @Test
    public void testOneNodeAddedToGraph() {
        GraphNode<String> newNode = graph.addNode("Ginger");

        Set<GraphNode<String>> setOfAllNodes = graph.getNodes();

        assertTrue(setOfAllNodes.contains(newNode));
    }

    // Test multiple Nodes successfully added to graph
    @Test
    public void testMultipleNodesAddedToGraph() {
        GraphNode<String> newNodeGinger = graph.addNode("Ginger");
        GraphNode<String> newNodeMilo = graph.addNode("Milo");
        GraphNode<String> newNodeKimber = graph.addNode("Kimber");
        GraphNode<String> newNodeTater = graph.addNode("Tater");
        GraphNode<String> newNodeBailey = graph.addNode("Bailey");

        Set<GraphNode<String>> setOfAllNodes = graph.getNodes();

        assertTrue(setOfAllNodes.contains(newNodeGinger));
        assertTrue(setOfAllNodes.contains(newNodeMilo));
        assertTrue(setOfAllNodes.contains(newNodeKimber));
        assertTrue(setOfAllNodes.contains(newNodeTater));
        assertTrue(setOfAllNodes.contains(newNodeBailey));
    }

    // Test Unidirectional Edge successfully added to graph
    @Test
    public void testAddOneUnidirectionalEdge() {
        GraphNode<String> Ginger = graph.addNode("Ginger");
        GraphNode<String> Milo = graph.addNode("Milo");
        GraphEdge edge = graph.addEdge(Ginger, Milo);

        List<GraphEdge<String>> listOfEdgesGinger = graph.getNeighbors(Ginger);
        List<GraphEdge<String>> listOfEdgesMilo = graph.getNeighbors(Milo);

        // Ginger points to Milo but Milo does not point to Ginger
        assertTrue(listOfEdgesGinger.contains(edge));
        assertNull(listOfEdgesMilo);
        assertEquals(Milo, edge.getConnectedNode());
    }

    // Test Bidirectional Edge successfully added to graph
    @Test
    public void testAddBidirectionalEdge() {
        GraphNode<String> Ginger = graph.addNode("Ginger");
        GraphNode<String> Milo = graph.addNode("Milo");
        GraphEdge edgeGingerToMilo = graph.addEdge(Ginger, Milo);
        GraphEdge edgeMiloToGinger = graph.addEdge(Milo, Ginger);

        List<GraphEdge<String>> listOfEdgesGinger = graph.getNeighbors(Ginger);
        List<GraphEdge<String>> listOfEdgesMilo = graph.getNeighbors(Milo);

        // Ginger points to Milo but Milo does not point to Ginger
        assertTrue(listOfEdgesGinger.contains(edgeGingerToMilo));
        assertTrue(listOfEdgesMilo.contains(edgeMiloToGinger));
    }

    // Test Unidirectional Edge successfully added to graph
    @Test
    public void testAddOneUnidirectionalEdgeWithWeight() {
        GraphNode<String> Ginger = graph.addNode("Ginger");
        GraphNode<String> Milo = graph.addNode("Milo");
        GraphEdge edge = graph.addEdge(Ginger, Milo, 2);

        List<GraphEdge<String>> listOfEdgesGinger = graph.getNeighbors(Ginger);
        List<GraphEdge<String>> listOfEdgesMilo = graph.getNeighbors(Milo);

        // Ginger points to Milo but Milo does not point to Ginger and has a weight of 2
        assertTrue(listOfEdgesGinger.contains(edge));
        assertNull(listOfEdgesMilo);
        assertEquals(Milo, edge.getConnectedNode());
        assertEquals(2, edge.getWeight());
    }

    // Test for exception if one of the declared nodes for edge does not exist
    @Test(expected = IllegalArgumentException.class)
    public void testAddEdgeWithNodeThatHasNotAddedToGraph() {
        GraphNode<String> Ginger = graph.addNode("Ginger is in the graph");
        GraphNode<String> Milo = new GraphNode<>("Milo would be too hyper for school");

        graph.addEdge(Ginger, Milo);
    }

    // Test for exception if declared nodes for edge does not exist
    @Test(expected = IllegalArgumentException.class)
    public void testAddEdgeBetweenNodesThatHaveNotAddedToGraph() {
        GraphNode<String> Milo = new GraphNode<>("Milo would be too hyper for school");
        GraphNode<String> Kimber = new GraphNode<>("Kimber would try to eat everyone before passing out from the stress");

        graph.addEdge(Milo, Kimber);
    }

    // Test return all nodes as Set<GraphNode>
    @Test
    public void testReturnAllNodesAsSet() {
        GraphNode<String> newNodeGinger = graph.addNode("Ginger");
        GraphNode<String> newNodeMilo = graph.addNode("Milo");
        GraphNode<String> newNodeKimber = graph.addNode("Kimber");
        GraphNode<String> newNodeTater = graph.addNode("Tater");
        GraphNode<String> newNodeBailey = graph.addNode("Bailey");

        Set<GraphNode<String>> setOfAllNodes = graph.getNodes();

        assertEquals(setOfAllNodes.toString(),"Ginger Milo Kimber Tater Bailey", "Ginger Milo Kimber Tater Bailey");
    }

    // Test return all neighbor nodes as Set<GraphNode>
    @Test
    public void testAllNeighbors() {

    }

    // Test return of null for a node with no neighbors
    @Test
    public void testNoNeighbors() {
        GraphNode<String> lonely = graph.addNode("one");
        assertNull(graph.getNeighbors(lonely));
    }

    // Test return of neighbors with the correct weights included


    // Test correct size of graph is returned (total number of nodes)
    @Test
    public void testCorrectSize() {
        GraphNode<String> newNodeGinger = graph.addNode("Ginger");
        GraphNode<String> newNodeMilo = graph.addNode("Milo");
        GraphNode<String> newNodeKimber = graph.addNode("Kimber");
        GraphNode<String> newNodeTater = graph.addNode("Tater");
        GraphNode<String> newNodeBailey = graph.addNode("Bailey");

        assertEquals(5, graph.size());
    }

    // Test returning graph with one node and edge


    // Test empty graph returns null
    @Test
    public void testEmptyGraphNodes() {
        assertNull(graph.getNodes());
    }

    // Test empty graph size returns zero
    @Test
    public void testEmptyGraphSize() {
        assertEquals(null, graph.getNodes());
    }

}