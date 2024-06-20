package dev.peacechan.beginner;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static int sumOfNaturalNumbers(int n)
    {
        if (n <= 1)
            return n;
        return n + sumOfNaturalNumbers(n - 1);
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num= sc.nextInt();
        System.out.println("Sum of Natural numbers  for given number "+num+" is "+sumOfNaturalNumbers(num));
    }
}
