package graph;

import java.util.HashMap;
import java.util.HashSet;

public class Graph {

    private HashMap<Integer, Node> nodeLookUp = new HashMap<>();

    public Node getNode(int id) {
        return nodeLookUp.get(id);
    }

    public void addNode(int id) {
        nodeLookUp.put(id, new Node(id));
    }

    public void addEdge(int source, int destination) {
        Node sourceNode = getNode(source);
        Node destinationNode = getNode(destination);

        sourceNode.neighbors.add(destinationNode);

    }
    public boolean hasPathDFS(int source, int destination) {
        Node sourceNode = getNode(source);
        Node destinationNode = getNode(destination);

        HashSet<Integer> visited = new HashSet<>();

        return hasPathDFS(sourceNode, destinationNode, visited);
    }

    private boolean hasPathDFS(Node sourceNode, Node destinationNode, HashSet<Integer> visited) {
        if (visited.contains(sourceNode.getId())) {
            return false;
        }
        visited.add(sourceNode.getId());
        if(sourceNode == destinationNode) {
            return true;
        }

        for (Node child : sourceNode.neighbors) {
            if(hasPathDFS(child, destinationNode, visited)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPathBFS(int source, int destination) {
        Node sourceNode = getNode(source);
        Node destinationNode = getNode(destination);
        HashSet<Integer> visited = new HashSet<>();

        return hasPathBFS(sourceNode, destinationNode, visited);
    }

    private boolean hasPathBFS(Node sourceNode, Node destinationNode, HashSet<Integer> visited) {
        if (visited.contains(sourceNode.getId())) {
            return false;
        }
        visited.add(sourceNode.getId());
        if(sourceNode == destinationNode) {
            return true;
        }
        for (Node child : sourceNode.neighbors) {
            if(hasPathBFS(child, destinationNode, visited)) {
                return true;
            }
        }


        return false;


    }
}
