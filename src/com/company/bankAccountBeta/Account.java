package com.company.bankAccountBeta;

public class Account {
    private double balance = 0;
    private static double interestRate;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount >= 0) {
            if (amount > balance) {
                System.out.println("Operacja nie możliwa poniważ na koncie nie ma tyle pieniędzy");
            } else {
                balance -= amount;
            }
        }
    }

    public void transfer(Account account, double amount) {
        if (this.getBalance() > amount) {
            this.withdraw(amount);
            account.deposit(amount);
        }
    }

    public void addInterest() {
        balance += balance * interestRate / 100;
    }

    public static void setInterestRate(double amount) {
        if (amount >= 0) interestRate = amount;
    }

}
