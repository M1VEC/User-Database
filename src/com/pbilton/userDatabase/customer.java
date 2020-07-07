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

    private customer(int id, String name, String email, String company, boolean softDelete) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.company = company;
        this.softDelete = false;
    }

    //Used to pre-populate array with customers
    public static void preCustomerList(ArrayList<customer> customer) {
        customer.add(create("humpty", "humpty@dumpty.com", "The wall company",false));
        customer.add(create("gg", "gg@horsey.com", "The stables",false));
        customer.add(create("bobby", "bobby@police.com", "ScotlandYard",false));
        customer.add(create("grumpy", "grumpy@dwarfs.com", "Snowwhite",false));
        customer.add(create("happy", "happy@dwarfs.com", "Snowwhite",false));
        customer.add(create("sleepy", "sleepy@dwarfs.com", "Snowwhite",false));
        customer.add(create("bashful", "bashful@dwarfs.com", "Snowwhite",false));
        customer.add(create("sneezy", "sneezy@dwarfs.com", "Snowwhite",false));
        customer.add(create("dopey", "dopey@dwarfs.com", "Snowwhite",false));
        customer.add(create("doc", "doc@dwarfs.com", "Snowwhite",false));
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
}

