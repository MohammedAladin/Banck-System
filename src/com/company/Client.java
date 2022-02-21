package com.company;

public class Client {
    private String name;
    private int nationalID;
    private String address;
    private int phone;
    private Account account;

    public Client(){}
    public Client(Account account, String name, int nationalID, String address, int phone){
        this.account=account;
        this.name=name;
        this.nationalID=nationalID;
        this.address=address;
        this.phone=phone;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationalID(int nationalID) {
        this.nationalID = nationalID;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Account getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public int getNationalID() {
        return nationalID;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Name = '" + name + '\'' +
                ", NationalID=" + nationalID +
                ", Address='" + address + '\'' +
                ", Phone=" + phone +
                ", " + account;

    }
}
