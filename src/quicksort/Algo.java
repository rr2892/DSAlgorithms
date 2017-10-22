package quicksort;

import java.util.Arrays;

public class Algo {

    public static void main(String[] args){

        int[] A = {7,8,6,2,4,3,5};
        quickSort(A, 0, A.length-1);
        System.out.println("\nFinal Array:");
        printArray(A);
    }

    public static void quickSort(int[] A, int p, int r){
        if(p < r){
            int q = partition(A, p, r);
            quickSort(A, p, q-1);
            quickSort(A, q+1, r);
        }
    }

    public static int partition(int[] A, int p, int r){
        int pivot = A[r];
        int i = p-1;
        System.out.println("This partition: Pivot = " + pivot);

        for(int j = p; j <= r; j++) {
            if (A[j] <= pivot) {
                int temp = A[++i];
                A[i] = A[j];
                A[j] = temp;
            }
            printArray(A);
        }

        return i;

    }

    public static void printArray(int[] A){
        System.out.println(Arrays.toString(A));
    }



}

