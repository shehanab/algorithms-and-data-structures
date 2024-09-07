package graph;

import java.util.LinkedList;

public class Node {

    LinkedList<Node> neighbors = new LinkedList<>();

    private int id;

    public Node(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LinkedList<Node> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(LinkedList<Node> neighbors) {
        this.neighbors = neighbors;
    }

}
