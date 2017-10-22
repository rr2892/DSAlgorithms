package binarysearch;

public class Algo {

    public static void main(String[] args){

        int[] a = {1,3,4,5,7,9,11,34,45,46,48,51,53,59,63,68,72,92,97,99};
        System.out.println(binarySearch(a, 92));

    }

    public static int binarySearch(int[] a, int x){
        int p = 0;
        int r = a.length - 1;

        while(p <= r){
            int q = (p + r) / 2;

            if(x < a[q])
                r = q - 1;
            else if(x > a[q])
                p = q + 1;
            else
                return q;
        }

        return -1;
    }

    public static int binarySearchVerbose(int[] a, int x){
        int p = 0;
        int r = a.length - 1;

        System.out.println("\nInitial Array, a");
        printArray(a, p, r);
        System.out.println("Request: Find index q where a[q] = " + x);

        while(p <= r){
            System.out.println("\np: " + p + "\tr: " + r);
            printArray(a, p, r);

            int q = (p + r) / 2;

            System.out.println("q: " + q + "\tGuess (a[q]): " + a[q]);

            if(x == a[q])
                return q;

            if(x < a[q])
                r = q - 1;
            else
                p = q + 1;
        }

        return -1;
    }

    public static void printArray(int[] a, int fromIndex, int toIndex){
        String array = "[ ";
        for(int i = fromIndex; i <= toIndex; i++)
            array += a[i] + " ";
        array += "]";

        System.out.println(array);


    }


}
