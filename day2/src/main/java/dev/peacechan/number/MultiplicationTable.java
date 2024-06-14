package dev.peacechan.number;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int input = sc.nextInt();

        printMultiplicationTable(input);
    }
    public static void printMultiplicationTable(int n) {
        System.out.println("Multiplication Table : ");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + " x " + j + " = " + i * j + "\t");
            }
            System.out.println();
        }
    }
}
