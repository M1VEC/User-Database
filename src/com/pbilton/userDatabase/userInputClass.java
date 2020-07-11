package com.pbilton.userDatabase;

import java.util.Scanner;

public class userInputClass {
    private static Scanner scanner = new Scanner(System.in);

    public static void openUserMenu(Repository<customer> customerRepository){
        int menuSelection = 0;

        while (!(menuSelection == 4)) {
            displayUserMenu();
            menuSelection = numberPrompt("Selection: ");
            if (menuSelection == 1)
                addNewCustomer(customerRepository);

            else if (menuSelection == 2)
                searchBaseClass.searchMenu(customerRepository);
            else if (menuSelection == 3)
                //Exit
                break;
        }
    }

    private static void displayUserMenu() {
        System.out.println();
        System.out.println("1: Add customer");
        System.out.println("2: View customer database");
        System.out.println("3: Exit");
    }

    private static void addNewCustomer(Repository<customer> customers) {
        String additionalCustomer = " ";
        while (!additionalCustomer.equals("n")) {
            System.out.println();

            customers.add(createCustomer());
            additionalCustomer = stringPrompt("Add another customer: y or n").toLowerCase();
        }
    }

    private static customer createCustomer() {
        return customer.create(stringPrompt("Please enter User Name: "),
                stringPrompt("Please enter Email address: "),
                stringPrompt("Please enter Company name"),
                false);
    }

    public static String stringPrompt(String prompt) {
        System.out.println(prompt);
        String value = scanner.next();
        return value;
    }

    public static int numberPrompt(String prompt){
        System.out.println(prompt);
        int value = scanner.nextInt();
        return value;
    }
}


