package com.company;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }


    public Bank() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBranch(String branchName) {
          branches.add(new Branch(branchName));
    }

    public boolean addCustomer(String branchName, String customerName, double initialaAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialaAmount);
        }
        return false;
    }


    public Branch findBranch(String branchName) {
        for (Branch checkedBranch : this.branches) {
            if (checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }

        } return null;
    }


}
