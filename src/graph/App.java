package graph;

public class App {
    public static void main(String[] args){
        LinkedGraph graph = new LinkedGraph(true);

        graph.addVertex("State");
        graph.addVertex("Avenel");
        graph.addVertex("Elm");
        graph.addVertex("Pocono");
        graph.addVertex("William");

        graph.addEdge("Avenel", "Pocono");
        graph.addEdge("State", "Elm");
        graph.addEdge("Elm", "Avenel");
        graph.addEdge("Elm", "William");
        graph.addEdge("William", "State");
        graph.addEdge("William", "Pocono");
        graph.addEdge("Pocono", "Elm");
        graph.addEdge("State", "Avenel");

        graph.print();
    }
}