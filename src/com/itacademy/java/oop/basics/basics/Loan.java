package com.itacademy.java.oop.basics.basics;

public class Loan {

    public enum enumLoanType {
        LEASING {
            public String toString() {
                return "leasing";
            }
        },
        CONSUMER_LOAN {
            public String toString() {
                return "consumer loan";
            }
        }
    }

    private int id;
    private int amount;
    private enumLoanType loanType;
    private int terminationDate;


    public Loan(int id, int amount, enumLoanType loanType, int terminationDate) {
        this.id = id;
        this.amount = amount;
        this.loanType = loanType;
        this.terminationDate = terminationDate;
    }

    public String getTerminationDate() {
        return "Id " + id + ", Amount " + + amount + ", Loan type is " + loanType + ", Termination date is " + terminationDate;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", amount=" + amount +
                ", loanType=" + loanType +
                ", terminationDate=" + terminationDate +
                '}';
    }


}
