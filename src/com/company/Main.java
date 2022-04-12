package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank();


    public static void main(String[] args) {
        boolean quit = false;
        startApplication();
        while (!quit) {
            printActions();
            System.out.println("\n Enter Action: ");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("\n Goodbye! Thanks for coming");
                    quit = true;
                    break;
                case 1:
                    System.out.println("\n Let's add a name to your bank!");
                    newBankName();
                    break;
                case 2:
                    System.out.println("\n Let's add a branch!");
                    newBranch();
                    break;
                case 3:
                    System.out.println("\n Let's add a customer!");
                    newCustomer();
                    break;

                default:
                    System.out.println("Incorrect option chosen, quitting application");
                    quit = true;
            }
        }
    }

    private static void newCustomer() {
        System.out.println("\nEnter the name of the Branch you would like to add a customer to");
        String branchQuery = scanner.nextLine();
        Branch newBranch = bank.findBranch(branchQuery);
        if(newBranch == null){
            System.out.println("Creating branch with new name of "+ branchQuery);
            bank.addBranch(branchQuery);
            System.out.println("Added new branch with the name of " + branchQuery);
            System.out.println("Add the name of the new customer");
            String newName = scanner.nextLine();
            System.out.println("Add the initial amount of money this customer has");
            double newValue = scanner.nextDouble();
            bank.findBranch(branchQuery).newCustomer(newName,newValue);
            System.out.println("Yay! You added a customer to the branch " + branchQuery + " with the name " + newName + " with a balance of $" + newValue);
        } else {
            System.out.println("Add the name of the new customer");
            String newName = scanner.nextLine();
            System.out.println("Add the initial amount of money this customer has");
            double newValue = scanner.nextDouble();
            bank.findBranch(branchQuery).newCustomer(newName,newValue);
            System.out.println("Yay! You added a customer to the branch " + branchQuery + " with the name " + newName + " with a balance of $" + newValue);

        }


    }

    private static void newBranch() {
        System.out.println("\nEnter the name of the new branch");
        String branch = scanner.nextLine();
        bank.addBranch(branch);
        System.out.println("Yay! You added a customer with the name !" + branch);
    }

    private static void newBankName() {
        System.out.println("\nEnter the name of the new bank");
        String newBankName = scanner.nextLine();
        bank.setName(newBankName);
        System.out.println("Yay! You have changed the name of the bank to  " + bank.getName());

    }

    private static void startApplication() {

        System.out.println("Starting your Banking Application...");

    }

    private static void printActions() {

        System.out.println("\n Choose one of the following! : \n");
        System.out.println("0. To ShutDown.");
        System.out.println("1. To Add a name to your Bank.");
        System.out.println("2. To Add branch to a Bank.");
        System.out.println("3. To Add a Customer to a Bank's Branch.");

    }

    public static void setBank(Bank bank) {
        Main.bank = bank;
    }
}
