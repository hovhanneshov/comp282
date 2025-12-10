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
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    // Task 4: recursive sum of an array (use the helper below)
    public static long sumArray(int[] data) {
        // TODO: implement Task 4
        if(data == null)
            throw new IllegalArgumentException("data must not be null");
        if(data.length == 0)
            return 0;
        return sumArrayFromIndex(data, 0);
    }

    // Helper for Task 4
    private static long sumArrayFromIndex(int[] data, int index) {
        // TODO: implement Task 4 helper
        if(index == data.length)
            return 0;
        return data[index] + sumArrayFromIndex(data, index+1);
    }

    // Task 5: recursive string reverse
    public static String reverse(String s) {
        // TODO: implement Task 5
        if(s == null)
            return null;
        if(s.length() <= 1)
            return s;
        return s.substring(s.length()-1) + reverse(s.substring(0, s.length()-1));
    }

    // Added main method to test the tasks
    public static void main(String[] args) {
        // Task 1
        System.out.print("\nPrinting factorial of 0: " + factorialRecursive(0));
        //System.out.print("\nPrinting factorial of -1: " + factorialRecursive(-1));
        System.out.print("\nPrinting factorial of 5: " + factorialRecursive(5));

        // Task 2
        System.out.print("\nPrinting factorial of 0: " + factorialIterative(0));
        //System.out.print("\nPrinting factorial of -1: " + factorialIterative(-1));
        System.out.print("\nPrinting factorial of 5: " + factorialIterative(5));

        // Task 3
        System.out.print("\nPrinting Fibonacci of 0: " + fibonacciRecursive(0));
        //System.out.print("\nPrinting Fibonacci of -1: " + fibonacciRecursive(-1));
        System.out.print("\nPrinting Fibonacci of 2: " + fibonacciRecursive(2));

        // Task 4
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = new int[0];
        int[] arr3 = null;
        System.out.print("\nPrinting the sum of arr1: " + sumArray(arr1));
        System.out.print("\nPrinting the sum of arr2: " + sumArray(arr2));
        //System.out.println("\nPrinting the sum of arr3: " + sumArray(arr3));

        // Task 5
        String s1 = "cat";
        String s2 = null;
        System.out.print("\nPrinting " + s1 + " backwards: " +reverse(s1));
        //System.out.print("\nPrinting " + s2 + " backwards: " +reverse(s2));
    }
}
