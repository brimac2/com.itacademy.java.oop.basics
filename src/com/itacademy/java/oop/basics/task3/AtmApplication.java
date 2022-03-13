package com.itacademy.java.oop.basics.task3;

public class AtmApplication {
    public static void main(String[] args) {
        MyBankAtm brigitaBank = new MyBankAtm(1000);
        CreditCard creditCard = new CreditCard(0, "Brigita", "1234123412341234", 10, 1000);
        DebitCard debitCard = new DebitCard(120, "Martynas", "3213213213213212");

        brigitaBank.addFunds(100, debitCard);


    }
}
