package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private String name;
    private String address;
    private int phone;
    static Scanner in = new Scanner(System.in);
    public  static ArrayList<Account> accountsData = new ArrayList<>();
    public static   ArrayList<Client> clientsData = new ArrayList<>();


    public Bank(String name, String address, int phone){
        this.name=name;
        this.address=address;
        this.phone=phone;
    }
    public Bank(){}
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
    public int getPhone() {
        return phone;
    }
    public String getName() {
        return name;
    }

    public void addNewClient(Client newClient, Account newAccount){

        newClient.setAccount(newAccount);
        clientsData.add(newClient);
        accountsData.add(newAccount);

    }
    public void display(){
        System.out.println("Display for : "+ "\n"
                            +"1- account" + "\n"
                            +"2- Client" + "\n"
                            +"3- All clients" + "\n"
                            +"4- All accounts");
        int display=in.nextInt();
        if(display==1){
            System.out.println("Please, Enter your account number : ");

            int accountNumber = in.nextInt();
            boolean found=false;
            int i;
            for( i = 0; i<accountsData.size(); i++) {
                if (accountNumber == accountsData.get(i).getAccountNumber())
                {
                    System.out.println(" Balance of this account = "+accountsData.get(i).getBalance());
                    found = true;

                }
                else if (i==accountsData.size()-1 && !found){
                    System.out.println("This account is not exist, Please enter another one");
                    accountNumber=in.nextInt();
                    i=-1;
                }
            }
        }
        if(display==2)
        {
            System.out.println("Please, Enter Client Name");
            String name=in.next();
            boolean found=false;

            for(int i=0; i<clientsData.size(); i++){
                if(name.equals(clientsData.get(i).getName())) {

                    System.out.println("Client information : "+clientsData.get(i));
                    found = true;

                }
                else if (i==clientsData.size()-1 && !found){
                    System.out.println("This client is not exist, Please enter another one");
                    name=in.next();
                    i=-1;
                }
            }
        }
        if(display==3){
            for(int i=0; i<clientsData.size(); i++)
            {
                System.out.println("Client : "+ (i+1)+ " " + clientsData.get(i));
            }
        }
        if(display==4){
            for(int i=0; i<accountsData.size(); i++)
            {
                System.out.println("Account: "+ (i+1) + " "  +accountsData.get(i));
            }
        }


    }
}



