package singlylinkedlist;

public class Node {

    public int value;
    public Node next;

    public Node(int value){
        this.value = value;
    }

    public String toString(){
        return "{" + value + "}";
    }
}
