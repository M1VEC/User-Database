package com.pbilton.userDatabase;

import java.util.ArrayList;
import java.util.Scanner;

public class customer {
    private String name;
    private String email;
    private String company;
    private int id;
    private static int nextId = 1;

    public static customer create(String name, String email, String company) {
        return new customer(nextId++, name, email, company);
    }

    public customer(int id, String name, String email, String company) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.company = company;
    }

    public static void addCustomer(ArrayList<customer> customers) {
        customers.add(create(userInterface.getInput("User Name"), userInterface.getInput("Email"), userInterface.getInput("Company")));
    }

    public String print() {
        return "Customer ID: " + id + ", Name: " + name + ", Email: " + email + ", Company: " + company;
    }

    //Used to pre-populate array with customers
    public static void preCustomerList(ArrayList<customer> customer) {
        customer.add(create("humpty", "humpty@dumpty.com", "The wall company"));
        customer.add(create("gg", "gg@horsey.com", "The stables"));
        customer.add(create("bobby", "bobby@police.com", "ScotlandYard"));
    }

    public String toString() {
        return "Customer ID: " + this.id + ", Name: " + this.name + ", Email: " + this.email + ", Company: " + this.company;
    }
}
