package org.niit;

public class Fibonacci {

    public int[] fibonacciNumber(int a) {
        int num1 = 0;
        int num2 = 1;
        int arr[] = new int[a];

        arr[0] = num1;
        arr[1] = num2;

        for (int i = 2; i < a; i++) {
            int num3 = num1 + num2;
            arr[i] = num3;
            num1 = num2;
            num2 = num3;
        }
        return arr;
    }

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        int a[]=fib.fibonacciNumber(10);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }
    }
}
