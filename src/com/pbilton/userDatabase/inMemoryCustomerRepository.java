package com.pbilton.userDatabase;

import java.util.ArrayList;

public class inMemoryCustomerRepository implements Repository<customer>{
    private ArrayList<customer> customers;

    public inMemoryCustomerRepository(ArrayList<customer> customers) {

        this.customers = customers;
    }

    @Override
    public void add(customer c) {
        this.customers.add(c);
    }

    @Override
    public ArrayList<customer> getAll() {
        return customers;
    }
}
