package recursion;

public class Algo {

    public static void main(String[] args){

        int[] A = {1,2,3,4,5,6,7,8,9,10,11,12,967,4506,11123};

//        System.out.println(linearSearch(A, 3, 967));
//        System.out.println(linearSearch(A, 10, 967));


        System.out.println(binarySearch(A, 0, A.length-1, 967));
        System.out.println(binarySearch(A, 0, A.length-1, 97));

    }

    public static int linearSearch(int[] A, int i, int x){
        if(i >= A.length)
            return -1;
        else if(A[i] == x)
            return i;
        else
            return linearSearch(A, i+1, x);
    }

    public static int binarySearch(int[] A, int startIndex, int endIndex, int x){
        if(startIndex > endIndex)
            return -1;

        int middle = (startIndex + endIndex) / 2;

        if(x == A[middle])
            return middle;
        else if(x > A[middle])
            return binarySearch(A, middle+1, endIndex, x);
        else
            return binarySearch(A, startIndex, middle-1, x);
    }
}

