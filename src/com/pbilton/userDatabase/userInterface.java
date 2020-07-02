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
                searchInterface.searchInitiate(customers);

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
        System.out.println("2: View customer database");
        System.out.println("3: Delete customer");
        System.out.println("4: Exit");
        System.out.println("Selection:");
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

    public static String getInput(String prompt) {
        System.out.print("Please enter your " + prompt + ":");
        String value = scanner.next();
        return value;
    }
}


