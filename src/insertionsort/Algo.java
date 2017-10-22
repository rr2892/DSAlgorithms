package insertionsort;

public class Algo {

    public static void main(String[] args){
        int[] A = {2,4,6,3,5,76,5,8,0,345,89,20};
        A = insertionSort(A);
        for(int i = 0; i < A.length; i++)
            System.out.print(A[i] + " ");
    }

    public static int[] insertionSort(int[] A){
        for(int i = 1; i < A.length; i++){
            int j = i - 1;
            int element = A[i];

            while(j >= 0 && A[j] > element){
                A[j+1] = A[j];
                j--;
            }

            A[j+1] = element;
        }

        return A;
    }
}
