package com.pbilton.userDatabase;

import java.util.ArrayList;
import java.util.Scanner;
//Want to add a user menu to add new user, search user and delete user
//add a test file that adds 10 users
public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<user> users = new ArrayList<>();
        String additionalUser = " ";
            while (!additionalUser.equals("n")) {
                addUser(users);
                System.out.println("Add another user: y or n");
                additionalUser = scanner.next().toLowerCase();
            }

        System.out.println(users.get(0).print());
    }
    private static void addUser(ArrayList<user> users){
        users.add(user.create(getInput("User Name"), getInput("Email"), getInput("Company")));
    }

    private static String getInput(String prompt) {
        System.out.print("Please enter your " + prompt + ":");
        String value = scanner.next();
        return value;
    }
}



