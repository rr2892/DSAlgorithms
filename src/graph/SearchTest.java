package graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class SearchTest {

    public static void main(String[] args){
        Node[] nodes = new Node[10];
        for(int i = 0; i < nodes.length; i++)
            nodes[i] = new Node(i);

        nodes[0].addAdjacent(nodes[1]);
        nodes[0].addAdjacent(nodes[2]);
        nodes[0].addAdjacent(nodes[3]);
        nodes[0].addAdjacent(nodes[4]);
        nodes[0].addAdjacent(nodes[5]);
        nodes[3].addAdjacent(nodes[5]);
        nodes[4].addAdjacent(nodes[9]);
        nodes[5].addAdjacent(nodes[8]);
        nodes[3].addAdjacent(nodes[6]);
        nodes[6].addAdjacent(nodes[5]);
        nodes[6].addAdjacent(nodes[7]);
        nodes[7].addAdjacent(nodes[9]);
        nodes[7].addAdjacent(nodes[8]);
        nodes[8].addAdjacent(nodes[6]);

        System.out.println(pathExists(nodes[0], nodes[7]));
        System.out.println(pathExists(nodes[4], nodes[9]));
        System.out.println(pathExists(nodes[4], nodes[8]));

        depthFirstTraversal(nodes[0]);
        breadthFirstTraversal(nodes[0]);

        System.out.println(pathExistsBreadthFirst(nodes[0], nodes[7]));
        System.out.println(pathExistsBreadthFirst(nodes[4], nodes[9]));
        System.out.println(pathExistsBreadthFirst(nodes[4], nodes[8]));
    }

    static void depthFirstTraversal(Node n){
        Set<Node> visited = new HashSet<Node>();
        depthFirstTraversalHelper(n, visited);
    }

    static void depthFirstTraversalHelper(Node n, Set<Node> visited){
        if(n == null) return;
        visit(n);
        visited.add(n);
        for(Node adj : n.adjacents){
            if(!visited.contains(adj)){
                depthFirstTraversalHelper(adj, visited);
            }
        }
    }

    static void visit(Node n){
        System.out.print(n.data + " ");
    }

    static void breadthFirstTraversal(Node start){
        Queue<Node> queue = new LinkedList<Node>();
        Set<Node> visited = new HashSet<Node>();
        queue.add(start);
        visited.add(start);

        while(!queue.isEmpty()){
            Node n = queue.remove();
            visit(n);

            for(Node adj : n.adjacents) {
                if (!visited.contains(adj)) {
                    queue.add(adj);
                    visited.add(adj);
                }
            }
        }
    }

    static boolean pathExistsBreadthFirst(Node start, Node end){
        Queue<Node> queue = new LinkedList<Node>();
        Set<Node> visited = new HashSet<Node>();
        queue.add(start);
        visited.add(start);

        while(!queue.isEmpty()){
            Node n = queue.remove();
            if(n == end)
                return true;

            for(Node adj : n.adjacents) {
                if(adj == end)
                    return true;
                else if (visited.add(adj)) {
                    queue.add(adj);
                }
            }
        }

        return false;

    }

    static boolean pathExists(Node n1, Node n2){

        Queue<Node> q1 = new LinkedList<Node>();
        Queue<Node> q2 = new LinkedList<Node>();
        Set<Node> visited1 = new HashSet<Node>();
        Set<Node> visited2 = new HashSet<Node>();

        q1.add(n1);
        q2.add(n2);
        visited1.add(n1);
        visited2.add(n2);

        while(!q1.isEmpty() && !q2.isEmpty()){
            if(pathExistsHelper(q1, visited1, visited2)){
                return true;
            }
            if(pathExistsHelper(q2, visited2, visited1)){
                return true;
            }
        }

        return false;
    }

    static boolean pathExistsHelper(Queue<Node> queue, Set<Node> visited1, Set<Node> visited2){
        if(!queue.isEmpty()){
            Node n = queue.remove();
            for(Node adj : n.adjacents){
                if(visited2.contains(adj)){
                    return true;
                }else if(visited1.add(adj)){
                    queue.add(adj);
                }
            }
        }
        return false;
    }
}
