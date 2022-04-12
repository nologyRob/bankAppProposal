package com.company;

import java.util.Scanner;

public class Main {
    //Opportunity to learn about scanner class
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        //Opportunity to learn about primitive data type Boolean
        boolean quit = false;

        //Opportunity to learn about control flow (while)
        while (!quit) {
            System.out.println("\n Choose one of the following! : \n");
            System.out.println("0. To ShutDown.");
            System.out.println("1. To Add a name to your Bank.");
            System.out.println("2. To Add branch to a Bank.");
            System.out.println("3. To Add a Customer to a Bank's Branch.");
            System.out.println("\n Enter Action: ");


            //Opportunity to learn about primitive data type integer
            int action = scanner.nextInt();
            scanner.nextLine();


            //Opportunity to learn about control flow (switch)
            switch(action) {
                case 0:
                    System.out.println("\n Goodbye! Thanks for coming");
                    quit = true;
                    break;
                case 1:
                    System.out.println("\n Let's add a name to your bank!");
                    break;
                case 2:
                    System.out.println("\n Let's add a branch!");

                    break;
                case 3:
                    System.out.println("\n Let's add a customer!");

                    break;

                default:
                    System.out.println("Incorrect option chosen, quitting application");
                    quit = true;
            }
        }
    }

}
