/*
A simple example of recursion
Calculating the factorial of a number
 */

public class Factorial {

    // Recursive method
    int factorialRecursive (int n){
        int result;

        if (n == 1) return 1;
        result = factorialRecursive(n-1) * n; // Performing a recursive method call
        return result;
    }

    // The iterative equivalent of the recursive method
    int factorialIterative (int n){
        int t, result;
        result = 1;
        for (t = 1;  t <= n; t++) result *= t;
        return result;
    }
}