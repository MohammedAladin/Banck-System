package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("-----------------Welcome to our bank-----------------");

        int choice = 0;
        while (choice != 5) {
            System.out.println("1- Add new account" + "\n"
                    + "2- Deposit" + "\n"
                    + "3- Withdraw" + "\n"
                    + "4- Display account Information" + "\n"
                    + "5- Exist");
            choice = in.nextInt();

            Account newAccount = new Account();
            SpecialAccount newSpecialAccount = new SpecialAccount();
            Client newClient = new Client();
            CommercialClient newCommercialClient = new CommercialClient();
            Bank bank = new Bank();

            switch (choice) {
                case 1:

                    System.out.println("What kind of client? " + "\n"
                            + "1- Normal" + "\n"
                            + "2- Commercial");

                    int clientKind = in.nextInt();

                    System.out.println("Please, Enter the client name : ");
                    String name = in.next();

                    System.out.println("Please, Enter the address : ");
                    String address = in.next();

                    System.out.println("Please, Enter the phone : ");
                    int phone = in.nextInt();

                    System.out.println("What kind of account? " + "\n"
                            + "1- Normal" + "\n"
                            + "2- Special");

                    int kind = in.nextInt();

                    System.out.println("Please, Set the account number");
                    int accountNumber = in.nextInt();
                    for (int i = 0; i < Bank.accountsData.size(); i++) {
                        if (Bank.accountsData.get(i).getAccountNumber() == accountNumber) {
                            System.out.println("Sorry, This account number is already exists" + "\n"
                                    + "Please, Enter new one");
                            accountNumber = in.nextInt();
                            i = -1;
                        }
                    }
                    System.out.println("Please, Set the balance");
                    int balance = in.nextInt();

                    if (kind == 1) {
                        newAccount.setAccountNumber(accountNumber);
                        newAccount.setBalance(balance);

                    } else {
                        newSpecialAccount.setAccountNumber(accountNumber);
                        newSpecialAccount.setBalance(balance);

                    }
                    if (clientKind == 1) {
                        newClient.setName(name);
                        newClient.setAddress(address);
                        newClient.setPhone(phone);
                        System.out.println("Please, Enter the nationalID");
                        int ID = in.nextInt();
                        newClient.setNationalID(ID);
                        if (kind == 1) {
                            bank.addNewClient(newClient, newAccount);

                        } else {
                            bank.addNewClient(newClient, newSpecialAccount);
                        }
                    } else {
                        newCommercialClient.setName(name);
                        newCommercialClient.setAddress(address);
                        newCommercialClient.setPhone(phone);
                        System.out.println("Please, Enter the commercialID");
                        int ID = in.nextInt();
                        newCommercialClient.setCommercialID(ID);
                        if (kind == 1) {
                            bank.addNewClient(newCommercialClient, newAccount);
                        } else {
                            bank.addNewClient(newCommercialClient, newSpecialAccount);
                        }

                    }

                    System.out.println("------------ Client is successfully added ------------ "+"\n");

                    break;
                case 2:
                    System.out.println("Please, Enter the account number ");
                    int ac = in.nextInt();
                    boolean found = false;
                    for (int i = 0; i < Bank.accountsData.size(); i++) {
                        if (Bank.accountsData.get(i).getAccountNumber() == ac) {
                            System.out.println("How much money do you want to deposit");
                            int money = in.nextInt();
                            Bank.accountsData.get(i).deposit(money);
                            found = true;
                        } else if (i == Bank.accountsData.size() - 1 && !found) {
                            System.out.println("This account is not exist, Please enter another one");
                            ac = in.nextInt();
                            i = -1;
                        }

                    }

                    break;
                case 3:
                    System.out.println("Please, Enter the account number ");
                    int ac1 = in.nextInt();
                    boolean isFound = false;
                    for (int i = 0; i < Bank.accountsData.size(); i++) {
                        if (Bank.accountsData.get(i).getAccountNumber() == ac1) {
                            System.out.println("How much money do you want to withdraw");
                            int money = in.nextInt();
                            Bank.accountsData.get(i).withdraw(money);
                            isFound = true;
                        } else if (i == Bank.accountsData.size() - 1 && !isFound) {
                            System.out.println("This account is not exist, Please enter another one");
                            ac1 = in.nextInt();
                            i = -1;
                        }

                    }

                    break;
                case 4:
                    bank.display();
                    break;

            }
        }
    }
}