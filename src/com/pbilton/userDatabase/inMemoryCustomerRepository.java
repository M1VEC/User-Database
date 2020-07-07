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
    public ArrayList<customer> getAll() {
        return customers;
    }

    @Override
    public ArrayList<customer> search(String criteria, String searchTerm) {
        ArrayList<customer> results = new ArrayList<>();

        if (criteria == "displayAll") {
            for (customer c : customers) {
                if (c.softDelete == false)
                    results.add(c);
            }

        } else if (criteria == "name") {
            for (customer c : customers){
                if ((c.getName().contains(searchTerm)) && (c.softDelete==false))
                    results.add(c);
            }

        } else if (criteria == "ID") {
            int searchTermInt = Integer.parseInt(searchTerm);
            for (customer c : customers){
                if ((c.getID() == searchTermInt) && (c.softDelete==false))
                    results.add(c);
            }

        } else if (criteria == "email") {
            for (customer c : customers){
                if ((c.getEmail().contains(searchTerm)) && (c.softDelete==false))
                    results.add(c);
            }

        } else if (criteria == "company") {
            for (customer c : customers){
                if ((c.getCompany().contains(searchTerm)) && (c.softDelete==false))
                    results.add(c);
            }

        } else if (criteria == "complete") {
            for (customer c : customers){
                if ((c.toString().contains(searchTerm)) && (c.softDelete==false))
                    results.add(c);
            }

        } else if (criteria == "softDelete") {
            for (customer c : customers){
                if (c.softDelete==true)
                    results.add(c);
            }
        }
        return results;
    }

    @Override
    public ArrayList<customer> remove(String criteria, int removeID) {
        ArrayList<customer> removeResults = new ArrayList<>();

        for (customer c : customers) {
            if ((c.getID() == removeID) && (c.softDelete == false)) {
                    c.softDelete = true;
                    removeResults.add(c);
                    break;
            }
        }
        return removeResults;
    }
}




