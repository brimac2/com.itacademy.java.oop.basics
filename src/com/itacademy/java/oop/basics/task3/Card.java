package com.itacademy.java.oop.basics.task3;

abstract class Card {

    //Kai pasidarau protected galiu tiesiogiai manipuliuoti is AtmApplication. Kai pasidarau private negaliu modifikuoti Cards klasese. Koks turetu buti kad nebutu galima mutuoti main metode bet butu gali atlikti veiksmus?
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
