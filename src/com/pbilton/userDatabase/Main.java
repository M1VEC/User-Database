package com.pbilton.userDatabase;

import java.util.ArrayList;
import java.util.Scanner;
//Program to create a customer database
public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<customer> customers = new ArrayList<>();
        preCustomerList(customers);
        userInterface.openUserMenu(customers);
    }

    //Used to pre-populate array with customers
    private static void preCustomerList(ArrayList<customer> customer) {
        customer.add(com.pbilton.userDatabase.customer.create("humpty", "humpty@dumpty.com", "The wall company"));
        customer.add(com.pbilton.userDatabase.customer.create("gg", "gg@horsey.com", "The stables"));
        customer.add(com.pbilton.userDatabase.customer.create("bobby", "bobby@police.com", "ScotlandYard"));
    }
}


