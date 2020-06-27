package com.pbilton.userDatabase;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<user> users = new ArrayList<>();

        users.add(user.create(getInput("User Name"), getInput("Email"), getInput("Company")));
        users.add(user.create(getInput("User Name"), getInput("Email"), getInput("Company")));

        System.out.println(users.get(0).print());
        System.out.println(users.get(1).print());
    }

    private static String getInput(String prompt) {
        System.out.print("Please enter your " + prompt + ":");
        String value = scanner.next();
        return value;
    }
}



