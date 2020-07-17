package com.pbilton.userDatabase;

import java.util.ArrayList;

public class inMemoryCustomerRepository implements Repository<customer> {
    private ArrayList<customer> customers;

    public inMemoryCustomerRepository(ArrayList<customer> customers) {
        this.customers = customers;
    }

    @Override
    public void add(customer c) {
        this.customers.add(c);
    }

    @Override
    public void remove(customer c) {
        c.softDelete = true;
    }

    @Override
    public ArrayList<customer> getAll() {
        return customers;
    }

    @Override
    public ArrayList<customer> search(String criteria, String searchTerm) {
        ArrayList<customer> results = new ArrayList<>();

        for (customer c : customers) {
            if (c.softDelete == true)
                continue;

            if (criteria == "displayAll") {
                results.add(c);

            } else if (criteria == "name") {
                if (c.getName().contains(searchTerm))
                    results.add(c);

            } else if (criteria == "ID") {
                int searchTermInt = Integer.parseInt(searchTerm);
                if (c.getID() == searchTermInt)
                    results.add(c);

            } else if (criteria == "email") {
                if (c.getEmail().contains(searchTerm))
                    results.add(c);

            } else if (criteria == "company") {
                if (c.getCompany().contains(searchTerm))
                    results.add(c);

            } else if (criteria == "complete") {
                if (c.toString().contains(searchTerm))
                    results.add(c);

            }
//        else if (criteria == "softDelete") {
//            for (customer c : customers){
//                if (c.softDelete==true)
//                    results.add(c);
//            }
//        }
        }
        return results;
    }
}




