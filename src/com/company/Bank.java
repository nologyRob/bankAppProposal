package com.company;

public class Bank {

    private String bankName;
    private String bankLocation;
    private final int bankStaffMembers = (int) (Math.random()*20);

    public Bank(String bankName, String bankLocation) {
        this.bankName = bankName;
        this.bankLocation = bankLocation;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankLocation() {
        return bankLocation;
    }

    public void setBankLocation(String bankLocation) {
        this.bankLocation = bankLocation;
    }

    public int getBankStaffMembers() {
        return bankStaffMembers;
    }

}
