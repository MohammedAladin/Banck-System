package com.company;

public class Account {
    private int balance;
    private int accountNumber;

    public Account(int balance, int accountNumber){
        this.balance=balance;
        this.accountNumber=accountNumber;
    }
    public Account(){}

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }
    public void deposit( int money){
        balance+=money;

        System.out.println("----------- Balance is updated successfully ----------- " +"\n"
                + " ----------- The new Balance = " + balance+ " -----------" +"\n");
    }
    public void withdraw(int money){
        if(money>balance)
            System.out.println("----------- Sorry, can't withdraw your balance is only = " +balance+ " -----------"+ "\n");
        else
        {
            balance-=money;
            System.out.println("----------- Balance is updated successfully. -----------" +"\n"
                    + "----------- The new Balance = " + balance+ " -----------"+"\n");
        }

    }




    @Override
    public String toString() {
        return "[" + " The Balance = " + balance + ", The AccountNumber = " + accountNumber + ", Normal Account."+ ']';
    }
}
