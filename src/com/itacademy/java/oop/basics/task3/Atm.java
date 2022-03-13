package com.itacademy.java.oop.basics.task3;

public interface Atm {

    public void withdraw(int amount, Card card);

    public void addFunds(int amount, Card card);
}

