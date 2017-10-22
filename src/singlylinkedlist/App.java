package singlylinkedlist;

public class App {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        System.out.println(list.toString());

        for (int i = 0; i < 10; i++) {
            list.insertLast(i);
            System.out.println(list.toString());
        }

        list.insertFirst(20);

        System.out.println(list.toString());

        list.insertFirst(40);

        System.out.println(list.toString());



    }
}
