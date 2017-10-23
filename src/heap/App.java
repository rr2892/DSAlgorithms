package heap;

public class App {
    public static void main(String[] args){
        MinHeap heap = new MinHeap();
        int[] nums = {4,7,50,87,55,90};
        for(int i = 0; i < nums.length; i++)
            heap.insert(nums[i]);

        heap.printHeap();

        heap.insert(2);

        heap.printHeap();

        System.out.println(heap.extractMin());

        heap.printHeap();
    }
}
