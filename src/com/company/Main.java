package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    //Opportunity to learn about scanner class
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Opportunity to learn about primitive data type Boolean
        boolean quit = false;

        //Opportunity to learn about control flow (while)
        while (!quit) {
            System.out.println("\nWelcome to the Nology Music App");
            System.out.println("\nChoose one of the following! : \n");
            System.out.println("0. To ShutDown.");
            System.out.println("1. To Add a User");
            System.out.println("2. To Access User Profiles");
            System.out.println("3. To Add a Song");
            System.out.println("4. To Add an Entire Album");
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
                    // Method to add users
                    System.out.println("\n Let's add a user!");
                    break;
                case 2:
                    // Method to give options on user profiles
                    System.out.println("\n Let's see some users!");
                    System.out.println("\n What is the name of the user you would like to see?");
                    String userQuery = scanner.nextLine();

                    break;
                case 3:
                    // Method to add individual song
                    System.out.println("\n Let's add a song!");
                    break;
                case 4:
                    // Method to add entire album
                    System.out.println("\n Let's add an album!");
                    break;

                default:
                    System.out.println("Incorrect option chosen, quitting application");
                    quit = true;
            }
        }
    }

}
