package com.itacademy.java.oop.basics.basics;

public class LaonsApplication {
    private boolean get;

    public static void main(String[] args) {


        Custumer custumerBrigita = new Custumer("Brigita", "Macaite", 24, 12233);

        Loan consumerLoan = new Loan(321,200, Loan.enumLoanType.CONSUMER_LOAN, 2022 );
        Loan leasing = new Loan(123, 300, Loan.enumLoanType.LEASING, 2021);

//        Kaip su java sukurti array be is anksto nurodyto dydzio, i kuri butu galima prideti elementus kaip su .add arba /push?
        Loan[] loansBrigita = new Loan[2];
        loansBrigita[0] = consumerLoan;
        loansBrigita[1] = leasing;
        custumerBrigita.setLoans(loansBrigita);

        System.out.println(custumerBrigita.getCustumerInfo());





    }
}
