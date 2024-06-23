package dev.peacechan.intermediate;

import java.util.Scanner;

public class PalindromeCheck {
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }

        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        return isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        String input = sc.nextLine();
        System.out.println();
        System.out.println("Output : " + isPalindrome(input));
    }
}
