package graph;

import java.util.ArrayList;

public class LinkedGraph {

    private class Node{
        String name;
        ArrayList<Node> edges;

        public Node(String name){
            this.name = name;
            edges = new ArrayList<Node>();
        }
    }

    private ArrayList<Node> vertices;
    private boolean directed;

    public LinkedGraph(boolean directed){
        vertices = new ArrayList<Node>();
        this.directed = directed;
    }

    public void addVertex(String name){
        vertices.add(new Node(name));
    }

    public void addEdge(String name1, String name2){
        int i1 = getIndex(name1);
        int i2 = getIndex(name2);
        if(i1 != -1 && i2 != -1) {
            Node n1 = vertices.get(i1);
            Node n2 = vertices.get(i2);
            n1.edges.add(n2);

            if(!directed)
                n2.edges.add(n1);
        }
        else System.out.println("Vertex not found");

    }

    private int getIndex(String name){
        for(int i = 0; i < vertices.size(); i++)
            if(vertices.get(i).name.equals(name))
                return i;

        return -1;
    }

    public void print(){
        for(int i = 0; i < vertices.size(); i++) {
            System.out.print("\n" + vertices.get(i).name);
            for (int j = 0; j < vertices.get(i).edges.size(); j++)
                System.out.print(" --> " + vertices.get(i).edges.get(j).name);
            System.out.println();
        }
    }


}