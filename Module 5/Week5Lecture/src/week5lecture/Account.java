package week5lecture;

import javax.swing.*;
import java.text.NumberFormat;

public class Account {
    private final double RATE = 0.035;  // interest rate of 3.5%

    private long acctNumber;
    private double balance;
    private String name;

    //-----------------------------------------------------------------
    //  Sets up the account by defining its owner, account number,
    //  and initial balance.
    //-----------------------------------------------------------------
    public Account(String name, long acctNumber, double balance) {
        this.name = name;
        this.acctNumber = acctNumber;
        this.balance = balance;
    }

    public Account(String name, long acctNumber) {
        this.name = name;
        this.acctNumber = acctNumber;
        balance = 1.0;
    }

    public Account() {
        name = "Joe Bloggs";
        acctNumber = 99999999;
        balance = 0.0;

    }

    public void setName(String name) {
        this.name = name;
    }

    //-----------------------------------------------------------------
    //  Deposits the specified amount into the account. Returns the
    //  new balance.
    //-----------------------------------------------------------------
    public double deposit(double amount) {
        balance += amount;

        return balance;
    }

    //-----------------------------------------------------------------
    //  Withdraws the specified amount from the account and applies
    //  the fee. Returns the new balance.
    //-----------------------------------------------------------------
    public double withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");

        return balance;

    }

    //-----------------------------------------------------------------
    //  Adds interest to the account and returns the new balance.
    //-----------------------------------------------------------------
    public double addInterest() {
        balance += (balance * RATE);
        return balance;
    }

    //-----------------------------------------------------------------
    //  Returns the current balance of the account.
    //-----------------------------------------------------------------
    public double getBalance() {
        return balance;
    }

    //-----------------------------------------------------------------
    //  Returns a description of the account as a string.
    //-----------------------------------------------------------------
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return "Name: " + name +
                "\nAccount Number: " + acctNumber +
                "\nBalance: " + nf.format(balance);
    }
}
