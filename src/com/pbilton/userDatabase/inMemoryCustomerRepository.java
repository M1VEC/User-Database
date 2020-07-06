package com.pbilton.userDatabase;

import java.util.ArrayList;
import java.util.Scanner;

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
            int arraySize = customers.size();
            for (int index = 0; index < arraySize; index++) {
                if (customers.get(index).softDelete == false) {
                    results.add(customers.get(index));gi
                }
            }

        } else if (criteria == "name") {
            int arraySize = customers.size();
            for (int index = 0; index < arraySize; index++) {
                if ((customers.get(index).getName().contains(searchTerm)) && (customers.get(index).softDelete == false)) {
                    results.add(customers.get(index));
                }
            }

        } else if (criteria == "ID") {
            int arraySize = customers.size();
            int searchTermInt = Integer.parseInt(searchTerm);
            for (int index = 0; index < arraySize; index++) {
                if (customers.get(index).getID() == searchTermInt && (customers.get(index).softDelete == false)) {
                    results.add(customers.get(index));
                }
            }

        } else if (criteria == "email") {
            int arraySize = customers.size();
            for (int index = 0; index < arraySize; index++) {
                if ((customers.get(index).getEmail().contains(searchTerm)) && (customers.get(index).softDelete == false)) {
                    results.add(customers.get(index));
                }
            }

        } else if (criteria == "company") {
            int arraySize = customers.size();
            for (int index = 0; index < arraySize; index++) {
                if ((customers.get(index).getCompany().contains(searchTerm)) && (customers.get(index).softDelete == false)) {
                    results.add(customers.get(index));
                }
            }

        } else if (criteria == "complete") {
            int arraySize = customers.size();
            for (int index = 0; index < arraySize; index++) {
                if ((customers.get(index).toString().contains(searchTerm)) && (customers.get(index).softDelete == false)) {
                    results.add(customers.get(index));
                }
            }

        } else if (criteria == "softDelete") {
            int arraySize = customers.size();
            for (int index = 0; index < arraySize; index++) {
                if (customers.get(index).softDelete == true) {
                    results.add(customers.get(index));
                }
            }
        }
        return results;
    }

    @Override
    public ArrayList<customer> remove(String criteria, int removeID) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<customer> results = new ArrayList<>();
        int arraySize = customers.size();
        for (int index = 0; index < arraySize; index++) {
            if ((customers.get(index).getID() == removeID) && (customers.get(index).softDelete == false)) {
                System.out.println("Customer to remove: " + customers.get(index).toString());
                System.out.println("Y or N:");
                String confirm = scanner.next().toLowerCase();
                if (confirm.equals("y")) {
                    customers.get(index).softDelete = true;
                    results.add(customers.get(index));
                    break;
                }
            }
        }
        return results;
    }
}




