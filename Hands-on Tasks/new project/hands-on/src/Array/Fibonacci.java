package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        
        int[] fibonacciArray = new int[n];

        
        for (int i = 0; i < n; i++) {
            fibonacciArray[i] = fibonacci(i);
        }

        
        System.out.println("First " + n + " Fibonacci numbers: " + Arrays.toString(fibonacciArray));

       
        int nthFibonacci = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number: " + nthFibonacci);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
