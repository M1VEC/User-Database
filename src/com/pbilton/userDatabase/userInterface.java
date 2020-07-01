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

    public static void searchInitiate(ArrayList<customer> customers){
        int searchMenu = searchCustomerMenu();
        if (searchMenu == 1)
            search.displayAll(customers);
        if (searchMenu == 2)
            System.out.println("ID");
        if (searchMenu == 3)
            search.searchDataBase(customers);
        if (searchMenu == 4);
    }

    private static int searchCustomerMenu() {
        System.out.println("1: Display all customers");
        System.out.println("2: Display customer by ID");
        System.out.println("3: Search customer database");
        System.out.println("4: Back to main menu");
        int value = scanner.nextInt();
        return value;
    }
}


