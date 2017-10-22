package queue;

public class Queue {

    private int maxSize;
    private long[] data;
    private int front;
    private int rear;
    private int size;

    public Queue(int maxSize){
        this.maxSize = maxSize;
        data = new long[maxSize];
        rear = -1;
        front = 0;
        size = 0;
    }

    // O(1) usually, O(log N) if restructuring needed, O(N) if resizing needed
    public void enqueue(long l){
        if(atLimit()){
            if(size < maxSize){
                int index = 0;
                for(int i = front; i <= rear; i++){
                    data[index++] = data[i];
                }
                front = 0;
                rear = size-1;
            }else {
                maxSize *= 2;
                long[] resized = new long[maxSize];
                for (int i = 0; i < data.length; i++)
                    resized[i] = data[i];
                data = resized;
            }
        }
        data[++rear] = l;
        size++;
    }

    // O(1)
    public long dequeue(){
        if(!isEmpty()) {
            size--;
            return data[front++];
        }
        else{
            System.out.println("\nThis queue is empty.");
            return -1;
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == maxSize;
    }

    public boolean atLimit(){
        return rear == maxSize - 1;
    }

    public String toString(boolean showEmptySlots){
        String str = "\nFRONT [ ";

        if(showEmptySlots)
            for(int i = 0; i < front; i++)
                str += "- ";

        for(int i = front; i <= rear; i++)
            str += data[i] + " ";

        if(showEmptySlots)
            for(int i = rear+1; i < maxSize; i++)
                str += "- ";

        str += "] BACK\nIn queue: " + size + "\t\tMax Size: " + maxSize;
        return str;
    }

    public int getSize(){
        return size;
    }
}
