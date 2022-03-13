package com.itacademy.java.oop.basics.task3;

public class DebitCard extends Card {


    public DebitCard(double balance, String cardHolderName, String cardNumber) {
        super(balance, cardHolderName, cardNumber);
    }

    @Override
    public void credit(double amount) {
        if (amount >= 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Your total is " + balance);
            } else {
                System.out.println("NotEnoughBalanceException");
            }
        } else {
            System.out.println("Amount can not be negative");
        }
    }

    @Override
    public void debit(double amount) {
        if (amount >= 0) {
            balance += amount;
            System.out.println("Your total is " + balance);
        } else {
            System.out.println("Amount can not be negative");
        }

    }
}

