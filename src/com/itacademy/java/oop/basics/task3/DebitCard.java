package com.itacademy.java.oop.basics.task3;

public class DebitCard extends Card {


    public DebitCard(double balance, String cardHolderName, String cardNumber) {
        super(balance, cardHolderName, cardNumber);
    }

    @Override
    public void credit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Your total is " + balance);
        } else {
            System.out.println("You do not have enough, please check your balance");
        }
    }

    @Override
    public void debit(double amount) {
        balance += amount;
        System.out.println("Your total is " + balance);
    }
}

