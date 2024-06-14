package dev.peacechan.number;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int input = sc.nextInt();

        sumUsingForLoop(input);
        sumUsingWhileLoop(input);
    }

    public static void sumUsingForLoop(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum using for loop: " + sum);
    }

    public static void sumUsingWhileLoop(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum using while loop: " + sum);
    }
}
