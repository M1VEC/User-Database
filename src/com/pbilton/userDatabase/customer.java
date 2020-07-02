package com.pbilton.userDatabase;

import java.util.ArrayList;

public class customer {
    private String name;
    private String email;
    private String company;
    private int id;
    public boolean softDelete;
    private static int nextId = 1;

    public static customer create(String name, String email, String company, boolean softDelete) {
        return new customer(nextId++, name, email, company, softDelete);
    }

    public customer(int id, String name, String email, String company, boolean softDelete) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.company = company;
        this.softDelete = false;
    }

    public static void addCustomer(ArrayList<customer> customers) {
        customers.add(create(userInterface.getInput("User Name"), userInterface.getInput("Email"), userInterface.getInput("Company"),false));
    }

    public String toString() {
        return "Customer ID: " + this.id + ", Name: " + this.name + ", Email: " + this.email + ", Company: " + this.company;
    }

    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getCompany(){
        return company;
    }

    public boolean getDelete(){ return softDelete; }
}

