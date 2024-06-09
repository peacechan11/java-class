package dev.peacechan.day1;

public class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            System.out.println(
                    "Invalid Initial Balance \nYou can't create bank account \nBye....");
            System.exit(0);
        } else {
            this.balance = initialBalance;
        }
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Invalid Deposit Amount");
        } else {
            balance += amount;
            System.out.println("Depositing $" + amount + "...");
        }
    }
    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Invalid Withdraw Amount");
        } else if (amount > balance) {
            System.out.println("Your account balance is insufficient");
        } else {
            balance -= amount;
            System.out.println("Withdrawing $" + amount + "...");
        }
    }
}
