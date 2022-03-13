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
    public void credit(double amount) {
        if (amount >= 0) {
            double totalAmountToSpend = credit + balance;
            double interestValue = (interest * 0.01) * amount;
            double amountWithInterest = amount + interestValue;

            if (totalAmountToSpend - amountWithInterest >= 0) {
                balance -= amountWithInterest;
                System.out.println("Your balance is " + balance);
            } else {
                System.out.println("NotEnoughCreditException");
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

