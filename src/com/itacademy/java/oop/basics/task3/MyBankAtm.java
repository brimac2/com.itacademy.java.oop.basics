package com.itacademy.java.oop.basics.task3;

public class MyBankAtm implements Atm {
    private double balance;

    public MyBankAtm(double balance) {
        this.balance = balance;
    }

    //ne iki galo padarytas withdraw metodas. Nesuprantu kaip tesingai iki galo padaryti, nes dabar siuo atveju pinigai is bankomato nusiskaiciuoja,nors neturime tarkim tiek korteleje.
    @Override
    public void withdraw(int amount, Card card) {
        if (balance >= amount) {
            System.out.println("Successful");
            balance -= amount;
            card.credit(amount);
        } else {
            System.out.println("InsufficientAtmFundsException");
        }
    }

    @Override
    public void addFunds(int amount, Card card) {
        if (amount >= 0) {
            balance += amount;
            card.debit(amount);
            System.out.println("Successful");
        } else {
            System.out.println("Amount can not be negative");
        }
    }


}

