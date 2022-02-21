package com.company;

public class CommercialClient extends Client{
    private int commercialID;

    public CommercialClient(){
        setNationalID(0000000000000);
    }
    public void setCommercialID(int commercialID) {
        this.commercialID = commercialID;
    }

    @Override
    public String toString() {
        return "Name = '" + getName() + '\'' +
                ", Commercial ID = " + commercialID +
                ", Address = '" + getAddress() + '\'' +
                ", Phone = " + getPhone() +
                ", Account =  " + getAccount();

    }

}

