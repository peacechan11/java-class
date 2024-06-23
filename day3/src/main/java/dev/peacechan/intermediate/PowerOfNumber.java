package dev.peacechan.intermediate;

import java.util.Scanner;

public class PowerOfNumber {
    public static  double power(double base, int exponent)
    {
        if (exponent == 0)     //Base Condition
            return 1;
        return (base * power (base, exponent - 1));
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter base : ");
        int base= sc.nextInt();
        System.out.println();
        System.out.print("Enter exponent : ");
        int exponent= sc.nextInt();
        System.out.println(base+ " power of "+exponent+" is "+power(base,exponent));
    }
}
