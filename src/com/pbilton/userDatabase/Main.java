package com.pbilton.userDatabase;

import java.util.ArrayList;
import java.util.Scanner;
//Want to add a user menu to add new user, search user and delete user
public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<customer> customer = new ArrayList<>();
        com.pbilton.userDatabase.customer.addCustomerList(customer); //Calls a method to fill array with a small list of customer 0,1,2

        String additionalCustomer = " ";
        while (!additionalCustomer.equals("n")) {
            com.pbilton.userDatabase.customer.addCustomer(customer);
            System.out.println("Add another customer: y or n");
            additionalCustomer = scanner.next().toLowerCase();
        }

        int userIndex = displayIndex();
        System.out.println(customer.get(userIndex).print());
    }

    public static int displayIndex() {
        System.out.println("Select customer to view:");
        int value = scanner.nextInt() - 1;
        return value;
    }
}


