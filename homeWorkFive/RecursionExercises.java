package recursionexample;

/**
 * Assignment: Recursion mini-tasks.
 *
 * Implement the methods below following the assignment handout.
 * You may add private helper methods if you like.
 */
public class RecursionExercises {

    // Task 1: recursive factorial
    public static long factorialRecursive(int n) {
        // TODO: implement Task 1
        if(n < 0)
            throw new IllegalArgumentException("n must be >= 0");
        if(n <= 1)
            return 1;
        return n * factorialRecursive(n - 1);
    }

    // Task 2: iterative factorial
    public static long factorialIterative(int n) {
        // TODO: implement Task 2
        if(n < 0)
            throw new IllegalArgumentException("n must be >= 0");
        if(n <= 1)
            return 1;
        for(int i = n-1; i > 0; i--) {
            n = n * i;
        }
        return n;
    }

    // Task 3: recursive Fibonacci
    public static long fibonacciRecursive(int n) {
        // TODO: implement Task 3
        if(n < 0)
            throw new IllegalArgumentException("n must be >= 0");
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return fibonacciRecursive(n-1);
    }

    // Task 4: recursive sum of an array (use the helper below)
    public static long sumArray(int[] data) {
        // TODO: implement Task 4
        return 0L;
    }

    // Helper for Task 4
    private static long sumArrayFromIndex(int[] data, int index) {
        // TODO: implement Task 4 helper
        return 0L;
    }

    // Task 5: recursive string reverse
    public static String reverse(String s) {
        // TODO: implement Task 5
        return null;
    }
}
