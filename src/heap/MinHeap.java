package heap;

import java.util.ArrayList;

public class MinHeap {
    ArrayList<Integer> data;
    int size;

    public MinHeap(){
        data = new ArrayList<Integer>();
        size = 0;
    }
    
    public void insert(int value){
        data.add(value);
        int childIndex = size;
        size++;
        shiftUp(childIndex);
    }

    public int extractMin(){
        --size;
        int min = data.get(0);
        data.set(0, data.get(size));
        data.remove(size);
        shiftDown(0);
        return min;
    }
    
    private void shiftUp(int childIndex){
        if(childIndex == 0) return;

        int parentIndex = getParent(childIndex);

        if(data.get(childIndex) < data.get(parentIndex)){
            int temp = data.get(childIndex);
            data.set(childIndex, data.get(parentIndex));
            data.set(parentIndex, temp);
            shiftUp(parentIndex);
        }
    }

    private void shiftDown(int parentIndex){
        int leftIndex = getLeft(parentIndex);
        int rightIndex = getRight(parentIndex);

        if(leftIndex < size && rightIndex >= size && data.get(parentIndex) > data.get(leftIndex))
            swapDown(parentIndex, leftIndex);
        else if(rightIndex < size && leftIndex >= size && data.get(parentIndex) < data.get(rightIndex))
            swapDown(parentIndex, rightIndex);
        else if(leftIndex < size && rightIndex < size)
            if(data.get(parentIndex) > data.get(leftIndex) && data.get(parentIndex) > data.get(rightIndex))
                if(data.get(leftIndex) < data.get(rightIndex))
                    swapDown(parentIndex, leftIndex);
                else
                    swapDown(parentIndex, rightIndex);
            else if(data.get(parentIndex) > data.get(leftIndex))
                swapDown(parentIndex, leftIndex);
            else if(data.get(parentIndex) > data.get(rightIndex))
                swapDown(parentIndex, rightIndex);
    }

    private void swapDown(int parentIndex, int childIndex){
        int temp = data.get(parentIndex);
        data.set(parentIndex, data.get(childIndex));
        data.set(childIndex, temp);
        shiftDown(childIndex);
    }
    
    private int getLeft(int parentIndex){
        return 2 * parentIndex + 1;
    }
    
    private int getRight(int parentIndex){
        return 2 * parentIndex + 2;
    }
    
    private int getParent(int childIndex){
        return (childIndex - 1) / 2;
    }

    public void printHeap(){
        System.out.println(data.toString());
    }
}
