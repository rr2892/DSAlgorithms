package linearsearch;

public class Algo {
    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(a[linearSearch(a, 7)]);
    }

    public static int linearSearch(int[] a, int x){
        for(int i = 0; i < a.length; i++)
            if(a[i] == x)
                return i;
        return -1;
    }
}
