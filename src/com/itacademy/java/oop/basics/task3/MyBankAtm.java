package com.itacademy.java.oop.basics.task3;

public class MyBankAtm implements Atm {
    private double balance;

    public MyBankAtm(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println("Successful");
            balance -= amount;
        } else {
            System.out.println("InsufficientAtmFundsException");
        }
    }


}

