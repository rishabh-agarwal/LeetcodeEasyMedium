package org.question.pratice;

public class Fibonacci {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Fibonacci sequence up to " + num + " terms:");
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
