package graph;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {

    Graph graph;

    @Before
    public void setUp() throws Exception {
        graph = new Graph();
    }

    @Test
    public void testAddNode() {
        graph.addNode(10);
        assertNotNull(graph.getNode(10));
    }


    @Test
    public void testAddEdge() {
        Graph graph = new Graph();
        graph.addNode(1);
        graph.addNode(2);
        graph.addEdge(1, 2);

        Node node1 = graph.getNode(1);
        assertTrue(node1.getNeighbors().contains(graph.getNode(2)));
    }

    @Test
    public void testHasPathDFSExists() {
        Graph graph = new Graph();
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        assertTrue(graph.hasPathDFS(1, 2));
        assertTrue(graph.hasPathDFS(1, 3));
    }

    @Test
    public void testHasPathDFSNotExists() {
        Graph graph = new Graph();
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addEdge(1, 2);

        assertFalse(graph.hasPathDFS(1, 3));
    }

    @Test
    public void testHasPathDFSSelfLoop() {
        Graph graph = new Graph();
        graph.addNode(1);
        graph.addEdge(1, 1);

        assertTrue(graph.hasPathDFS(1, 1));
    }

    @Test
    public void testHasPathBFSExists() {
        Graph graph = new Graph();
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        assertTrue(graph.hasPathBFS(1, 2));
        assertTrue(graph.hasPathBFS(1, 3));
    }


}