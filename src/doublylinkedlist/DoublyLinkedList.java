package doublylinkedlist;

public class DoublyLinkedList {

    private Node first;
    private Node last;

    public DoublyLinkedList(){
        first = null;
        last = null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) last = newNode;
        else{
            newNode.next = first;
            first.previous = newNode;
        }

        first = newNode;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public void insertLast(int data){
        Node newNode = new Node(data);

        if(isEmpty()) first = newNode;
        else {
            last.next = newNode;
            newNode.previous = last;
        }

        last = newNode;
    }

    public boolean insertAfter(int key, int data){
        Node keyNode = first;
        while(keyNode.data != key){
            keyNode = keyNode.next;
            if(keyNode == null) return false;
        }

        Node newNode = new Node(data);

        if(keyNode == last) last = newNode;
        else{
            newNode.next = keyNode.next;
            keyNode.next.previous = newNode;
        }

        keyNode.next = newNode;
        newNode.previous = keyNode;
        return true;
    }

    public Node deleteFirst(){
        Node temp = first;

        first = first.next;

        // If first is now null that means that first had no next element on the previous line and the list is empty.
        // Indicate this fully by setting last to null.
        if(first == null) last = null;
        else first.previous = null;

        return temp;
    }

    public Node deleteLast(){
        Node temp = last;

        last = last.previous;

        if(last == null) first = null;
        else last.next = null;

        return temp;
    }

    public Node deleteKey(int key){
        Node keyNode = first;
        while(keyNode.data != key){
            keyNode = keyNode.next;
            if(keyNode == null) return null;
        }

        if(keyNode == first) deleteFirst();
        else if(keyNode == last) deleteLast();

        keyNode.previous.next = keyNode.next;
        keyNode.next.previous = keyNode.previous;
        return keyNode;
    }

    public void displayForward(){
        String str = "FIRST [ ";
        Node node = first;
        int size = 0;
        while(node != null){
            str += node.toString() + " ";
            node = node.next;
            size++;
        }
        str += "] LAST \nSize: " + size;
        System.out.println(str);
    }

    public void displayBackward(){
        String str = "LAST [ ";
        Node node = last;
        int size = 0;
        while(node != null){
            str += node.toString() + " ";
            node = node.previous;
            size++;
        }
        str += "] FIRST \nSize: " + size;
        System.out.println(str);
    }
}

