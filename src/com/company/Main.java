package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean quit = false;

        System.out.println("\n Choose one of the following! : \n");
        System.out.println("0. To ShutDown.");
        System.out.println("1. To create a Bank.");
        System.out.println("2. To Add branch to a Bank.");
        System.out.println("3. To Add a Customer to a Bank's Branch.");

        while (!quit) {
            System.out.println("\n Enter Action: ");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("\n Goodbye! Thanks for coming");
                    quit = true;
                    break;
                case 1:
                    System.out.println("\n Let's create a bank!");
                    System.out.println("\n What is the name of the bank that you would like to create?");
                    String bankName = scanner.nextLine();
                    System.out.println("\n What is the location of the bank that you would like to create?");
                    String bankLocation = scanner.nextLine();
                    Bank bank = new Bank(bankName, bankLocation);
                    System.out.println("Congratulations, you have added a new bank with the name of " + bank.getBankName() + " and this bank is located at " + bank.getBankLocation() + ".  This bank has " + bank.getBankStaffMembers() + " employees");

                    break;
                case 2:
                    System.out.println("\n Let's add a branch!");
                    break;
                case 3:
                    System.out.println("\n Let's add a customer!");
                    System.out.println("\n What is the first name of the customer you would like to add?");
                    String firstName = scanner.nextLine();
                    System.out.println("\n What is the last name of the customer you would like to add?");
                    String lastName = scanner.nextLine();
                    System.out.println("\n What is the initial value of their account?");
                    double initialValue = scanner.nextDouble();


                    //Opportunity to learn about creating a new object
                    Customer customer = new Customer(firstName, lastName, initialValue);
                    System.out.println("You have added a customer with the name " + customer.getFirstName() + " " + customer.getLastName() + " their balance is $" + customer.getInitialAmount());
                    break;
                default:
                    System.out.println("Incorrect option chosen, quitting application");
                    quit = true;
            }
        }
    }






}
