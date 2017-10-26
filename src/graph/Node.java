package graph;

import java.util.HashSet;
import java.util.Set;

public class Node {

    int data;
    Set<Node> adjacents;

    public Node(int data){
        this.data = data;
        adjacents = new HashSet<Node>();
    }

    public boolean addAdjacent(Node n){
        return adjacents.add(n);
    }
}
