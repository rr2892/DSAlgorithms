package mergesort;

public class Algo {

    public static void main(String[] args){

        int[] inputArray = { 9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0 };

        mergeSort(inputArray, 0, inputArray.length-1);

        for(int i = 0; i < inputArray.length; i++){
            System.out.println(inputArray[i]);
        }
    }


    public static void mergeSort(int[] A, int p, int r){
        if(p < r){
            int q = (p + r) / 2;
            mergeSort(A, p, q);
            mergeSort(A, q+1, r);
            merge(A, p, q, r);
        }
    }

    public static void merge(int[] A, int p, int q, int r){
        int[] temp = new int[A.length];
        for(int i = 0; i < A.length; i++)
            temp[i] = A[i];

        int i = p;
        int j = q+1;
        int k = p;

        while(i <= q && j <= r)
            if(temp[i] < temp[j])
                A[k++] = temp[i++];
            else
                A[k++] = temp[j++];

        while(i <= q)
            A[k++] = temp[i++];

        while(j <= r)
            A[k++] = temp[j++];
    }

}
