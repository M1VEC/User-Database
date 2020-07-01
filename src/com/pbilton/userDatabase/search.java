package com.pbilton.userDatabase;

import java.util.ArrayList;
import java.util.Scanner;

public class search {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayAll(ArrayList<customer> customers) {
        int arraySize = customers.size();
        for (int index = 0; index < arraySize; index++) {
            System.out.println(customers.get(index));
        }
        System.out.println();
        userInterface.searchInitiate(customers);
    }

    public static void searchDataBase(ArrayList<customer> customers) { //Search all instances of database
        System.out.println("Please enter a search term");
        String searchTerm = scanner.next();
        System.out.println("Searching complete array for: " + searchTerm);
        int arraySize = customers.size();
        for (int index = 0; index < arraySize; index++) {
            boolean search = customers.get(index).print().contains(searchTerm);
            if (search == true) {
                int foundIndex = index;
                System.out.println("Result: " + customers.get(foundIndex).print());
            }
        }
        System.out.println();
        userInterface.searchInitiate(customers);
    }
}
