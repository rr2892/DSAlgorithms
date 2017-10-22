package circularlinkedlist;

public class App {

    public static void main(String[] args){
        CircularLinkedList mylist = new CircularLinkedList();
        mylist.insertFirst(100);
        mylist.insertFirst(50);
        mylist.insertFirst(99);
        mylist.insertFirst(88);
        mylist.insertLast(9999999);

        System.out.println(mylist.toString());

        CircularLinkedList myList2 = new CircularLinkedList();
        myList2.insertLast(24);
        myList2.insertLast(10);

        System.out.println(myList2.toString());
    }
}

