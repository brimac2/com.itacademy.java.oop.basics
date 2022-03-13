package com.itacademy.java.oop.basics.task3;

abstract class Card {

    protected String cardHolderName;
    protected String cardNumber;
    protected double balance;

    public Card(double balance, String cardHolderName, String cardNumber) {
        this.balance = balance;
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
    }

    public abstract void credit(double amount);

    public abstract void debit(double amount);
}
