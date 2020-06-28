package com.pbilton.userDatabase;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int menuSelection = 0;

        ArrayList<customer> customers = new ArrayList<>();
        customer.preCustomerList(customers);    //adds 3 pre-typed customers to the list

        while (!(menuSelection == 4)) {
            menuSelection = displayMenu();

            if (menuSelection == 1) {
                String additionalCustomer = " ";
                while (!additionalCustomer.equals("n")) {
                    customer.addCustomer(customers);
                    System.out.println("Add another user: y or n");
                    additionalCustomer = scanner.next().toLowerCase();
                }
            }
            else if (menuSelection == 2) {
                System.out.println(customers.get(displayIndex()).print());
            }
            else if (menuSelection == 3) {
                System.out.println("Delete User");
            }
            else if (menuSelection == 4) {
         break;
            }
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

    private static int displayIndex() {
        System.out.println("Select customer to view:");
        int value = scanner.nextInt()-1;
        return value;
    }
}



