package com.company;

public class SpecialAccount extends Account {

    @Override
    public void withdraw(int money) {
        if (getBalance() >= money) {
            setBalance(getBalance() - money);
            System.out.println("----------- Balance is updated successfully. -----------" + "\n"
                    + " ----------- The new Balance = " + getBalance() + " -----------"+"\n");
        } else if (getBalance() - money >= -1000) {
            setBalance(getBalance() - money);
            System.out.println("----------- Balance is updated successfully. -----------" + "\n"
                    + "----------- The new Balance = " + getBalance()+" -----------"+"\n");

        } else
            System.out.println("Sorry, Maximum amount of withdraw is = " + (getBalance() + 1000)+"\n");
    }

    @Override
    public String toString() {
        return "[" + " The Balance = " + getBalance() + ", The AccountNumber = " + getAccountNumber() + ", Special Account." + ']';
    }
}