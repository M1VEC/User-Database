package com.pbilton.userDatabase;

import java.util.ArrayList;
import java.util.Scanner;

public class searchInterface {
    private static Scanner scanner = new Scanner(System.in);

    private static int searchDatabaseOption(){
        System.out.println();
        System.out.println("1: View all");
        System.out.println("2: Search complete database");
        System.out.println("3: Search by ID");
        System.out.println("4: Search by name");
        System.out.println("5: Search by email");
        System.out.println("6: Search by company");
        System.out.println("7: Remove customer");
        System.out.println("8: Return to main menu");
        int value = scanner.nextInt();
        System.out.println();
        return value;
    }

    public static void searchInitiate(ArrayList<customer> customers) {
        int searchMenu = searchDatabaseOption();

        if (searchMenu == 1) {
            displayAll(customers);
            searchInitiate(customers);
        }
        if (searchMenu == 2) {
            searchDataBase(customers);
            searchInitiate(customers);
        }
        if (searchMenu == 3) {
            searchByID(customers);
            searchInitiate(customers);
        }
        if (searchMenu == 4){
            searchByName(customers);
            searchInitiate(customers);
        }
        if (searchMenu == 5){
            searchByEmail(customers);
            searchInitiate(customers);
        }
        if (searchMenu == 6){
            searchByCompany(customers);
            searchInitiate(customers);
        }
        if (searchMenu == 7){
            removeCustomer(customers);
            searchInitiate(customers);
        }
    }

    private static void searchByCompany(ArrayList<customer> customers) {
        System.out.println("Please enter company: ");
        String searchTerm = scanner.next();
        int foundIndex = 0;
        int arraySize = customers.size();
        for (int index = 0; index < arraySize; index++) {
            if (customers.get(index).getCompany().contains(searchTerm)){
                 foundIndex = index;
                System.out.println("Result: " + customers.get(foundIndex).toString());
            }
        }
        if (foundIndex == 0)
            noResultFoundString(searchTerm);
    }

    private static void searchByEmail(ArrayList<customer> customers) {
        System.out.println("Please enter email: ");
        String searchTerm = scanner.next();
        int foundIndex = 0;
        int arraySize = customers.size();
        for (int index = 0; index < arraySize; index++) {
            if (customers.get(index).getEmail().contains(searchTerm)){
                foundIndex = index;
                System.out.println("Result: " + customers.get(foundIndex).toString());
            }
        }
        if (foundIndex == 0)
            noResultFoundString(searchTerm);
    }

    private static void searchByName(ArrayList<customer> customers) {
        System.out.println("Please enter name: ");
        String searchTerm = scanner.next();
        int foundIndex = 0;

        int arraySize = customers.size();
        for (int index = 0; index < arraySize; index++) {
            if (customers.get(index).getName().contains(searchTerm)){
                foundIndex = index;
                System.out.println("Result: " + customers.get(foundIndex).toString());
            }
        }
        if (foundIndex == 0)
            noResultFoundString(searchTerm);
    }

    private static void searchByID(ArrayList<customer> customers) {
        System.out.println("Please enter ID number: ");
        int searchTerm = scanner.nextInt();
        int foundIndex = 0;
        int arraySize = customers.size();
        for (int index = 0; index < arraySize; index++) {
            if (customers.get(index).getID() == searchTerm) {
                foundIndex = index;
                System.out.println("Result: " + customers.get(foundIndex).toString());
            }
        }
        if (foundIndex == 0)
            noResultFoundInt(searchTerm);
    }

    private static void displayAll(ArrayList<customer> customers) {
        int arraySize = customers.size();
        for (int index = 0; index < arraySize; index++) {
            System.out.println(customers.get(index));
        }
    }

    private static void searchDataBase(ArrayList<customer> customers) { //Search all instances of database
        System.out.println("Search term: ");
        String searchTerm = scanner.next();

        int arraySize = customers.size();
        for (int index = 0; index < arraySize; index++) {
            boolean search = customers.get(index).toString().contains(searchTerm);
            if (search == true) {
                int foundIndex = index;
                System.out.println("Result: " + customers.get(foundIndex).toString());
            }
        }
    }

    public static void removeCustomer(ArrayList<customer> customers){
        System.out.println("Enter the ID of the customer you want to remove:");
        int removeID = scanner.nextInt();
        System.out.println();
        int foundIndex = 0;

        int arraySize = customers.size();
        for (int index = 0; index < arraySize; index++) {
            if (customers.get(index).getID() == removeID) {
                foundIndex = index;
                System.out.println("Customer to remove: " + customers.get(foundIndex).toString());
                System.out.println("Y or N:");
                String confirm = scanner.next().toLowerCase();
                if (confirm.equals("y"))
                    customers.remove(foundIndex);
                break;
            }
        }
        if (foundIndex == 0)
            noResultFoundInt(removeID);
    }

    private static void noResultFoundString(String searchTerm){
        System.out.println("No results for " + searchTerm + " found");
        System.out.println("Please try another term");
    }

    private static void noResultFoundInt(int searchTerm){
        System.out.println("No results for " + searchTerm + " found");
        System.out.println("Please try another term");
    }
}

