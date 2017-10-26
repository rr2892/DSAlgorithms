package dynamicprogramming;

public class Fibonacci {

    public static void main(String[] args){
        System.out.println(fibonacciDP(3));
        System.out.println(fibonacciDP(10));
        System.out.println(fibonacciDP(4000));
    }



    static int fibonacciRecursive(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    static int fibonacciDP(int n){
        return fibonacciDPHelper(n, new int[n+1]);
    }

    static int fibonacciDPHelper(int n, int[] cached){
        if(n == 0) return 0;
        if(n == 1) return 1;

        if(cached[n] == 0)
            cached[n] = fibonacciDPHelper(n-1, cached) + fibonacciDPHelper(n-2, cached);

        return cached[n];

    }

}
