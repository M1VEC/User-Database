package com.pbilton.userDatabase;

import java.util.Scanner;

public class userInterface {
    private static Scanner scanner = new Scanner(System.in);

    public static void openUserMenu(Repository<customer> customerRepository){
        int menuSelection = 0;

        while (!(menuSelection == 4)) {
            menuSelection = displayMenu();

            if (menuSelection == 1)
                addNewCustomer(customerRepository);

            else if (menuSelection == 2)
                searchInterface.searchInitiate(customerRepository);
            else if (menuSelection == 3)
                //Exit
                break;
        }
    }

    private static int displayMenu() {
        System.out.println();
        System.out.println("1: Add customer");
        System.out.println("2: View customer database");
        System.out.println("3: Exit");
        System.out.println("Selection:");
        int value = scanner.nextInt();
        return value;
    }

    private static void addNewCustomer(Repository<customer> customers) {
        String additionalCustomer = " ";
        while (!additionalCustomer.equals("n")) {
            System.out.println();

            customers.add(createCustomer());
            System.out.println("Add another customer: y or n");

            additionalCustomer = scanner.next().toLowerCase();
        }
    }

    private static customer createCustomer() {
        return customer.create(userInterface.getInput("User Name"), userInterface.getInput("Email"), userInterface.getInput("Company"),false);
    }

    private static String getInput(String prompt) {
        System.out.print("Please enter your " + prompt + ":");
        String value = scanner.next();
        return value;
    }
}


