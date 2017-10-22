package stack;

public class Stack{

    private int maxSize;
    private int[] data;
    private int top;

    public Stack(int maxSize){
        this.maxSize = maxSize;
        this.data = new int[maxSize];
        this.top = -1;
    }

    // O(1). Worst Case O(N) if resizing is necessary
    public void push(int l){
        if(isFull()){
            maxSize *= 2;
            int[] resized = new int[maxSize];
            for(int i = 0; i < data.length; i++)
                resized[i] = data[i];
            data = resized;
        }
        data[++top] = l;
    }

    // O(1)
    public int pop(){
        if(!isEmpty())
            return data[top--];
        else{
            System.out.println("\nThis stack is empty.");
            return '?';
        }
    }

    // O(1)
    public int peek(){
        if(!isEmpty())
            return data[top];
        else{
            System.out.println("\nThis stack is empty.");
            return '?';
        }
    }

    // O(1)
    public boolean isEmpty(){
        return (top == -1);
    }

    // O(1)
    public boolean isFull(){
        return (top == maxSize-1);
    }

    public String toString(){
        String str = "\nTOP [ ";
        for(int i = top; i >= 0; i--)
            str += data[i] + " ";
        str += "] BOTTOM \n";
        str += "Number of elements: " + (top+1) + "\tMax size: " + maxSize;
        return str;
    }


}
