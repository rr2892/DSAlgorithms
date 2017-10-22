package singlylinkedlist;

public class LinkedList {

    private Node head;
    private int size;

    public LinkedList(){
        size = 0;
    }

    public LinkedList(Node head){
        size = 1;
        this.head = head;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        if(head != null) {
            Node tail = head;
            while (tail.next != null) tail = tail.next;
            tail.next = node;
        }else head = node;
        size++;
    }

    public Node deleteFirst(){
        Node temp = head;
        head = head.next;
        return temp;
    }

    public Node deleteLast(){
        Node tail = head;
        Node prev = head;
        while(tail.next != null){
            prev = tail;
            tail = tail.next;
        }

        if(prev == head) prev.next = null;
        else head = null;

        return tail;
    }

    public int getSize() { return size; }

    public String toString() {
        String str = "HEAD [ ";
        Node node = head;
        while(node != null){
            str += node.toString() + " ";
            node = node.next;
        }
        return str + "] TAIL \nSize: " + size;
    }

}

