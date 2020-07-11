package com.pbilton.userDatabase;

import java.util.ArrayList;
import java.util.Scanner;

public class searchBaseClass {
    private static Scanner scanner = new Scanner(System.in);

    public static void searchMenu(Repository<customer> customerRepository){
        searchInitiate(customerRepository);
    }

    private static void searchInitiate(Repository<customer> customerRepository) {
        customerRepository.getAll();
        int searchMenu = searchDatabaseOption();
        if (searchMenu != 9) {
            if (searchMenu == 1)
                viewAll(customerRepository);
            if (searchMenu == 2)
                searchCompleteDataBase(customerRepository);
            if (searchMenu == 3)
                searchByID(customerRepository);
            if (searchMenu == 4)
                searchByName(customerRepository);
            if (searchMenu == 5)
                searchByEmail(customerRepository);
            if (searchMenu == 6)
                searchByCompany(customerRepository);
            if (searchMenu == 7)
                removeCustomer(customerRepository);
            if (searchMenu == 8) {
                viewRemovedCustomer(customerRepository);
            }
            searchInitiate(customerRepository);
        }
    }

    private static int searchDatabaseOption(){
        System.out.println();
        System.out.println("1: View all");
        System.out.println("2: Search complete database");
        System.out.println("3: Search by ID");
        System.out.println("4: Search by name");
        System.out.println("5: Search by email");
        System.out.println("6: Search by company");
        System.out.println("7: Remove customer");
        System.out.println("8: View removed customers");
        System.out.println("9: Return to main menu");
        int value = scanner.nextInt();
        System.out.println();
        return value;
    }

    private static void viewAll(Repository<customer> customerRepository) {
        ArrayList<customer> results = customerRepository.search("displayAll",null);

        int value = noRecordsFound(results);
        if (value == 0) return;
        
        for (customer c : results)
            System.out.println(c.toString());
    }

    private static void searchCompleteDataBase(Repository<customer> customerRepository) {
        System.out.println("Search term: ");
        String searchTerm = scanner.next();

        ArrayList<customer> results = customerRepository.search("complete", searchTerm);

        int value = noRecordsFound(results);
        if (value == 0) return;

        for (customer c : results)
            System.out.println("Result: " + c.toString());
    }

    private static void searchByID(Repository<customer> customerRepository) {
        System.out.println("Please enter ID number: ");
        String searchTerm = scanner.next();

        ArrayList<customer> results = customerRepository.search("ID", searchTerm);

        int value = noRecordsFound(results);
        if (value == 0) return;

        for (customer c : results)
            System.out.println("Result: " + c.toString());
    }

    private static void searchByName(Repository<customer> customerRepository) {
        System.out.println("Please enter name: ");
        String searchTerm = scanner.next();

        ArrayList<customer> results = customerRepository.search("name", searchTerm);

        int value = noRecordsFound(results);
        if (value == 0) return;

        for (customer c : results)
            System.out.println("Result: " + c.toString());
    }

    private static void searchByEmail(Repository<customer> customerRepository) {
        System.out.println("Please enter email: ");
        String searchTerm = scanner.next();

        ArrayList<customer> results = customerRepository.search("email", searchTerm);

        int value = noRecordsFound(results);
        if (value == 0) return;

        for (customer c : results)
            System.out.println("Result: " + c.toString());
    }

    private static void searchByCompany(Repository<customer> customerRepository) {
        System.out.println("Please enter company: ");
        String searchTerm = scanner.next();

        ArrayList<customer> results = customerRepository.search("company", searchTerm);

        int value = noRecordsFound(results);
        if (value == 0) return;

        for (customer c : results)
            System.out.println("Result: " + c.toString());
    }

    private static void removeCustomer(Repository<customer> customerRepository) {
        System.out.println("Enter the ID of the customer you want to remove:");
        String searchTerm = scanner.next();

        ArrayList<customer> results = customerRepository.search("ID", searchTerm);

        int value = noRecordsFound(results);
        if (value == 0) return;


        for (customer c : results) {
            System.out.println("Customer to remove: " + c.toString());
            System.out.println("Y or N:");
            String confirm = scanner.next().toLowerCase();
            if (confirm.equals("y")) {
                customerRepository.remove(c);
            }
        }
    }
    private static void viewRemovedCustomer(Repository<customer> customerRepository) {
        ArrayList<customer> results = customerRepository.search("softDelete", null);

        int value = noRecordsFound(results);
        if (value == 0) return;

        for (customer c : results)
            System.out.println("Result: " + c.toString());
    }

    private static int noRecordsFound(ArrayList<customer> results){
        int resultsArraySize = results.size();

        if (resultsArraySize == 0) {
            System.out.println("No results found");;
            return resultsArraySize;
        }
        return resultsArraySize;
    }
}


