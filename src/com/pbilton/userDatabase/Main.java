package com.pbilton.userDatabase;

import java.util.ArrayList;
import java.util.Scanner;
//Program to create a customer database
//Want to add search user and delete user
public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int menuSelection = 0;

        ArrayList<customer> customers = new ArrayList<>();
        customer.preCustomerList(customers);    //adds 3 customers to populate the list

        while (!(menuSelection == 4)) {
            menuSelection = userInterface.displayMenu();

            if (menuSelection == 1)
                userInterface.addNewCustomer(customers);

            else if (menuSelection == 2)
                userInterface.searchInitiate(customers);

            else if (menuSelection == 3)
                System.out.println("Delete User");
            //not created yet

            else if (menuSelection == 4)
                //Exit
                break;
        }
    }

}


