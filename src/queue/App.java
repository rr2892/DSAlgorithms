package queue;

public class App {

    public static void main(String[] args){

        Queue line = new Queue(10);

        System.out.println(line.toString(true));

        line.enqueue(1);
        line.enqueue(2);
        line.enqueue(3);
        line.enqueue(4);
        System.out.println(line.toString(true));

        line.dequeue();
        line.dequeue();
        line.dequeue();
        System.out.println(line.toString(true));
        line.dequeue();
        System.out.println(line.toString(true));

        line.dequeue();

        while(!line.isFull()) {
            line.enqueue(2);
            System.out.println(line.toString(true));
        }

        System.out.println(line.toString(true));

        line.enqueue(3);

        System.out.println(line.toString(true));



    }
}
