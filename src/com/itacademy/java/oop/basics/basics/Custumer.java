package com.itacademy.java.oop.basics.basics;

import java.util.Arrays;

public class Custumer {
    private String name;
    private String surname;
    private int age;
    private int personalNumber;
    private Loan[] loans;

    public Custumer(String name, String surname, int age, int personalNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.personalNumber = personalNumber;
        this.loans = new Loan[0];
    }

    public void setLoans(Loan[] loans) {
        this.loans = loans;
    }


    public String getCustumerInfo() {
        return "Name " + name + ", Surname " + surname + ", Age " + age + ", Personal number " + personalNumber + ". Total loans amount:  " + getTotalLoansAmount() +"$";
    }

    @Override
    public String toString() {
        return "Custumer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", personalNumber=" + personalNumber +
                ", loans=" + Arrays.toString(loans) +
                '}';
    }
    public void printInformation() {
        System.out.println(this);
    }

    private int getTotalLoansAmount()  {
        int loanSum = 0;

        for (int i = 0; i < loans.length; i++) {
            loanSum = loanSum + loans[i].getAmount();
        }

        return loanSum;
    }

}

