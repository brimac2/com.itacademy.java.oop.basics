package com.itacademy.java.oop.basics.task3;

public class CreditCard extends Card {
    private double interest;
    private double credit;

    public CreditCard(double balance, String cardHolderName, String cardNumber, double interest, double credit) {
        super(balance, cardHolderName, cardNumber);
        this.interest = interest;
        this.credit = credit;
    }


    @Override
    public void credit(double myCredit) {
        double Interest = credit - myCredit * interest;
        double creditCardInterest = myCredit - Interest;
        if (myCredit >= creditCardInterest) {
            System.out.println("good");
        } else {
            System.out.println("not good");
        }
    }

    @Override
    public void debit(double amount) {

    }
}

