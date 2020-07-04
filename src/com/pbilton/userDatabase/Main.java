package com.pbilton.userDatabase;

import java.util.ArrayList;
import java.util.Scanner;
//Program to create a customer database
public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<customer> customers = new ArrayList<>();
        Repository<customer> customerRepository = new inMemoryCustomerRepository(customers);
        customer.preCustomerList(customers);
        userInterface.openUserMenu(customerRepository);

    }
}

