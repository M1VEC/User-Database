package com.pbilton.userDatabase;

import java.util.ArrayList;
import java.util.Scanner;
//Program to create a customer database
//Want to add a user menu to add new user, search user and delete user
public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int menuSelection = 0;

        ArrayList<customer> customers = new ArrayList<>();
        customer.preCustomerList(customers);    //adds 3 pre-typed customers to the list

        while (!(menuSelection == 4)) {
            menuSelection = userInterface.displayMenu();

            if (menuSelection == 1) {

                String additionalCustomer = " ";
                while (!additionalCustomer.equals("n")) {

                    customer.addCustomer(customers);
                    System.out.println("Add another customer: y or n");

                    additionalCustomer = scanner.next().toLowerCase();
                    System.out.println();
                }
            }
            else if (menuSelection == 2)
                userInterface.printCustomer(customers);

            else if (menuSelection == 3)
                System.out.println("Delete User");

            else if (menuSelection == 4)
         break;
        }
    }
}


