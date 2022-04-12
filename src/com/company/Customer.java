package com.company;

public class Customer {

    //Opportunity to learn about field members
    private String firstName;
    private String lastName;
    private double initialAmount;

    //Opportunity to learn about Math.random
    //Opportunity to learn about casting
    //Opportunity to learn about encapsulation
    //Opportunity to learn about modifiers
    private final int numberOfAccounts = (int) (Math.random()*10);


    //Opportunity to learn about constructors
    public Customer(String firstName, String lastName, double initialAmount) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.initialAmount = initialAmount;
    }


    //Opportunity to learn about getters/setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public double getInitialAmount() {
        return initialAmount;
    }
}
