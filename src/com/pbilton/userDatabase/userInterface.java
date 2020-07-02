package com.pbilton.userDatabase;

import java.util.ArrayList;
import java.util.Scanner;

public class userInterface {
    private static Scanner scanner = new Scanner(System.in);

    public static void openUserMenu(ArrayList<customer> customers){
        int menuSelection = 0;

        while (!(menuSelection == 4)) {
            menuSelection = displayMenu();

            if (menuSelection == 1)
                addNewCustomer(customers);

            else if (menuSelection == 2)
                searchInitiate(customers);

            else if (menuSelection == 3)
                System.out.println("Delete User");
                //not created yet

            else if (menuSelection == 4)
                //Exit
                break;
        }
    }

    private static int displayMenu() {
        System.out.println("1: Add customer");
        System.out.println("2: View customer");
        System.out.println("3: Delete customer");
        System.out.println("4: Exit");
        System.out.println("Selection:");
        int value = scanner.nextInt();
        return value;
    }

    private static int searchCustomerMenu() {
        System.out.println("1: Display all customers");
        System.out.println("2: Display customer by ID");
        System.out.println("3: Search customer database");
        System.out.println("4: Back to main menu");
        int value = scanner.nextInt();
        return value;
    }

    private static void addNewCustomer(ArrayList<customer> customers) {
        String additionalCustomer = " ";
        while (!additionalCustomer.equals("n")) {
            System.out.println();

            customer.addCustomer(customers);
            System.out.println("Add another customer: y or n");

            additionalCustomer = scanner.next().toLowerCase();
            System.out.println();
        }
    }

    private static void searchInitiate(ArrayList<customer> customers){
        System.out.println();
        int searchMenu = searchCustomerMenu();

        if (searchMenu == 1){
            displayAll(customers);
            searchInitiate(customers);}
        if (searchMenu == 2)
            System.out.println("ID");
        if (searchMenu == 3){
            searchDataBase(customers);;
            searchInitiate(customers);}
        if (searchMenu == 4);
            System.out.println();
    }

    private static void displayAll(ArrayList<customer> customers) {
        System.out.println();
        int arraySize = customers.size();
        for (int index = 0; index < arraySize; index++) {
            System.out.println(customers.get(index));
        }
    }

    private static void searchDataBase(ArrayList<customer> customers) { //Search all instances of database
        System.out.println();
        System.out.println("Please enter a search term");
        String searchTerm = scanner.next();
        System.out.println("Searching complete array for: " + searchTerm);
        int arraySize = customers.size();
        for (int index = 0; index < arraySize; index++) {
            boolean search = customers.get(index).toString().contains(searchTerm);
            if (search == true) {
                int foundIndex = index;
                System.out.println("Result: " + customers.get(foundIndex).toString());
            }
        }
    }

    public static String getInput(String prompt) {
        System.out.print("Please enter your " + prompt + ":");
        String value = scanner.next();
        return value;
    }
}


