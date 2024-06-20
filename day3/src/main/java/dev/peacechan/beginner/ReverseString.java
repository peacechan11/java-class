package dev.peacechan.beginner;

import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str= sc.nextLine();
        System.out.println("Reverse of a given string is "+ reverseString(str));
    }
}
