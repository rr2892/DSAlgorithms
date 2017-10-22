package selectionsort;

public class Algo {

    public static void main(String[] args){

        int[] A = {5,2,3,6,6,5,8,1,7,4};
        A = selectionSort(A);
        for(int i = 0; i < A.length; i++)
            System.out.print(A[i] + " ");
    }

    public static int[] selectionSort(int[] A){
        for(int i = 0; i < A.length; i++){
            int minIndex = i;

            for(int j = i+1; j < A.length; j++)
                if(A[j] < A[minIndex])
                    minIndex = j;

            int temp = A[i];
            A[i] = A[minIndex];
            A[minIndex] = temp;
        }

        return A;
    }
}
