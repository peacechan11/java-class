package dev.peacechan.day1;

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00);

        System.out.println("Opening balance: $" + account.getBalance());

        account.deposit(500.00);
        System.out.println("New balance: $" + account.getBalance());

        account.withdraw(200.00);
        System.out.println("New balance: $" + account.getBalance());
    }
}