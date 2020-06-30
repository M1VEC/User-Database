package com.pbilton.userDatabase;

import java.util.ArrayList;
import java.util.Scanner;

public class userInterface {
    private static Scanner scanner = new Scanner(System.in);

    public static int displayMenu() {
        System.out.println("1: Add customer");
        System.out.println("2: View customer");
        System.out.println("3: Delete customer");
        System.out.println("4: Exit");
        System.out.println("Selection:");
        int value = scanner.nextInt();
        System.out.println();
        return value;
    }

    public static void addNewCustomer(ArrayList<customer> customers) {
        String additionalCustomer = " ";
        while (!additionalCustomer.equals("n")) {

            customer.addCustomer(customers);
            System.out.println("Add another customer: y or n");

            additionalCustomer = scanner.next().toLowerCase();
            System.out.println();
        }
    }

    //A complicated way to either print selected customer or all customers.
    //I need to learn how to search and print an array
    public static void printCustomer(ArrayList<customer> customers) {
        System.out.println("Select customer to view or 0 to view all:");
        int value = scanner.nextInt();

        if (value < 1) {
            int arrayIndex = customers.size();
            for (int index = 0; index < arrayIndex; index++) {
                System.out.println(customers.get(index).print());
            }
        } else {
                System.out.println(customers.get(value -1).print());
            }
                System.out.println();
        }

        /*
    public static int prompt(String message){
        System.out.println(message);
        int value = scanner.nextInt();
        return value;
    }
    */
}


