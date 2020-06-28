package com.pbilton.userDatabase;

import java.util.ArrayList;
import java.util.Scanner;

public class customer {
    private String name;
    private String email;
    private String company;
    private int id;
    private static int nextId = 1;
    private static Scanner scanner = new Scanner(System.in);

    public static customer create(String name, String email, String company) {
        return new customer(nextId++, name, email, company);
    }

    public customer(int id, String name, String email, String company) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.company = company;
    }

    public static void addCustomerList(ArrayList<customer> customer){
        customer.add(create("jack","jackie@hotmail.co.uk","BT"));
        customer.add(create("gg","aHorse@horse.com","Stables"));
        customer.add(create("bob","bobby@gmail.com","ScotlandYard"));
    }

    public static void addCustomer(ArrayList<customer> customer){
        customer.add(create(getInput("User Name"), getInput("Email"), getInput("Company")));
    }

    public static String getInput(String prompt) {
        System.out.print("Please enter your " + prompt + ":");
        String value = scanner.next();
        return value;
    }

    public String print() {
        return "Customer ID: " + id + ", Name: " + name + ", Email: " + email + ", Company: " + company;
    }
}

