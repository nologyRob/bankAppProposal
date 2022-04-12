package com.company;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private final int branchEmployees = (int) (Math.random()*50);

    //Opportunity to learn about ArrayLists
    private ArrayList<Customer> customers;


    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public int getBranchEmployees() {
        return branchEmployees;
    }

    public void addCustomer(String firstName, String lastName, double initialAmount) {
        Customer newCustomer = new Customer(firstName, lastName, initialAmount);
        customers.add(newCustomer);
        System.out.println("Customer Added");

    }




}
