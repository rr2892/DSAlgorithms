package circularlinkedlist;

public class CircularLinkedList {

    private Node first;
    private Node last;

    public CircularLinkedList(){
        first = null;
        last = null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) last = newNode;
        else newNode.next = first;

        first = newNode;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public void insertLast(int data){
        Node newNode = new Node(data);

        if(isEmpty()) first = newNode;
        else last.next = newNode;

        last = newNode;
    }

    public int deleteFirst(){
        int temp = first.data;

        first = first.next;

        // If first is now null that means that first had no next element on the previous line and the list is empty.
        // Indicate this fully by setting last to null.
        if(first == null) last = null;

        return temp;
    }

    public String toString(){
        String str = "FIRST [ ";
        Node node = first;
        int size = 0;
        while(node != null){
            str += node.toString() + " ";
            node = node.next;
            size++;
        }
        return str + "] LAST \nSize: " + size;
    }

}
